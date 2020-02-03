package com.intraway.fizzbuzz.controller;

import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/intraway/api/")
public class FizzbuzzController {

  private final AtomicLong counter = new AtomicLong();

  @GetMapping("/fizzbuzz/{min}/{max}")
  @ResponseBody
  public ResponseFizzBuzz getFizzBuzz(@PathVariable int min, @PathVariable int max) {

    String list = FizzBuzz.getOutput(min, max);
    Long code = counter.incrementAndGet();
    String description = FizzBuzz.description;
    Long timestamp = new Timestamp(System.currentTimeMillis()).getTime();

    return new ResponseFizzBuzz(code, list, description, timestamp);
  }
}
