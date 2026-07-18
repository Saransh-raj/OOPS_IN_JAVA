class Animal{
    void eat(){
        System.out.println("Animal can eat.");
    }
    void run(){
        System.out.println("Animal can run.");
    }
}

class Dog extends Animal{
    void speak(){
        System.out.println("Dog can bark...!");
    }
}

class Cat extends Animal{
    void speak(){
        System.out.println("Cat can Meoww... Meow... !");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.eat(); dog.run(); dog.speak();

        Cat cat = new Cat();
        cat.eat(); cat.run(); cat.speak();
    }
}
