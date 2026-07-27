/*Abstraction
Create An abstraction class vehicle
Abstract method start()
create a class car that extends vehicle and implements start().
create an object of car and call start().
 */
abstract class Vehicle {
    abstract void start();
}
class Car extends Vehicle{
    void start(){
        System.out.println("vehicle is starting");
    }
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
    }
}