package com.intraway.fizzbuzz.controller;

import com.intraway.fizzbuzz.model.ResponseFizzBuzz;
import com.intraway.fizzbuzz.repository.FizzbuzzRepository;
import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Level;
import java.util.logging.Logger;

import static com.intraway.fizzbuzz.util.Constants.API_URL;
import static com.intraway.fizzbuzz.util.Constants.END_POINT_fIZZ_BUZZ;

@RestController
@RequestMapping(API_URL)
public class FizzbuzzController {

  final
  FizzbuzzRepository repository;

  final MongoClient mongoClient;

  public FizzbuzzController(MongoClient mongoClient, FizzbuzzRepository repository) {
    this.mongoClient = mongoClient;
    this.repository = repository;
  }

  @GetMapping(END_POINT_fIZZ_BUZZ + "{min}/{max}")
  @ResponseBody
  public ResponseFizzBuzz getFizzBuzz(@PathVariable int min, @PathVariable int max) {

    ResponseFizzBuzz responseFizzBuzz = FizzBuzz.getOutput(min, max);

    repository.save(responseFizzBuzz);

    return responseFizzBuzz;
  }
}
