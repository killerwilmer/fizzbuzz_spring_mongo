package com.intraway.fizzbuzz.controller;

import com.intraway.fizzbuzz.model.ResponseFizzBuzz;
import com.mongodb.MongoClient;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Level;
import java.util.logging.Logger;

import static com.intraway.fizzbuzz.util.Constants.API_URL;
import static com.intraway.fizzbuzz.util.Constants.END_POINT_fIZZ_BUZZ;

@RestController
@RequestMapping(API_URL)
public class FizzbuzzController {

  private final Logger logger = Logger.getLogger(this.getClass().getName());

  final MongoClient mongoClient;

  public FizzbuzzController(MongoClient mongoClient) {
    this.mongoClient = mongoClient;
  }

  @GetMapping(END_POINT_fIZZ_BUZZ + "{min}/{max}")
  @ResponseBody
  public ResponseFizzBuzz getFizzBuzz(@PathVariable int min, @PathVariable int max) {

    ResponseFizzBuzz responseFizzBuzz = FizzBuzz.getOutput(min, max);

    logger.log(Level.INFO, "First database name: {0}", mongoClient.listDatabaseNames().first());

    return responseFizzBuzz;
  }
}
