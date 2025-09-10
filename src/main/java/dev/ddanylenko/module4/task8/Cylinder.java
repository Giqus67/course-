package dev.ddanylenko.module4.task8;

public class Cylinder implements Shape3D{

    private final double radius;

    private final double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public double getSurfaceArea() {
        return 2 * Math.PI * Math.pow(radius, 2) + 2 * Math.PI * radius * height;
    }

    @Override
    public String getInfo() {
        return "Cylinder volume: " + getVolume() + "\nSurface area: " + getSurfaceArea();
    }

    @Override
    public String toString() {
        return getInfo();
    }
}
