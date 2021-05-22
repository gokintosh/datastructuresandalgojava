package com.gokul;

public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;


    public Contact(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void validateFirstName(){
        if(this.firstName.isEmpty())
            throw new RuntimeException("FirstName cannot be empty");
    }

    public void validateLastName(){
        if(this.lastName.isEmpty()){
            throw new RuntimeException("LastName cannot be empty");
        }
    }

    public void validatePhoneNumber(){
        if(this.phoneNumber.isEmpty()){
            throw new RuntimeException("Phone number cannot be blank");
        }
        if(this.phoneNumber.length()!=10)
            throw new RuntimeException("Phone number should be 10 digits length");

        if(!this.phoneNumber.matches("\\d+"))
            throw new RuntimeException("Phone numbers contain only digits");

        if(!this.phoneNumber.startsWith("0"))
            throw new RuntimeException("Phone number should start with 0");
    }
}
