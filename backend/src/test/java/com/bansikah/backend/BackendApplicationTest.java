package com.bansikah.backend;

import com.bansikah.backend.repo.ContactRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@SpringBootTest
public class BackendApplicationTest {

    @Autowired
    private ContactRepository contactRepository; // Inject any bean from your application context

}
