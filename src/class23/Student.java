package class23;

public class Student {
    //Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
    //Define common behavior within parent class and override some of the methods in child classes
    //Define some methods specific to child classes
    //Write example of achieving run time polymorphism

  public void syntax(){
      System.out.println("Student of syntax");
  }
}
class SyntaxStudent extends Student{
    @Override
    public void syntax() {
        System.out.println("Students from Syntax");
    }
}
class CollegeStudent extends Student{
    @Override
    public void syntax() {
        System.out.println("Student from College");
    }
}
class SchoolStudent extends Student {
    @Override
    public void syntax() {
        System.out.println("School student");
    }


    public static void main(String[] args) {

        Student s = new SchoolStudent();
        s.syntax();

        Student [] school={new Student(),new CollegeStudent(),new SchoolStudent()};

        for(Student student:school){
            student.syntax();
        }
    }
}