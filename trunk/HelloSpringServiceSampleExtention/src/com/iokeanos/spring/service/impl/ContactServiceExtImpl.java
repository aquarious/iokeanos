package com.iokeanos.spring.service.impl;

import java.util.List;

import com.iokeanos.spring.service.Contact;
import com.iokeanos.spring.service.ContactService;


public class ContactServiceExtImpl implements ContactService {

	@Override
	public void deleteContact(int contactId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void echo() {
		
		System.out.println("\n\n\n echo echo .... from service extesion, what else do you want ?");
		
	}

	@Override
	public Contact getContact(int contactId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getContactList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertContact(Contact contact) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateContact(Contact contact) {
		// TODO Auto-generated method stub
		
	}

}
