package class28;




import class26.Dog;

import java.util.ArrayList;
import java.util.Objects;

public class GenericArrayList {

    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();

        names.add("10");


        Object a=new String("some value");
        Object b=new Integer(10);


        //No one now uses the arrays like this
        ArrayList name=new ArrayList();
        name.add("Zafar");
        name.add(10);
        name.add('a');



        for (Object j:name
             ) {
            System.out.println(j);

        }


    }
}
