package JavaPractice;


import java.util.Scanner;

public class SumOfTwo_1 {

    public static void main(String[] args){
        //int sum=0;
        System.out.println("Enter The FirstNum ?");

         Scanner sc=new Scanner(System.in);

         int firstNum=sc.nextInt();

         System.out.println("Enter The SecondNum ?");

         int SecondNum=sc.nextInt();

        int sum=firstNum + SecondNum;
        System.out.println("The sum of both numbers is :" +sum);

}
}