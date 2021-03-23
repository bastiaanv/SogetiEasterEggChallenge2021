package nl.sogeti.com.shapes;

public class SlashShape implements IShape {

    private int lineWidth;
    private int xStart;
    private int yStart;

    public SlashShape(final int lineWidth, final int xStart, int yStart) {
        this.lineWidth = lineWidth;
        this.xStart = xStart;
        this.yStart = yStart;
    }

    @Override
    public boolean isValid(int yCoordinate, int xCoordinate, int phase) {
        if (this.yStart > yCoordinate) {
            return false;
        }

        int row = yCoordinate - this.yStart;
        int column = xCoordinate - this.xStart + phase;
        for (int i = 0; i < this.lineWidth; i++) {
            if (row == column - i) {
                return true;
            }
        }

        return false;
    }

}
