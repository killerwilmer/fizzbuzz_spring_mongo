package com.intraway.fizzbuzz.controller;

import org.apache.commons.lang3.StringUtils;

public class FizzBuzz {

  public static String description;
  private static boolean fizz;
  private static boolean buzz;

  public static String getOutput(int min, int max) {
    String result = "";
    fizz = false;
    buzz = false;

    for (int i = min; i <= max; i++) {
      if (((i % 3) == 0) && ((i % 5) == 0)) {
        result += "FizzBuzz";
      } else if ((i % 3) == 0) {
        result += "Fizz";
        fizz = true;
      } else if ((i % 5) == 0) {
        result += "Buzz";
        buzz = true;
      } else result += i;

      result += ",";
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

    return StringUtils.removeEnd(result, ",");
  }
}
