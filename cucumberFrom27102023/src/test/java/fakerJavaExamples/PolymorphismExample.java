package fakerJavaExamples;
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
    public void sound1() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
    public void sound2() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        animal1.sound1();
        
        
        animal1.sound();    // Calls Dog's sound() method
        animal2.sound();    // Calls Cat's sound() method
    }
}
