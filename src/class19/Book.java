package class19;

public class Book {

    //Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    //Instance variables are being initialized
    //Both Constructors are being executed


    String name;
    int year;

    Book(String name,int year){
    this.name=name;
    this.year=year;
    }
    void print(){
        System.out.println(name+ " is name of the book and year is " +year);
    }

    public static void main(String[] args) {
        Book book1=new Book("Obstacle",2020);
            book1.print();


    }
}
