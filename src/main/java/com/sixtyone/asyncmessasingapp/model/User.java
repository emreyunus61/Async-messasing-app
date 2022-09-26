package com.sixtyone.asyncmessasingapp.model;

import com.sixtyone.asyncmessasingapp.dtos.UserDto;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Table("sixty_one_app_table_first")
@Getter
@Setter
public class User extends  GenericModel<User, UserDto> {

    @PrimaryKey
    @Column
    private int id;
    @Column private String name;
    @Column private String surname;
    @Column private List<Integer> followerList = new ArrayList<>();
    @Column private Timestamp createdAt;


    @Override
    public void mapFromCorrespondingDTO(UserDto dtoObject) {

        BeanUtils.copyProperties(dtoObject,this);

    }

}
