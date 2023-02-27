package class17;

public  class Dog {

    String name;
    String breed;
    String color;
    int age;
    double weight;

    Dog(String dogName,String dogBreed,int dogAge,double dogWeight){
        name=dogName;
        breed=dogBreed;
        age=dogAge;
        weight=dogWeight;
    }
   public void printInfo(){
        System.out.println("Name "+name+" Breed "+breed+" age "+age+" Weight "+weight);
    }


}