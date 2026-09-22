package JavaPrograms;

import java.util.Scanner;

public class Pattern_15 {

    public static void main(String[] args) {

        int rows;

        System.out.println("Enter NO.Of Rows ?");

        Scanner sc = new Scanner(System.in);

        rows = sc.nextInt();


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }


            System.out.println();
        }
    }
}
