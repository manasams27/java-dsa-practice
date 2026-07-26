/*Super Keyword
1.Student class with a constructor that prints "Student constructor".
2.Person class extends Student.
3.in the Person constructor use super() print "Person constructor" create a Person object and observe the output.
 */
public class Student{
    Student(){
        System.out.println("Student");
    }
}
class Person extends Student{
    Person(){
        super();
        System.out.println("Person");
    }
    public static void main(String[] args) {
        Person person = new Person();
    }
}