package KlassenhierarchieUndPolymorphie.AbstractClass;

public class Square extends Form {
    private int width;

    public Square(String color, int width) {
        super(color);
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int berechneFläche() {
        return width * width;
    }
}
