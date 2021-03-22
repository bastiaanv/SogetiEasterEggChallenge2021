package nl.sogeti.com.shapes;

public class StarShape implements IShape {
    private int xCenter;
    private int yCenter;
    private int width = 1;

    public StarShape(int x, int y) {
        this.xCenter = x;
        this.yCenter = y;
    }

    @Override
    public boolean isValid(int yCoordinate, int xCoordinate, int phase) {
        // Draw horizontal row
        if (yCoordinate == this.yCenter && (xCoordinate >= this.xCenter - this.width - phase
                && xCoordinate <= this.xCenter + this.width - phase)) {
            return true;
        }

        // Draw vertical row
        if (xCoordinate == this.xCenter - phase
                && (yCoordinate >= this.yCenter - this.width && yCoordinate <= this.yCenter + this.width)) {
            return true;
        }

        return false;
    }
}
