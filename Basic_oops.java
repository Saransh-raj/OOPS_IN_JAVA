import java.util.*;
public class Basic_oops{

    // class :- class is a blueprint of an object
    public static class Student {
        String name;
        int roll;
        double CGPA;
    }

    // car class
    public static class Car {
        String name;
        int seats;
        double engineCapacity;
    }

    // person class
    public static class Person{
        String name;
        int age;
        double height;

        // method 
        void print(){
            System.out.println("Name : "+name+ " age : "+age+" height : "+height);
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //object :- object is an real world entity
        Student s1 = new Student(); // s1 is a student 1 object
        s1.name = "Saransh Raj"; // student 1 assigning name
        s1.roll = 23;   // student 1 assigning roll
        s1.CGPA = 8.01; // student 1 assigning CGPA

        System.out.println("Name : "+s1.name + ", roll : "+s1.roll+", CGPA : "+s1.CGPA);


        Student s2 = new Student(); // s2 is a student 2 object
        s2.name = "Jaghvi"; // student 2 assigning name
        s2.roll = 22;   // student 2 assigning roll
        s2.CGPA = 9.01; // student 2 assigning CGPA

        System.out.println("Name : "+s2.name + ", roll : "+s2.roll+", CGPA : "+s2.CGPA);

        // car class object
        Car c1 = new Car();
        System.out.println("Enter car name : ");
        c1.name = sc.nextLine();
        System.out.println("Enter no. of seats : ");
        c1.seats = sc.nextInt();
        System.out.println("Enter Engine capacity : ");
        c1.engineCapacity = sc.nextDouble();

        System.out.println("Name of car : "+c1.name);
        System.out.println("Seats : "+c1.seats);
        System.out.println("Engine Capacity : "+c1.engineCapacity);

        // object creating for person
        Person p1 = new Person();
        p1.name = "BOB"; p1.age = 24; p1.height = 5.9;
        p1.print(); // method calling


        sc.close();
    }
}