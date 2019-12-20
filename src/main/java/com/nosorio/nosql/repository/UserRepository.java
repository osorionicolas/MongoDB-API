package com.nosorio.nosql.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nosorio.nosql.models.User;

public interface UserRepository extends MongoRepository<User, String> {
    // 
}