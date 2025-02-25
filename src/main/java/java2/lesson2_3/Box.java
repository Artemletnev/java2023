package java2.lesson2_3;

public class Box {
    String color;
    int size;

    public Box(String color, int size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public int hashCode() {
        return size + color.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Box){
            Box anothet = (Box) obj;
            if (this.color.equalsIgnoreCase(anothet.color) && this.size == anothet.size) return true;
        }
        return false;
    }
}
