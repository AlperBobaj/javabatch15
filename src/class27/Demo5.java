package class27;

import java.util.ArrayList;

public class Demo5 {

    public static void main(String[] args) {

        ArrayList<Character> characters = new ArrayList<>();
        characters.add('@');
        characters.add('#');
        characters.add('$');
        characters.add('*');
        characters.add('!');
        System.out.println(characters);


        for(Character c:characters){
            System.out.println(c);
        }

    }
}
