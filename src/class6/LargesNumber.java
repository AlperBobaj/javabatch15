package class6;

import java.util.Scanner;

public class LargesNumber {
    public static void main(String[] args) {


        System.out.println("enter the larges number");
        Scanner scan=new Scanner(System.in);

        int a= scan.nextInt();
        int b= scan.nextInt();
        int c= scan.nextInt();

        if (a>b && a>c){
            System.out.println(a+"is larges number");
        }else if (b>a && b>c)  {
            System.out.println(b+"is the larges number");
        }else{
            System.out.println(c+"is the larges number");
        }


    }
}
