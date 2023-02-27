package class12;

public class StringDemo11 {
    public static void main(String[] args) {

        String str="Send it to support channel. More java";
        //returns the new String from this index
        String newStr=str.substring(28);
        System.out.println(newStr);
        System.out.println(str.substring(0,27));//starting point =0 and ending point is =27
    }
}
