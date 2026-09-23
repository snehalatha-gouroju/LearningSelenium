package JavaPractice;

public class AvgOfArray_4 {

    public static void main(String[] args){

        int[] arr= {1,2,3};

        int length= arr.length;

        System.out.println("the length of array is:" +length);

        int sum=0; float avg=0;

        for(int i=0;i<length;i++)
        {
            sum=sum + arr[i];
        }

        System.out.println("array numbers of sum is :" +sum);

        avg = sum / length;

        System.out.println("The avg of array numbers:" +avg);
    }
}
