package dev.ddanylenko.module4.task3;

public class Engine {
    private final double volume;
    private final EngineType engineType;

    public Engine(double volume, EngineType engineType) {
        this.volume = volume;
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                ", engineType=" + engineType +
                '}';
    }
}
