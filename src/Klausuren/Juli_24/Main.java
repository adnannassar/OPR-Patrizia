package Klausuren.Juli_24;

public class Main {

    public class A {
        private int a;

        protected A(int a) {
            this.a = a;
        }

        protected int quadrat() {
            return a * a;
        }
    }

    class B extends A {
        private int b;

        protected B(int b) {
            super(b);
        }
    }
}
