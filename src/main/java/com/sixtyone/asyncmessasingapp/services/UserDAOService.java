package com.sixtyone.asyncmessasingapp.services;

import com.sixtyone.asyncmessasingapp.dtos.UserDto;
public interface UserDAOService {

    void insertNewUser (UserDto userDTO);
}
