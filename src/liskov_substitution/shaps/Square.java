package liskov_substitution.shaps;

/**
 * a Square is just a special type of rectangle where the width is equal to the height.
 */
public class Square extends Rectangle {
    public Square() {}

    public Square(int size) {
        width = height = size;
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }
}