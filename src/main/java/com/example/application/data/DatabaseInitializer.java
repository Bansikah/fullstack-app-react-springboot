package com.example.application.data;

import org.springframework.boot.CommandLineRunner;

public class DatabaseInitializer implements CommandLineRunner {
    private final ContactRepository contactRepository;

   public DatabaseInitializer(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        contactRepository.save(new Contact(1,"John", "Smith", "john.smith@example.com", "6755436"));
        contactRepository.save(new Contact(2,"Doe", "Smith", "doe.smith@example.com", "6755436"));
          }
}
