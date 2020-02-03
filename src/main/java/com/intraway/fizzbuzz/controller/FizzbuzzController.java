package com.intraway.fizzbuzz.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/intraway/api/")
public class FizzbuzzController {

  @GetMapping("/fizzbuzz/{min}/{max}")
  @ResponseBody
  public String getFizzBuzz(@PathVariable int min, @PathVariable int max) {

    return "Min: " + min + " Max: " + max;
  }
}