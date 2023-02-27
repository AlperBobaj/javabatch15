package class24;

public abstract class Phone {
    /*
    create a phone class lets create abstract methods like displayPictures
    unlockPhone
    SendText
    2 child classes create Iphone Samsung Google and provide specific implementation
    lets write code to achieve runtime polymorphism
     */

     abstract void displayPictures ();
     abstract void unlockPhone();
     abstract void sendText();

  }


class Iphone extends Phone{


    @Override
    void displayPictures() {
        System.out.println("Iphone send a pictures");
    }

    @Override
    void unlockPhone() {
        System.out.println("Iphone is unlock");

    }

    @Override
    void sendText() {
        System.out.println("Iphone can send a text");

    }
}
 class Samsung extends Phone{

     @Override
     void displayPictures() {
         System.out.println("Samsung has a good pictures");
     }

     @Override
     void unlockPhone() {
         System.out.println("Swipe to unlock");
     }

     @Override
     void sendText() {
         System.out.println("u can send text by voice");
     }
 }
 class Google extends Phone {

     @Override
     void displayPictures() {
         System.out.println("Google has the best pictures");
     }

     @Override
     void unlockPhone() {
         System.out.println("Google cant unlock the phone");


     }

     @Override
     void sendText() {
         System.out.println("send text by swipe");
     }
 }