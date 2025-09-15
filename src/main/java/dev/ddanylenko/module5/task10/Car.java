package dev.ddanylenko.module5.task10;

import java.util.Objects;

public class Car implements Comparable<Car>{
    private final String model;
    private final String brand;
    private final Integer year;

    public Car(String model, String brand, int year) {
        this.model = model;
        this.brand = brand;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        if(!this.getBrand().equals(car.getBrand())) {
            return false;
        }
        if(!this.getModel().equals(car.getBrand())){
            return false;
        }
        return getYear() == car.getYear();
    }

    @Override
    public int hashCode() {
        int hash = this.model.hashCode();
        hash += this.brand.hashCode();
        return 31 * (hash + this.year.hashCode());
    }

    @Override
    public String toString() {
        return this.brand + " " + this.model + " " + this.year;
    }


    @Override
    public int compareTo(Car o) {
        if(this.year > o.getYear()) {
            return 1;
        }
        else if(this.year < o.getYear()) {
            return -1;
        }
        return this.brand.compareTo(o.getBrand());
    }
}
