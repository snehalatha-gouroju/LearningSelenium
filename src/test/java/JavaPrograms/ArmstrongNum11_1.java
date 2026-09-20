package JavaPrograms;

import java.util.Scanner;

public class ArmstrongNum11_1 {

    public static void main(String[] args){

        int n,temp,armstrongNum=0;

        System.out.println("Enter any number ?");

        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int originalNum=n;

        int digits=0; int temp2=0;

        while(n>0){
            temp=n%10;
            temp= (int) Math.pow(temp ,3);
            armstrongNum=armstrongNum + temp;

            n=n/10;
        }
        if(armstrongNum == originalNum)
        {
            System.out.println(originalNum+ " is armstrong Number:");
        }
        else {
            System.out.println(originalNum+ " is not armstrong Number ");
        }
    }
}
