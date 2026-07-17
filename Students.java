class Students_detail{
    String name;
    int roll;
    double CGPA;

    public void print(){
        System.out.println("Name " +name+ " roll : "+roll+" CGPA : "+CGPA);
    }
}
public class Students {
    public static void main(String[] args) {
        Students_detail s1 = new Students_detail();
        Students_detail s2 = new Students_detail();
        Students_detail s3 = new Students_detail();

        s1.name = "Saransh";
        s1.roll = 23;
        s1.CGPA = 8.01;

        s2.name = "John";
        s2.roll = 22;
        s2.CGPA = 9;

        s3.name = "Bob";
        s3.roll = 14;
        s3.CGPA = 6.6;

        s1.print();
        s2.print();
        s3.print();

    }
}
