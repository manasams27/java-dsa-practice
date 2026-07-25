//Method Overloading
//Create a class Calculator with 3 mathods 1.add(int a, int b), 2.add(int a, int b, int c), 
//add(double a, double b) call all 3 methods from main().
public class Calculator{
    public void add(int a, int b){
        int res1 = a + b;
        System.out.println(res1);
    }
    public void add(int a, int b, int c){
        int res2 = a + b + c;
        System.out.println(res2);
    }
    public void add(double a, double b){
        double res3 = a + b;
        System.out.println(res3);
    }
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.add(10, 20);
        c1.add(20, 30, 60);
        c1.add(30, 70);
    }
}