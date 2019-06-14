package exam.assesment_test.q8;

public class A {
    public A() {
        System.out.println("A constructor");
    }

    public static void main(String[] args) {
        A a = new B();
    }
}

class B extends A {
    public B() {
        System.out.println("B constructor");
    }
}
