package com.sixtyone.asyncmessasingapp;

import com.sixtyone.asyncmessasingapp.model.User;
import com.sixtyone.asyncmessasingapp.repositoriess.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AsyncMessasingAppApplicationTests {

    @Autowired
    UserRepository repository;

    @Test
    void contextLoads() {
        User user = new User();
        user.setName("Yunus_61");
        repository.save(user);
    }

}
