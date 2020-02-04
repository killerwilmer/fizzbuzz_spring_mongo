package com.intraway.fizzbuzz.repository;

import com.intraway.fizzbuzz.model.ResponseFizzBuzz;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FizzbuzzRepository extends MongoRepository<ResponseFizzBuzz, String> {}
