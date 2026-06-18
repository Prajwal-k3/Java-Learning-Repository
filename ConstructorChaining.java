package Constructor;
class Demo {
    Demo() {
        this(10);
        System.out.println("Demo()");
    }

    Demo(int a) {
        super();
        System.out.println("Demo(int a)");
    }
}

class Demo1 extends Demo {
    Demo1() {
        this(10, "Hello");
        System.out.println("Demo1");
    }

    Demo1(int a, String b) {
        super();
        System.out.println("Demo1(int a" +a +",String b)"+b);
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        Demo1 obj = new Demo1();
    }
}
