package JavaPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FindSumOfNnum_5 {

    public static void main(String[] args) throws IOException {
     int n;
        System.out.println("Enter N value ?");

        //Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

         n=Integer.parseInt(br.readLine());



        int sum = (n * (n + 1)) / 2;

        System.out.println("the sum of n numbers :" +sum);
    }
}
