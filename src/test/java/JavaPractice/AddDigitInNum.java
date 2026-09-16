package JavaPractice;

import java.util.Scanner;

public class AddDigitInNum {

   public static void main(String[] args){

       System.out.println("Enter any number ?");

       Scanner sc=new Scanner(System.in);

       int sum=0;

       int number=sc.nextInt();

       while(number > 0){

           int lastDigit=number % 10;

           number=number/10;

           sum=sum+lastDigit;
       }

       System.out.println("th digits of sum is:" +sum);

       System.out.println("End The Program");








   }
}
