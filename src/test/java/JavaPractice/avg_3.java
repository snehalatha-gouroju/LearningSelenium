package JavaPractice;

import java.util.Scanner;

public class avg_3 {


    public static void main(String[] args) {
        int count;
        System.out.println("Enter Count of Numbers ?");
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();

        int givernNum, sum = 0;
        float average = 0;
        for (int j = 0; j < count; j++) {
            givernNum = sc.nextInt();
            sum = sum + givernNum;

        }
        average = sum / count;

        System.out.println("the sum of the numbers :" + sum);
        System.out.println("the numbers of avg is:" + average);

    }
}
