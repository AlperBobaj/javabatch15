package class17;

public class Task3 {
    ////3) Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    //    // Method should be available inside the class only where it was declared and executed by calling it is name.




   private static String vowels(String inputStr){
        return inputStr.replaceAll("[^AEIOUYaeiouY]","");
    }













}
