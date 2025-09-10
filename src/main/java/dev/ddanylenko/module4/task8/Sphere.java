package dev.ddanylenko.module4.task8;

public class Sphere implements Shape3D {

    private final double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double getSurfaceArea() {
        return Math.PI  * Math.pow(radius, 2) * 4;
    }

    @Override
    public String getInfo() {
        return "Sphere volume: " + getVolume() + "\nSurface area: " + getSurfaceArea();
    }

    @Override
    public String toString() {
        return getInfo();
    }
}
