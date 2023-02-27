package class6;

public class WhileLoop {
    public static void main(String[] args) {



        int number=0;
        if(number<3) {
            System.out.println("hello world");
        }

            number++;
            if(number<3){
                System.out.println("hello world");


            }

            number++;
            if(number<3){
                System.out.println("hello world");
        }

              int number2=0;
            while (number2<3){ // Keeps on chechkin the condition as long as it returns true
                System.out.println("hello world");
                number2++; // increment the number2 by one
            }
    }
}
