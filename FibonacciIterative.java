package edu.usfca.cs.cs245.classRequired;

import edu.usfca.cs.cs245.Factorial;
import edu.usfca.cs.cs245.Fibonacci;

public class FibonacciIterative implements Fibonacci {

    /**
     * The factorial function calculates fib(n), where:
     * fib(0) = 0; fib(1) = 1 ... and otherwise:
     * fib(n) = fib(n-1) + fib(n-2)
     *
     * @param n
     * @return fib(n) as defined above.
     */
    @Override
    public int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int firstNum = 1;
        int secondNum = 1;
        int newSum = 0;
        for (int i = 2; i < n; i++) {
            newSum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = newSum;
        }
        return newSum;
    }
}
