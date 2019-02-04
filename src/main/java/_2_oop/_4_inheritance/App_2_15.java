package _2_oop._4_inheritance;

/**
 * task
 */
public class App_2_15 {
    public static void main(String[] args) {
        A2 a2 = new C2();
        B2 b2 = new C2();
        C2 c2 = new C2();

//        a2.g();
//        b2.g();
//        c2.g();
    }
}

class A2 {
    int a;

    void f() {
        System.out.println("A.f()");
    }
}

class B2 extends A2 {
    @Override
    void f() {
        int a = this.a;
        System.out.println("B.f()");
    }

    void g() {
        System.out.println("B.g()");
    }
}

class C2 extends B2 {

    @Override
    void f() {
        super.f();
        System.out.println("C.f()");
    }

    void g() {
        System.out.println("C.g()");
    }

    void h() {
        System.out.println("C.h()");
    }

}