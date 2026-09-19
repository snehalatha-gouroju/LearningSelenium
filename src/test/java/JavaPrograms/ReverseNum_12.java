package JavaPrograms;

import java.util.Scanner;

public class ReverseNum_12 {

    public static void main(String[] args){

     System.out.println("Enter any number ?");

     Scanner sc=new Scanner(System.in);

     int number =sc.nextInt();

     ////ans=0,number=3,lastDigit=3,asw=0*10+3 LOGIC==3
     ////ans=32,number=2,lastDigit=2,asw=3*10+2 LOGIC ==32
     ////ans=321,number=0,lastDigit=2,asw=3*10+2 LOGIC==321
        int answer=0;

     while(number > 0){

         int  lastDigit =  number % 10;

         answer=answer * 10 + lastDigit;

         number = number/10;


     }

     System.out.println("The given Number of Reversed Number is :" +answer);

    }
}
