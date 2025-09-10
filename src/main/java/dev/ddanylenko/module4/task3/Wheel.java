package dev.ddanylenko.module4.task3;

public class Wheel {
    private final int radius;
    private final SeasonType seasonType;
    private final TireType tireType;

    public Wheel(int radius, SeasonType seasonType, TireType tireType) {
        this.radius = radius;
        this.seasonType = seasonType;
        this.tireType = tireType;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "radius=" + radius +
                ", seasonType=" + seasonType +
                ", tireType=" + tireType +
                '}';
    }
}
