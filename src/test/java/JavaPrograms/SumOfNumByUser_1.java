package JavaPrograms;

import java.util.Scanner;

public class SumOfNumByUser_1 {

   public static void main(String[] args){

       ///SUM OF ENTERED NUMBERS BY  WITH 2 ONLY....

       int num1,num2;

       System.out.println("Enter 1st number ?");

       Scanner sc=new Scanner(System.in);

       num1= sc.nextInt();

       System.out.println("Enter 2nd number ?");


       num2= sc.nextInt();

       System.out.println("sum of the number is :"+(num1 + num2));


      ///COUNT OF NUMBERS BY USER ENTERED FROM CONSOLE WITH MULTIPLE NUM'S ON LOOP....

       int count;

       System.out.println("enter count of numbers:");

      count=sc.nextInt();

      System.out.println("enter those "+count+" numbers:");

      int number,sum=0;

      for (int i=0;i<count;i++){

            number=sc.nextInt();

            sum=sum+number;


      }
      System.out.println("Sum of count is:" +sum);



      System.out.println("enter User ID  and age and salary ?");


       int UserID=sc.nextInt();



       int age=sc.nextInt();



       double salary=sc.nextDouble();

       //Output input by user

       System.out.println("User ID: " +UserID );

       System.out.println("User Age: " +age );

       System.out.println("User salary: " +salary);













   }


}
