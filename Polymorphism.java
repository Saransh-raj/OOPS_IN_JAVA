
public class Polymorphism {

    public static class Dog {
        void speak(){
            System.out.println("Barking....");
        }
    }
    public static class Cat {
        void speak(){
            System.out.println("Meoww...");
        }
    }
    public static void main(String[] args) {
        Dog D = new Dog();
        Cat C = new Cat();

        D.speak();
        C.speak();
    }
}