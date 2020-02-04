package com.intraway.fizzbuzz.controller;

import com.intraway.fizzbuzz.model.ResponseFizzBuzz;
import java.sql.Timestamp;
import java.util.concurrent.atomic.AtomicLong;

import org.apache.commons.lang3.StringUtils;

import static com.intraway.fizzbuzz.util.Constants.API_URL;
import static com.intraway.fizzbuzz.util.Constants.END_POINT_fIZZ_BUZZ;

public class FizzBuzz {

  public static String description;
  private static boolean fizz;
  private static boolean buzz;
  private static final AtomicLong counter = new AtomicLong();

  public ResponseFizzBuzz getListNumbers(int min, int max) {

    fizz = false;
    buzz = false;
    ResponseFizzBuzz responseFizzBuzz = new ResponseFizzBuzz();
    responseFizzBuzz.setTimestamp(new Timestamp(System.currentTimeMillis()).getTime());

    if (min > max) {
      responseFizzBuzz.setStatus(400);
      responseFizzBuzz.setError("Bad Request");
      responseFizzBuzz.setException("com.intraway.exceptions.badrequest");
      responseFizzBuzz.setMessage("Los parámetros enviados son incorrectos");
      responseFizzBuzz.setPath(API_URL + END_POINT_fIZZ_BUZZ + min + "/" + max);
      return responseFizzBuzz;
    }

    String numberList = "";
    for (int i = min; i <= max; i++) {
      if (((i % 3) == 0) && ((i % 5) == 0)) {
        numberList += "FizzBuzz";
      } else if ((i % 3) == 0) {
        numberList += "Fizz";
        fizz = true;
      } else if ((i % 5) == 0) {
        numberList += "Buzz";
        buzz = true;
      } else numberList += i;

      numberList += ",";
    }

    if (fizz && buzz) {
      description = "se encontraron múltiplos de 3 y de 5";
    } else if (fizz) {
      description = "se encontraron múltiplos de 3";
    } else if (buzz) {
      description = "se encontraron múltiplos de 5";
    } else {
      description = "no se encontraron múltiplos";
    }

    responseFizzBuzz.setCode(counter.incrementAndGet());
    responseFizzBuzz.setDescription(description);
    responseFizzBuzz.setList(StringUtils.removeEnd(numberList, ","));

    return responseFizzBuzz;
  }
}
