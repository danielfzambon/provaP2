package com.example.accessingdatamysql.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.accessingdatamysql.DTO.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
