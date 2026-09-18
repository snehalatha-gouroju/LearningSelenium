package JavaPrograms;

import java.util.Scanner;

public class PrimeNum_6 {


    public static void main(String[] args){
      int flag=0;
        System.out.println("Enter any number ?");
        Scanner sc=new Scanner(System.in);
        int number =sc.nextInt();

        if(number ==0 || number ==1)
        {
            System.out.println("the number9 is not prime number:");

        }
        else{
            int middleNum =number/2;  //8-->8/2=4
            for(int i=2;i<=middleNum;i++)  //true
            {
                if (number % i == 0)
                {
                    System.out.println(number + " is not prime number.");
                    flag=1;
                    break;
                }
            }
            if(flag == 0){
                System.out.println(number + " is prime number.");
            }
        }








    }
}
