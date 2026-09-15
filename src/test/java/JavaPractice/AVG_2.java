package JavaPractice;

import java.util.Scanner;

public class AVG_2 {

    public static void main(String[] args){

        System.out.println("Enter 1st Number ?");

        Scanner sc=new Scanner(System.in);

        int first=sc.nextInt();

        System.out.println("Enter second number ?");



        int second =sc.nextInt();

        int avg=(first + second)/2;

        System.out.println("the avarage of two numbers :" +avg);


    }
}
