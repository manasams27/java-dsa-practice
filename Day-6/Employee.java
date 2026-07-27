/*Encapsulation
Create an Employee class 
private variables
1.name 2.salary
create 1.setName() 2.setSalary() 3.getName() 4.getSalary
in main() set the values and print them using getters.
 */
public class Employee {
    private String name;
    private double salary;
    void setName(String name){
        this.name = name;
    }
    void setSalary(double salary){
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("manasa");
        e1.setSalary(20000);
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());
    }
}

