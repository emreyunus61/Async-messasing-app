package com.sixtyone.asyncmessasingapp.repositoriess;


import com.sixtyone.asyncmessasingapp.model.User;
import org.springframework.data.cassandra.repository.CassandraRepository;



public interface UserRepository extends CassandraRepository<User, Integer> {
}
