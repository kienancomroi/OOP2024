package Week4.Kethua1;

public class Circle {
    private double radius;
    private String color;
    protected static final double PI = Math.PI;

    /**
     * Constructs a Circle object with default values.
     */
    public Circle() {
        this.radius = 0.0;
        this.color = "black";
    }

    /**
     * Constructs a Circle object with the given radius.
     *
     * @param radius the radius of the circle
     */
    public Circle(double radius) {
        this.radius = radius;
        this.color = "black";
    }

    /**
     * Constructs a Circle object with the given radius and color.
     *
     * @param radius the radius of the circle
     * @param color  the color of the circle
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /**
     * Returns the radius of the circle.
     *
     * @return the radius of the circle
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets the radius of the circle.
     *
     * @param radius the new radius of the circle
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Returns the color of the circle.
     *
     * @return the color of the circle
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the color of the circle.
     *
     * @param color the new color of the circle
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Calculates and returns the area of the circle.
     *
     * @return the area of the circle
     */
    public double getArea() {
        return radius * radius * PI;
    }

    /**
     * Returns a string representation of the Circle object.
     *
     * @return a string representation of the Circle object
     */
    public String toString() {
        return "Circle [radius=" + radius + ", color=" + color + "]";
    }
}