package com.iokeanos.spring.service;

import java.util.List;

public interface ContactService {
	public List getContactList();

	public Contact getContact(int contactId);

	public void insertContact(Contact contact);

	public void updateContact(Contact contact);

	public void deleteContact(int contactId);
	
	public void echo();
}
