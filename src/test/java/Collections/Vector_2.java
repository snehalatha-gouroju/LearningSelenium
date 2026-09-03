package Collections;

import java.util.Vector;

public class Vector_2
{

    public static void main(String[] args){

        Vector<Integer> v1=new Vector<>();

        v1.add(12);
        System.out.println(v1);

        System.out.println("Size:" +v1.size());

        System.out.println("capacity:" +v1.capacity());
    }
}
