package com.sixtyone.asyncmessasingapp.dtos;

import lombok.Data;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;


@Data
public class UserDto {


    private int id;
    private String name;
    private String surname;
    private List<Integer> followerList = new ArrayList<>();
    private Timestamp createdAt;



}
