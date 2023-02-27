package class9;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        /*
        Write a program that reads a range of integers
        (start and point) provided by a user and then from that range prints the sum of the even and odd integers
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter two numbers starting point and ending point");
        int start= scanner.nextInt();
        int end= scanner.nextInt();
        System.out.println("start"+start+"end"+end);

        int evenSum=0;
        int oddSum=0;

        for (int i = start; i <=end ; i++) {
            if(i%2==0){
                evenSum+=1;
            }else{
             oddSum=oddSum+i;
            }

        }
        System.out.println("sun of all the even numbers"+evenSum);
        System.out.println("syn of all the odd numbers"+oddSum);
    }
}
