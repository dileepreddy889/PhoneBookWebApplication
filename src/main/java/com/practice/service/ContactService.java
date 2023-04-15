package com.practice.service;

import com.practice.entity.Contact;

import java.util.List;

public interface ContactService {

    public boolean saveContact(Contact contact);

    public List<Contact> getAllContacts();

    public Contact getContactById(Integer contactId);

    public boolean updateContact(Contact contact);

    public boolean deleteContactById(Integer contactId);



}
