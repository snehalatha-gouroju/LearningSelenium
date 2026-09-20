package JavaPrograms;

import java.util.Scanner;

public class ReverseNumber {


    public static void main(String[] args){

        System.out.println("Enter any Number ?");

        Scanner sc=new Scanner(System.in);

        int number=sc.nextInt();

        int res=0;

        while( number > 0) {

            int LastDigit = number % 10;


            res = res * 10 +  LastDigit;

            number = number / 10 ;
        }

        System.out.println("The Reverse Number Is : " +res);
}
