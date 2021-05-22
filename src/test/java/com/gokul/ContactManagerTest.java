package com.gokul;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactManagerTest {

    @Test
    @DisplayName("Should create contact")
    public void shouldCreateContact() {
        ContactManager contactManager = new ContactManager();
        contactManager.addContact("John", "Doe", "0123456789");
        assertFalse(contactManager.getAllContacts().isEmpty());
        assertEquals(1, contactManager.getAllContacts().size());
    }

    @Test
    @DisplayName("check first-name error")
    public void shouldNotCreateContactWhenFirstNameIsNull(){
        ContactManager contactManager=new ContactManager();
        Assertions.assertThrows(RuntimeException.class,()->{
            contactManager.addContact(null,"goku","0123456789");
        });
    }

    @Test
    @DisplayName("check last-name error")
    public void shouldNotCreateContactWhenLastNameIsNull(){
        ContactManager contactManager=new ContactManager();
        Assertions.assertThrows(RuntimeException.class,()->{
            contactManager.addContact("gok",null,"0123456789");
        });
    }

    @Test
    @DisplayName("Check the phone number is not null")
    public void shouldNotCreateContactIfPhoneError(){
        ContactManager contactManager=new ContactManager();
        Assertions.assertThrows(RuntimeException.class,()->{
            contactManager.addContact("goku","nair",null);
        });
    }



}