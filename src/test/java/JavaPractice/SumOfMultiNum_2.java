package JavaPractice;

import java.util.Scanner;

public class SumOfMultiNum_2 {
    
    public static void main(String[] args){
        
        System.out.println("Enter count of the numbers ?");
        
        Scanner sc=new Scanner(System.in);
        
        int count=sc.nextInt();

        int sum=0;

        for(int i=1;i<=count;i++)
        {
            int number=sc.nextInt();

            sum=sum+number;
        }

        System.out.println("the count of numbers sum is : " +sum );
    }
}
