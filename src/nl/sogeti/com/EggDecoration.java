package nl.sogeti.com;

import nl.sogeti.com.shapes.IShape;
import nl.sogeti.com.shapes.StarBandShape;
import nl.sogeti.com.shapes.StraightLineShape;
import nl.sogeti.com.shapes.StripeBandShape;
import nl.sogeti.com.shapes.WaveShape;

public class EggDecoration {
    private static final IShape STRAIGHT_LINE = new StraightLineShape(20, 30);
    private static final IShape STAR_BAND = new StarBandShape(20, 30, 15, 100);
    private static final IShape LOWER_WAVE = new WaveShape(2, 0.5, 8);
    private static final IShape UPPER_WAVE = new WaveShape(2, 0.5, 12);
    private static final IShape SLASH_BAND = new StripeBandShape(15, 100, 2, 31);

    public static Colors getColors(int yCoordinate, int xCoordinate, int phase) {
        if (STAR_BAND.isValid(yCoordinate, xCoordinate, phase)) {
            return Colors.RED;
        }

        if (LOWER_WAVE.isValid(yCoordinate, xCoordinate, phase)) {
            return Colors.BLUE;
        }

        if (UPPER_WAVE.isValid(yCoordinate, xCoordinate, phase)) {
            return Colors.BLUE;
        }

        if (STRAIGHT_LINE.isValid(yCoordinate, xCoordinate, phase)) {
            return Colors.YELLOW;
        }

        if (SLASH_BAND.isValid(yCoordinate, xCoordinate, phase)) {
            return Colors.CYAN;
        }

        return Colors.PURPLE;
    }
}
