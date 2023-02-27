package class30;

import java.util.Map;
import java.util.TreeMap;

public class MapsDemo9 {
    //Create a map of countries with its capital that will store countries in alphabetical order.
    //Print all keys and values from a country map using for each loop and iterator.
    //Print all values from a country map using for each loop and iterator.
    public static void main(String[] args) {

        Map<String, String> countryMap = new TreeMap<>();
        countryMap.put("Paris", "France");
        countryMap.put("Dc Washington", "Usa");
        countryMap.put("Roma", "Italy");
        var values=countryMap.values();
        for(var value:values){
            System.out.println(value);
        }
        var iterator=countryMap.values().iterator();
        while ((iterator.hasNext())){
            var value=iterator.next();
            System.out.println(value);
        }

    }
}
