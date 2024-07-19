class DevCos {
    void run() {
        System.out.println("On The Way");
    }
}

class Soft extends DevCos {
    void eat() {
        System.out.println("I am Eating");
    }
}

public class JavaInheritance {
    public static void main(String arg[]) {
        DevCos d1 = new DevCos();
        d1.run();
        Soft s1 = new Soft();
        s1.eat();
    }
}