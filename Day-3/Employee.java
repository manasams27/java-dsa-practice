//Constructor
//Create a class Employee with 1.name 2.id 3.salary
public class Employee{
    String name;
    int id;
    double salary;
    Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
        System.out.println("Name " + this.name);
        System.out.println("ID " + this.id);
        System.out.println("Salary " + this.salary);
    }
    public static void main(String[] args) {
        Employee employee1 = new Employee("Manasa", 101, 20000);
        Employee employee2 = new Employee("Kavana", 102, 40000);
    }
}