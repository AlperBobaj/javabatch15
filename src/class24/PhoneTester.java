package class24;

public class PhoneTester {
    public static void main(String[] args) {


        Phone [] phones={new Iphone(),new Samsung(),new Google()};
        for(Phone x:phones){
            x.displayPictures();
            x.unlockPhone();
            x.sendText();

        }
        }


    }

