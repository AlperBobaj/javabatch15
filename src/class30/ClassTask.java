package class30;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ClassTask {

    //Create a map of countries with its capital that will store countries in alphabetical order.
    //Print all keys and values from a country map using for each loop and iterator.
    //Print all values from a country map using for each loop and iterator.
    public static void main(String[] args) {

        Map<String, String> countryMap = new TreeMap<>();
        countryMap.put("Paris", "France");
        countryMap.put("Dc Washington", "Usa");
        countryMap.put("Roma", "Italy");

        // Set<Map.Entry<String,String>>entrySet=countryMap.entrySet();

         var entrySet=countryMap.entrySet();
        for (var entry:entrySet) {
            System.out.println(entry.getKey()+"= "+entry.getValue());

        }
        var iterator=countryMap.entrySet().iterator();

        while(iterator.hasNext()){
            var entry=iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}