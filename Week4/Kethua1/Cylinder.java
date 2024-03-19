package Week4.Kethua1;

public class Cylinder extends Circle {
    private double height;

    /**
     * Constructs 1.
     *
     * @param radius the radius of the cylinder's base circle
     * @param color  the color of the cylinder
     * @param height the height of the cylinder
     */
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    /**
     * Returns the height of the cylinder.
     *
     * @return the height of the cylinder
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the height.
     *
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Calculates and returns the volume.
     *
     * @return the volume
     */
    public double getVolume() {
        return getArea() * height;
    }

    /**
     * Calculates and returns.
     *
     * @return the surface area of the cylinder
     */
    @Override
    public double getArea() {
        double baseArea = super.getArea();
        double lateralArea = 2 * Math.PI * radius * height;
        return (2 * baseArea) + lateralArea;
    }

    /**
     * Returns a string representation of the Cylinder object.
     *
     * @return a string representation of the Cylinder object
     */
    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + ",height=" + height + "]";
    }
}
