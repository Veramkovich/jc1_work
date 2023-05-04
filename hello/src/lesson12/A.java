package lesson12;

public class A {

    private String name;

    public A(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        A a = new A("a");
        B b = new B("b");
        C c = new C("c");

        System.out.println(a.getName());
        System.out.println(b.getName());
        System.out.println(c.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class B extends A {
    public B(String name) {
        super(name);
    }
}

class C extends B {
    public C(String name) {
        super(name);
    }
}