package io.github.dbc;

public class RecursiveFactorialCalculator {
    /**
     * This method calculates the factorial of a number.
     * The method returns 0 for a negative number.
     *
     * @param number the number to calculate the factorial of.
     * @return the factorial of the given number.
     */
    public static int factorial(int number) {
        if (number < 0) {
            return 0;
        }
        if (number == 1 || number == 0) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}
