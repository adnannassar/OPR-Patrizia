package KlassenhierarchieUndPolymorphie.AbstractClass;

public class Rectangle extends Form {
    private int width, length;

    public Rectangle(String color, int width, int length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public int berechneFläche(){
        return width * length;
    }
}
