package class13;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        //3) Write a program that reads two people's first
        //names and if they expect boy or girl?
        //Based on the input suggests a name for a baby:
        //Example Output:
        //Mom’s first name? Mary
        //Dad’s first name? Daniel
        //Boy or Girl? boy
        //Suggested baby name: DANRY
        //
        //Example Output:
        //Mom’s first name? Mary
        //Dad’s first name? Daniel
        //Boy or Girl? girl
        //Suggested baby name: MAle

        String dadsName="Daniel";
        String momsName="Mary";
        String expectation="Boy";

        if(expectation.equalsIgnoreCase("boy")) {
            String firstHalf = dadsName.substring(0, dadsName.length() / 2);
            String secondHalf = momsName.substring(momsName.length() / 2);

        }else{
          String   firstHalf=momsName.substring((momsName.length()/(2)));
          String   secondHalf=dadsName.substring(dadsName.length()/(2));
            System.out.println(firstHalf+secondHalf);
        }

    }
}
