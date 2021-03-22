package nl.sogeti.com.shapes;

import java.util.ArrayList;

public class StarBandShape implements IShape {

    private ArrayList<StarShape> stars = new ArrayList<StarShape>();

    public StarBandShape(int minHeight, int maxHeight, int minWidth, int maxWidth) {
        boolean inner = true;
        int innerOffset = (int) Math.ceil((maxHeight - minHeight) / 2);
        int outerOffet = (int) Math.floor((maxHeight - minHeight) / 4);

        for (int i = minWidth; i < maxWidth; i += 6) {
            if (inner) {
                stars.add(new StarShape(i, minHeight + innerOffset));

            } else {
                stars.add(new StarShape(i, minHeight + outerOffet));
                stars.add(new StarShape(i, maxHeight - outerOffet));
            }

            inner = !inner;
        }
    }

    @Override
    public boolean isValid(int yCoordinate, int xCoordinate, int phase) {
        for (StarShape star : stars) {
            if (star.isValid(yCoordinate, xCoordinate, phase)) {
                return true;
            }
        }

        return false;
    }

}
