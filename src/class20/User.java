package class20;

public class User {


    //Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
    // Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
    // Print users name, mobile number and address in userDetails method. Test your code.

    String name;
    int number;

    User (String name,int number){
        this.name=name;
        this.number=number;

    }

}

   class UserInfo extends User{

    String address;
    UserInfo(String name,int number,String address){
        super(name, number);
        this.address=address;

    }
    void userDetailsMethod(){
        System.out.println(name+"mobile number"+number+"and located "+address);
    }
   }
