package class9;

public class ArraysDemo3 {
    public static void main(String[] args) {

        String[] letters = {"A", "B", "c", "d", "e", "F"};
        letters[0]="z";
        for (int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);
        }
    }
}