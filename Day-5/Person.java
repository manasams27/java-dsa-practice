/*Inheritance
1.Create a Person Class with name and age.
2.Create a student class that extends person.
3.add marks to student.
4.Create a student object and print all details.
 */
public class Person{
    String name;
    int age;
}
class Student extends Person{
    int marks;
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "manasa";
        s1.age = 20;
        s1.marks = 90;
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.marks);
    }
}