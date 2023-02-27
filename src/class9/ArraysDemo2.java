package class9;

public class ArraysDemo2 {
    public static void main(String[] args) {
int total=0;
        int [] numbers={10,20,30,45,50};

        for (int i = 0; i <numbers.length ; i++) {
            System.out.println(numbers[i]);
total+=numbers[i];
        }
        System.out.println(total);
    }
}
