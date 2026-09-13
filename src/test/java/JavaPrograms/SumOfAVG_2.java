package JavaPrograms;

import java.util.Scanner;

public class SumOfAVG_2 {

    public static void main(String[] args){
        int count ;
        System.out.println("Enter Count of Numbers ?");
        Scanner sc=new Scanner(System.in);
        count=sc.nextInt();

        int number ,sum=0;
        float average=0;
        for(int i=0;i<count;i++){
            number=sc.nextInt();
            sum=sum+number;

        }
        average=sum/count;

        System.out.println("the sum of the numbers :" +sum);
        System.out.println("the numbers of avg is:" +average);


    }






}
