package KlassenhierarchieUndPolymorphie.Static.InnerClass;

public class OuterClass {

    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass();
        innerClass.test();
    }

    static class InnerClass {
        public void test() {
            System.out.println("Test");
        }
    }
}


