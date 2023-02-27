package class30;

import java.util.HashMap;
import java.util.Map;

public class MapDemo3 {
    /*
    Create a map of a building.
    Store floor number and it is associated company name.
    (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map

     */
    public static void main(String[] args) {

        Map<Integer,String> floor=new HashMap<>();
        floor.put(1,"Google");
        floor.put(2,"Syntax");
        floor.put(3,"Cgi");
        floor.put(4,"Apple");
        floor.put(5,"Gm");
        floor.put(6,"Microsoft");
        floor.put(7,"Tesla");


        System.out.println(floor.size());
        floor.replace(4,"Apple");
        System.out.println(floor);

        floor.remove(7);
        System.out.println(floor);
    }
}
