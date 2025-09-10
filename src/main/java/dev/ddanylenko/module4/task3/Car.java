package dev.ddanylenko.module4.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Car {
    private String producer;
    private String model;
    private Engine engine;
    private List<Wheel> wheels;

    public Car(String producer, String model, Engine engine, List<Wheel> wheels) {
        this.producer = producer;
        this.model = model;
        this.engine = engine;
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                ", wheels=" + wheels +
                '}';
    }

    public static void main(String[] args){
        Engine carEngine = new Engine(1.6, EngineType.PETROL);
        Wheel wheel = new Wheel(16, SeasonType.SUMMER, TireType.ALL_TERRAIN);
        List<Wheel> wheelList = Collections.nCopies(4, wheel);
        Car car = new Car("Hyundai", "Accent 2008", carEngine, wheelList);
        System.out.println(car);
    }
}
