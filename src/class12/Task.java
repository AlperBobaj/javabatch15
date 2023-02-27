package class12;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter user name");
        String username= scanner.nextLine();
        System.out.println("please enter password");
        String password= scanner.nextLine();
        String confirm= scanner.nextLine();
        if(username.isEmpty() || password.isEmpty()) {
            System.out.println("Enter the username and password");
        } else if (password.length()<8) {
            System.out.println("Password is to short");

        } else if (password.contains(username)) {
            System.out.println("Password can not contain username");

        } else if (!password.equals(confirm)) {
            System.out.println("Password do not match");

        }else{
            System.out.println("Your password and username is created");
        }

    }
}
