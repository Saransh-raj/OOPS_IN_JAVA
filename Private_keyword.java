class Student{
    String name;
    private int roll = 14;
    double cgpa;
    
    // private method
    private void print(){
        System.out.println(name+ " "+cgpa+" "+roll);
    }

    // method to display private method
    public void p(){
        print();
    }
}

public class Private_keyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.cgpa = 9.5;
        s1.name = "Saransh";
        s1.p();
    }
}
