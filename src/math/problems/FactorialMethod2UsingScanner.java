package math.problems;

import java.util.Scanner;

public class FactorialMethod2UsingScanner {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Value between 1 to 20, for Factorial Calculation: ");


        // Numerical input
        Long x= myObj.nextLong();
        if(x > 20) {
            System.out.println("Value "+x+" out of range for Factorial Calculation: ");
            return;
        }

        System.out.println("Factorial(by Recursion) of "+x+" is = "+factorial(x));

        long  ftrl=1;
        for(int i =1; i<=x;i++){
            ftrl=ftrl*i;
        }
        System.out.println("Factorial(by Iteration) of "+x+" is = "+ftrl);

    }

    public static Long factorial(Long x){
        if(x == 1 ) return 1L;
        return (x * factorial(x -1));
    }
}

