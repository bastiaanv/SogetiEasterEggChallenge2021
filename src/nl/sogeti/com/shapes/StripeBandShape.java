package nl.sogeti.com.shapes;

import java.util.ArrayList;

public class StripeBandShape implements IShape {

    private ArrayList<SlashShape> slashes = new ArrayList<SlashShape>();

    public StripeBandShape(int minX, int maxX, int bandWidth, int startHeight) {
        int offset = bandWidth * 3;
        for (int i = minX; i < maxX; i += offset) {
            slashes.add(new SlashShape(bandWidth, i, startHeight));
        }
    }

    @Override
    public boolean isValid(int yCoordinate, int xCoordinate, int phase) {
        for (SlashShape slash : slashes) {
            if (slash.isValid(yCoordinate, xCoordinate, phase)) {
                return true;
            }
        }

        return false;
    }

}
