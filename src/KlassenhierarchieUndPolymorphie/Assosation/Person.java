package KlassenhierarchieUndPolymorphie.Assosation;


public class Person {
    private String name;
    private int age;
    private Address address; // muss beziehung
    private Kontakt[] kontakte; // kann beziehung

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.kontakte = new Kontakt[3];
    }

    public void addKontakt(Kontakt kontakt) {
        for (int i = 0; i < kontakte.length; i++) {
            if (kontakte[i] == null) {
                kontakte[i] = kontakt;
                break;
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        String erg = "Persönliche Informationen: Name: " + name + ", Age: " + age + "\n" + address + "\nKontakte: [";
        for (int i = 0; i < kontakte.length; i++) {
            if (kontakte[i] != null) {
                if (i == kontakte.length - 1) {
                    erg += kontakte[i];
                } else {
                    erg += kontakte[i] + ", ";
                }
            }
        }
        return erg + "]";
    }
}
