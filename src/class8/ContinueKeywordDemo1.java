package class8;

public class ContinueKeywordDemo1 {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            if(i%3==0){
                continue;//skip.break and continue it always comes with if condition

            }else{
                System.out.println(i);
                System.out.println("Hello Java");
            }

        }
    }
}
