package com.practice.service;

import com.practice.entity.Contact;
import com.practice.repository.ContactRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactServiceImpl implements ContactService {

    private ContactRepository contactRepository;

    @Override
    public boolean saveContact(Contact contact) {
        Contact savedObj = contactRepository.save(contact);
        return savedObj.getContactId() != null;
    }

    @Override
    public List<Contact> getAllContacts() {
        List<Contact> allContacts = contactRepository.findAll();
        return allContacts;
    }

    @Override
    public Contact getContactById(Integer contactId) {
        Optional<Contact> findByIt = contactRepository.findById(contactId);
        if (findByIt.isPresent()) {
            return findByIt.get();
        }
        return null;
    }

    @Override
    public boolean updateContact(Contact contact) {
        try {
            Contact save = contactRepository.save(contact);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean deleteContactById(Integer contactId) {
        try {
            contactRepository.deleteById(contactId);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
