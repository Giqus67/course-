package dev.ddanylenko.module4.task8;

public class Cube implements Shape3D{

    public final double a;

    public Cube(double a) {
        this.a = a;
    }

    @Override
    public double getVolume() {
        return Math.pow(a, 3);
    }

    @Override
    public double getSurfaceArea() {
        return 6 * Math.pow(a, 2);
    }

    @Override
    public String getInfo() {
        return "Cube volume: " + getVolume() + "\nSurface area: " + getSurfaceArea();
    }

    @Override
    public String toString() {
        return getInfo();
    }
}
