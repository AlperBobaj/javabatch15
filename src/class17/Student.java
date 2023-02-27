package class17;

public class Student {

    String id;
    String name;
    int age;
    double weight;

    public Student(String sName,String sId,int sAge){

        id=sId;
        name=sName;
        age=sAge;
    }

    public Student(String sName,String sId,int sAge,double sWeight){
       id=sId;
       name=sName;
       age=sAge;
       weight=sWeight;
   }

        void printInfo () {
            System.out.println(name + " " + id + " " + age + " " + weight);
        }

    }
