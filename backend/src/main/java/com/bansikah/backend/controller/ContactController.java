package com.bansikah.backend.controller;

import com.bansikah.backend.entity.Contact;
import com.bansikah.backend.repo.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @GetMapping("get")
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    @PostMapping("post")
    public Contact createContact(@RequestBody Contact contact) {
        return contactRepository.save(contact);
    }


    @PutMapping("/{id}")  // Update route with path variable
    public ResponseEntity<Contact> updateContact(@PathVariable Long id, @RequestBody Contact contact) {
        Optional<Contact> existingContact = contactRepository.findById(id);
        if (existingContact.isPresent()) {
            contact.setId(id);  // Set the id to the contact object
            return new ResponseEntity<>(contactRepository.save(contact), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}") // Delete route with path variable
    public ResponseEntity<Void> deleteContact(@PathVariable Long id) {
        contactRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
