package nl.sogeti.com.shapes;

public class WaveShape implements IShape {

    private final double amplitude;
    private final double period;
    private final int baseLine;
    private final double offset;

    public WaveShape(final double amplitude, final double period, int baseLine) {
        this.amplitude = amplitude;
        this.period = period;
        this.baseLine = baseLine;
        this.offset = 0;
    }

    public WaveShape(final double amplitude, final double period, int baseLine, double offset) {
        this.amplitude = amplitude;
        this.period = period;
        this.baseLine = baseLine;
        this.offset = offset;
    }

    @Override
    public boolean isValid(int yCoordinate, int xCoordinate, int phase) {
        return yCoordinate == Math
                .ceil(this.amplitude * Math.sin(xCoordinate * this.period + phase + this.offset) + this.baseLine);
    }

}
