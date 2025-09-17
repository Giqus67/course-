package dev.ddanylenko.module7.task1;

public class Container <T> {
    public T element;

    public Container(T element) {
        this.element = element;
    }

    public T getElement(){return element;}

    public void setElement(T element){this.element = element;}

    @Override
    public String toString() {
        return "Container{" +
                "element=" + element +
                '}';
    }
}
