package KlassenhierarchieUndPolymorphie.Constructors.ThisExample;

public class C {
    int test1;
    String test2;


    public C() {
    }

    public C(int test1) {
        this.test1 = test1;
    }

    public C(String test2) {
        this.test2 = test2;
    }

    public C(int test1, String test2) {
        this(test1);
        this.test2 = test2;
    }
}
