package nl.sogeti.com.shapes;

public class StraightLineShape implements IShape {
    private int minHeight;
    private int maxHeight;

    public StraightLineShape(int minHeight, int maxHeight) {
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
    }

    @Override
    public boolean isValid(int yCoordinate, int xCoordinate, int phase) {
        return yCoordinate >= this.minHeight && yCoordinate <= this.maxHeight;
    }

}
