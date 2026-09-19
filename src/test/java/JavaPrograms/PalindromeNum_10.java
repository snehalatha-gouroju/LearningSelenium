package JavaPrograms;

import java.util.Scanner;

public class PalindromeNum_10 {

    public static void main(String[] args){

        int number;
        
        System.out.println("Enter the Number :");
        
        Scanner sc = new Scanner(System.in);
        
        number = sc.nextInt();
        int temp = number;

        int reverseNum = 0;
        while(number > 0)
        {
            int remainder = temp % 10;
            reverseNum = reverseNum * 10 + remainder;
            temp = temp / 10;


        }

        if(number == reverseNum)
            System.out.println("number is palindrome");
        else
            System.out.println("number is not palindrome");
    }

}
