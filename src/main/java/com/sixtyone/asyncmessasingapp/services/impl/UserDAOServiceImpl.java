package com.sixtyone.asyncmessasingapp.services.impl;

import com.sixtyone.asyncmessasingapp.model.User;
import com.sixtyone.asyncmessasingapp.repositoriess.UserRepository;
import com.sixtyone.asyncmessasingapp.services.UserDAOService;
import com.sixtyone.asyncmessasingapp.dtos.UserDto;
import org.springframework.stereotype.Repository;

import java.util.logging.Logger;

@Repository
public class UserDAOServiceImpl  implements UserDAOService {

    private UserRepository repository;
    private static final Logger LOGGER = Logger.getLogger(UserDAOServiceImpl.class.getName());

    public UserDAOServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public void insertNewUser(UserDto userDTO) {
        LOGGER.info("Inserting new User to DB");
        User userToBeSaved = new User();
        userToBeSaved.mapFromCorrespondingDTO(userDTO);
        repository.save(userToBeSaved);
    }

}
