package com.github.amsdec;

public class FizzBuzz {

    public String convert(final int number) {
        String result = "";

        if (this.isMultipleOfThree(number)) {
            result = "Fizz";
        }

        if (this.idMultipleOfFive(number)) {
            result += "Buzz";
        }

        return result.isEmpty() ? String.valueOf(number) : result;
    }

    private boolean isMultipleOfThree(final int number) {
        return number % 3 == 0;
    }

    private boolean idMultipleOfFive(final int number) {
        return number % 5 == 0;
    }

}
