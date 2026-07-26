/*Method Overloading
1.Animal class with a method sound.
2.Dog class extends Animal and overrides Sound.
3.Create a Dog object and call sound().
 */
public class Animal{
    void Sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    void Sound(){
        System.out.println("Dog makes sound");
    }
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.Sound();
    }
}