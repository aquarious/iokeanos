package com.iokeanos.spring.service.impl;

import java.util.List;

import com.iokeanos.spring.service.Contact;
import com.iokeanos.spring.service.ContactService;

public class ContactServiceImpl implements ContactService {
    public Contact getContact(int contactId) {
        System.out.println("Inside ContactDAOImpl.getContact()");
        return null;
    }

	public void deleteContact(int contactId) {
		System.out.println("deleteContact(int contactId)");
		
	}

	public List getContactList() {
		System.out.println("getContactList()");
		return null;
	}

	public void insertContact(Contact contact) {
		System.out.println("insertContact(Contact contact)");
		
	}

	public void updateContact(Contact contact) {
		System.out.println("updateContact(Contact contact)");
		
	}
}