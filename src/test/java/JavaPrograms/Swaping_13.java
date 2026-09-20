package JavaPrograms;

import java.util.Scanner;

public class Swaping_13 {

    public static void main(String[] args){

        int a ,b ,temp;
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first Number ?");
        
        a = sc.nextInt();

        System.out.println("Enetr Second Number ?");

        b = sc.nextInt();

        temp = a;

        a =  b;

        b = temp;

        System.out.println("the first number is " +a+ " The Secons Number is " +b);

    }
}
