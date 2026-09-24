package JavaPrograms;

import java.lang.reflect.Array;

public class AvgOfArray_4 {
    //int numbers;

    public static void main(String[] args){

        int[] array = {2,3,4,5,8,9};

        int length= array.length;



        System.out.println("length of array is:" +length);

        int sum=0;

//       //* for (int j : array) {
//
//            sum = sum + j;
//
//        }

        for(int i=0;i<length;i++) {
            sum = sum + array[i];
        }
        System.out.println("the sum of array numbers :" +sum);


        float avg=sum/length;
        System.out.println("the avg of array numbers:" +avg);
    }



}
