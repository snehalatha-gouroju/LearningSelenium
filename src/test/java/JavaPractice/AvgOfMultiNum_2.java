package JavaPractice;

import java.util.Scanner;

public class AvgOfMultiNum_2 {

    public static void main(String[] args){

        System.out.println("Enter count of numbers ?");

        Scanner sc=new Scanner(System.in);

        int sum=0;

        int avg=0;

        int count=sc.nextInt();

        for(int i=1;i<=count;i++)
        {
            int number=sc.nextInt();

            sum=sum+number;

        }


        avg=sum/count;

    System.out.println("The sum of the count of numbers:" +sum);

    System.out.println("the avg of the count numbers:" +avg);
}

}
