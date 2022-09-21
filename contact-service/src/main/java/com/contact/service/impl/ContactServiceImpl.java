package com.contact.service.impl;

import com.contact.entity.Contact;
import com.contact.service.ContactService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    // dummy contacts
    List<Contact> contacts = List.of(
            new Contact(1L, "nirmal97@gmail.com", "Nirmal Silwal", 100L),
            new Contact(2L, "saugat44@mail.com", "Saugat Pageni", 100L),
            new Contact(3L, "asis2@mail.com", "Asis Pokrel", 200L),
            new Contact(4L, "dinesh123@hotmail.com", "Dinesh Sarma", 300L)
    );

    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return this.contacts.stream()
                .filter(u -> u.getUserId().equals(userId))
                .collect(Collectors.toList());
    }
}
