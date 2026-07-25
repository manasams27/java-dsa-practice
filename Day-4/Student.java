//Constructor Overloading
//Create a Student class with:
//default constructor -> prints "students object created"
//parameterized constructor -> accepts name, marks and prints them.
//create one object using each constructor.
public class Student{
    String name;
    int marks;
    Student(){
        System.out.println("Student object created");
    }
    Student(String name, int marks){
        this.name = name;
        this.marks=marks;
        System.out.println("Name: " + this.name);
        System.out.println("Marks: " + this.marks);
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("manasa", 90);
    }
}