//Create a Student class
//Data members 1.name 2.usn 3.marks create 2 objects and print their details.
public class Student{
    String name;
    int usn;
    int marks;

    void display(String name, int usn, int marks){
        this.name = name;
        this.usn = usn;
        this.marks = marks;
        System.out.println("Name " + this.name);
        System.out.println("USN " + this.usn);
        System.out.println("Marks " + this.marks);
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.display("Manasa", 101, 100);
        s2.display("Kavana", 102, 99);
    }
}
