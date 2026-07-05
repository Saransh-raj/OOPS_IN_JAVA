public class Constructor {
    public static class Car{
        int seat;
        String name;
        double length;

        // parametarized constructor
        Car(int x,String s, double d){
            seat = x;
            name = s;
            length = d;
        }

        // printing method
        void print(){
            System.out.println(seat+" "+name+" "+length);
        }
    }

    public static void main(String[] args) {

        // c1 object , and parametarized constructor
        Car c1 = new Car(2, "ferrari", 3.4); 
        c1.print();

        // c2 object , and parametarized constructor
        Car c2 = new Car(4, "BMW", 4.3);
        c2.print();
    }
}
