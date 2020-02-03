package com.intraway.fizzbuzz.controller;

import org.junit.jupiter.api.Test;

import com.intraway.fizzbuzz.model.ResponseFizzBuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

  @Test
  public void test_return_fizz_when_number_is_divisible_by_3_numbers_1_to_3() {

    FizzBuzz fizzBuzz = new FizzBuzz();
    ResponseFizzBuzz responseFizzBuzz = fizzBuzz.getListNumbers(1, 3);
    assertEquals(responseFizzBuzz.getDescription(), "se encontraron múltiplos de 3");
  }

  @Test
  public void test_return_fizz_buzz_when_number_is_divisible_by_3_and_5_numbers_1_to_6() {

    FizzBuzz fizzBuzz = new FizzBuzz();
    ResponseFizzBuzz responseFizzBuzz = fizzBuzz.getListNumbers(1, 6);
    assertEquals(responseFizzBuzz.getDescription(), "se encontraron múltiplos de 3 y de 5");
  }

  @Test
  public void test_return_buzz_when_number_is_divisible_by_5_numbers_5_to_5() {

    FizzBuzz fizzBuzz = new FizzBuzz();
    ResponseFizzBuzz responseFizzBuzz = fizzBuzz.getListNumbers(5, 5);
    assertEquals(responseFizzBuzz.getDescription(), "se encontraron múltiplos de 5");
  }

  @Test
  public void test_return_bad_request_when_first_number_is_greater_that_last_number_numbers_6_to_3() {

    FizzBuzz fizzBuzz = new FizzBuzz();
    ResponseFizzBuzz responseFizzBuzz = fizzBuzz.getListNumbers(6, 3);
    assertEquals(responseFizzBuzz.getMessage(), "Los parámetros enviados son incorrectos");
  }
}
