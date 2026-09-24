package JavaPrograms;

import java.util.Scanner;

public class Factorial_9 {

    public static void main(String[] args){

        System.out.println("Enter any number ?");

        Scanner sc = new Scanner(System.in);

        int number =sc.nextInt();

        int results = factorial(number);

        System.out.println("factorial of "  +number +  "is " + results);



    }

    static int factorial(int n)
    {
        if(n==1)
            return 1;
        return n * factorial(n-1);
    }
}
