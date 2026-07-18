class Student{
    String name;
    static String college = "Parul";

    Student(String name){
        this.name = name;
    }

    void display(){
        System.out.println("Name : "+name+" - College : "+college);
    }
}

class Test {

    int x = 10;
    static int y = 20;

    static void show() {
        // System.out.println(x); // Error
        System.out.println(y);
    }
}

public class Static_keyword {
    public static void main(String[] args) {
        Student s1 = new Student("Saransh Raj");
        s1.display();

        Test.show();
    }
}