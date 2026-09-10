package Collections;

import java.util.Vector;

public class Vector_3 {


    public static void main(String[] args) {

        Vector<String> v3 = new Vector<>();

        v3.add("sneha");
        System.out.println(v3);

        System.out.println("Size:" + v3.size());

        System.out.println("capacity:" + v3.capacity());

        //https://demo.opencart.com/admin/index.php
        v3.add("selenium");
        v3.add("test ng");
        v3.add("java");
        System.out.println(v3);


    }
}
