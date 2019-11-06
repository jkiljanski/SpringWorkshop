package workshop.oop.inner;

public class A {
    B b = new B();

    int j = 0;

    I otherObject = new I() {
        @Override
        public void printSmth() {
            System.out.println("bla bla");
        }
    };

    public interface I{
        void printSmth();
    }

    public class B implements I{
        @Override
        public void printSmth(){
            System.out.println(j++);
        }

    }

    public static void main(String[] args) {
        A a = new A();
        B b = a.new B();
        b.printSmth();
        b.printSmth();
        b.printSmth();

    }
}
