package KlassenhierarchieUndPolymorphie.AbstractClass;

public class FormVerwaltung {
    private Form[] formen;

    public FormVerwaltung() {
        this.formen = new Form[10];
    }

    public void addForm(Form form) {
        for (int i = 0; i < formen.length; i++) {
            if (formen[i] == null) {
                formen[i] = form;
                break;
            }
        }
    }

    public void printAllForms() {
        for (int i = 0; i < formen.length; i++) {
            if (formen[i] != null) {
                Form f = formen[i];
                if(f instanceof Circle){
                    System.out.println("Circle!" + f.getColor());
                }
            }
        }
    }
}
