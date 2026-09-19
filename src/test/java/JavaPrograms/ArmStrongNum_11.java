package JavaPrograms;

import java.util.Scanner;

public class ArmStrongNum_11 {


    public static void main(String[] args){

            System.out.println("Enter any number ?");

            Scanner sc=new Scanner(System.in);

            int number=sc.nextInt();

            System.out.println("IS armstrong Number :" +isAemstrong(number));
        }

        static boolean isAemstrong(int n){

            int digits =0 , temp ;

            int sum=0;

            temp =n;

            while(temp > 0){

                temp=temp/10;

                digits++;
            }

            System.out.println("number of digit's :" +digits);

            temp=n;

            while(temp > 0){

                int lastDigit =temp % 10;

                sum= (int) (sum+Math.pow(lastDigit,digits));

                temp=temp /10;

            }

            System.out.println("sum is: " +sum);

            if(sum==n)

                return true;

            return false;
        }
    }
