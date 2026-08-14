package OOPS;

// method overriding (run time poymorphism) we want to give a special defeination of the method that are already exist in the parent class

class Animal
{
    void sound()
    {
        System.out.println("animal makes sound");
    }
}
class Dog extends Animal
{
    void sound()
    {
        System.out.println("dog barks .....");
    }
}
public class Polymorphism2 {
    static void main() {
        Animal a= new Animal();
        a.sound();
    }
}
