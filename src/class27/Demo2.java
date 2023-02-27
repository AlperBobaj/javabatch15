package class27;

public class Demo2 {
    public static void main(String[] args) {

        String name="Uwa";

        String[] names={"Hiral","Nima","Laura","Nat"};
        // create a method which can search a name from this array return true if name is present in the array
        System.out.println(contains(name,names));

    }
       public static boolean contains(String nameToBeSearched,String [] names){

            for(String name:names){
                if(nameToBeSearched.equals(name)){
                    return true;
                }
            }
            return false;
       }

        }




