package com.example.tasktracker.repository;

import com.example.tasktracker.entity.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

public interface UserRepository extends ReactiveMongoRepository<User, String> {

    @Override
    Flux<User> findAllById(Iterable<String> strings);
}
