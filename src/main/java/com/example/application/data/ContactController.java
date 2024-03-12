package com.example.application.data;





import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/contacts")
public class ContactController {

    private final ContactRepository contactRepository;

    public ContactController(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @GetMapping
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    @GetMapping("/{id}")
    public Contact getContactById(@PathVariable("id") Integer id) {
        return contactRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Contact createContact(@RequestBody Contact contact) {
        return contactRepository.save(contact);
    }

    @PutMapping("/{id}")
    public Contact updateContact(@PathVariable("id") Integer id, @RequestBody Contact contact) {
        contact.setId(id);
        return contactRepository.save(contact);
    }

    @DeleteMapping("/{id}")
    public void deleteContact(@PathVariable("id") Integer id) {
        contactRepository.deleteById(id);
    }
}
