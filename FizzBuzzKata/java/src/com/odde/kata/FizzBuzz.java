package com.odde.kata;

public class FizzBuzz {
    public static String show(int number) {

        String result = number % 3 == 0 || String.valueOf(number).contains("3")? "Fizz": "";

            result += (number % 5 == 0 || String.valueOf(number).contains("5")) ? "Buzz": "";

        return (result.equals("")) ? String.valueOf(number) :result;
    }
}