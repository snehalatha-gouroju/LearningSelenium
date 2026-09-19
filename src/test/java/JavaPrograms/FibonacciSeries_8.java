package JavaPrograms;

import java.util.Scanner;

public class FibonacciSeries_8 {

    public static void main(String[] args){
    System.out.println("Enter any number ?");
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

         int firstNum=0; int secondNum=1;

        for(int i=0;i<n;i++)
        {

            System.out.print(firstNum +",");
            int nextNum = firstNum + secondNum;

            firstNum=secondNum;
            secondNum=nextNum;
        }


    }
}
