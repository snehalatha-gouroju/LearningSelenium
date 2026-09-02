package Collections;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.Vector;

public class VectorClass {


    public static void main(String[] args) {

        Vector<String> v1 = new Vector<>(20);
        Vector<String> v2 = new Vector<>();
        Vector<String> v3 = new Vector<>();

        v1.add("a");
        v1.add("b");
        v1.add("c");
        v1.add("d");
        v1.add("d");
        v1.add("12");
        v2.add("e");
        v2.add("f");
        v2.add(0, "g");
        v2.add("h");
        v3.add("i");
        v3.add("j");
        System.out.println(v2);
        System.out.println(v2.capacity());


        //for adding v3 and v2
        for (int i=0;i<v2.size();i++) {
            v1.add(v2.get(i));
        }

        //otherwise adding v3 and v1


        v1.add("Recreate Vector with 100% of size");
        // v1.add("ju");
        //System.out.println(v1.size());

        //System.out.println(v1.capacity());
        System.out.println(v1.capacity());

        System.out.println(v2);
        System.out.println("v2 cap:" + v2.capacity());

        //otherwise adding v3 and v1

        //v2.add(0,v1);

        for (int j = 0; j < v1.size(); j++) {
            v2.add(v1.get(j));
        }
        System.out.println(v1);
        System.out.println("v2 elements :" + v2);
        ///retrieved by using get()

        System.out.println("retrieved element:" + v2.get(2));
        System.out.println(v2.size());


        ////Remove by index and text
        v2.remove("Recreate Vector with 100% of size"); //1
        //v2.remove(10);  //2
        System.out.println(v2);
        //remove all
        v2.removeAll(v3); //3

        v2.clear();   //4 entire vector elements are clear

        System.out.println(v2);

///contains elements on particular vector T | F
        System.out.println(v2.contains("a"));

        System.out.println(v3.contains("i"));

        ///containsAll

        System.out.println(v3.containsAll(v1));


///updating
        v1.set(1, "updated Elements");
        //System.out.println(v1.get(1));
        System.out.println(v1);
        System.out.println(v1.indexOf("Recreate Vector with 100% of size"));

        System.out.println(v1.lastIndexOf("d"));

        System.out.println(v1.lastElement());


        System.out.println(v1.firstElement());

///Convert Array from vector
        // Object[] arr=v1.toArray();
        // System.out.println(Arrays.toString(arr));
         System.out.println("capacity of v1 is:"+v1.capacity());
        System.out.println("size of v1 is:"+v1.size());

        Object[] arr=new Object[] {1,2,3,4,5};

        Vector v4=new Vector(Arrays.asList(arr));


        System.out.println(v4);


        System.out.println("size of the v4 is:"+v4.size());
        System.out.println("capacity of the v4 is:"+v4.capacity());


 Vector<Integer> v5=new Vector<>();
 v5.add(12);
        v5.add(12);
        v5.add(null);
        v5.add(null);

        System.out.println("V5 vector elements are:" +v5);







    }









}
