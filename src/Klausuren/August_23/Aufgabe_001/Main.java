package Klausuren.August_23.Aufgabe_001;

public class Main {

    public class A {
        private int m(float f) {
            return (int) f;
        }
    }

    public class B extends A {
        //  @Override fehler weil die Methode m() in der Klasse A private ist
        public int m(float f) {
            return 2 * (int) f;
        }
    }

    public class C {
        protected int n;

        public C(int n) {
            this.n = n;
        }
    }

    public class D extends C {

        public D(int n) {
            super(n); // super() fehlt, weil D von C erbt, und C hat einen Konstruktor, welchen nicht default ist
        }
    }

    public class E {
        public int m(int n) {
            return n * n;
        }
    }

    public class F extends E {
        public String m2(int n) { // methoden namen ändern wegen der Überladung!
            return "Quadrat: " + n * n;
        }
    }

}
