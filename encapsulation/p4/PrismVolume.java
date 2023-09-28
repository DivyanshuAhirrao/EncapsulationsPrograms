package assignments.encapsulation.p4;

public class PrismVolume {
    private double base;
    private double height;
    private double length;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public PrismVolume(double base, double height, double length) {
        this.base = base;
        this.height = height;
        this.length = length;
    }
}
