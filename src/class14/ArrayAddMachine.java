package class14;

public class ArrayAddMachine {
    public static void main(String[] args) {
        int [] arr2={10,10,10,20,30};

        addArrayElementsMachine(arr2);
        int [] array3={20,45,30,23};
        addArrayElementsMachine(array3);

    }


    static void addArrayElementsMachine(int [] arr){
        int sum=0;
        for (int number:arr) {
            sum+=number;
        }
        System.out.println(sum);
    }


}



