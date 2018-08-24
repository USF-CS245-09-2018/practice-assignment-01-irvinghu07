package edu.usfca.cs.cs245.classRequired;

import edu.usfca.cs.cs245.Factorial;

public class FactorialIterative implements Factorial {
    /**
     * This is the factorial function, which calculates n!
     * n! = n * (n-1)! (recursive) -OR- n! = n * (n-1) * (n-2) * ... * 1 (iterative)
     *
     * @param n
     * @return n!
     */
    @Override
    public int factorial(int n) {
        if (n < 1 || n == 1) {
            return 1;
        }
        int result = 1;
        for (; n >= 1; n--) {
            result *= n;
        }
        return result;
    }
}
