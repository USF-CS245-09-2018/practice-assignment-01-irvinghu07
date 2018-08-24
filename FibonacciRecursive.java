package edu.usfca.cs.cs245.classRequired;

import edu.usfca.cs.cs245.Fibonacci;

public class FibonacciRecursive implements Fibonacci {

//    private static int firstNum = 1;
//
//    private static int secondNum = 1;

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
//        int firstNum, secondNum = 1;
        if (n == 1) {
            return 1;
        }
        if (n == 0){
            return 0;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
