class GrandFather {

void land() {
        System.out.println("GrandFather owns land.");
    }
}

class Father extends GrandFather {

    void car() {
        System.out.println("Father owns a car.");
    }
}

class Son extends Father {

    void bike() {
        System.out.println("Son owns a bike.");
    }
}

public class Multilevel_inheritance {

    public static void main(String[] args) {

        Son s = new Son();

        s.land();   // From GrandFather
        s.car();    // From Father
        s.bike();   // From Son
    }
}
