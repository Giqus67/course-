package dev.ddanylenko.module7.task1;

public class Main {

    public static void main(String[] args) {
        Container<Integer> container1 = new Container<>(10);
        printContainer(container1);
        Container<String> stringContainer = new Container<>("Hello");
        printContainer(stringContainer);

        Integer[] array = {1, 2, 4, 5, 6, 7, 8, 9};
        printArray(array);
        String[] stringArray = {"Hello", "every", "one", "and", "world"};
        printArray(stringArray);

        Container<Integer>[] arrayContainer = (Container<Integer>[]) new Container[10];
        arrayContainer[0] = new Container<>(1);
        arrayContainer[1] = new Container<>(3);
        arrayContainer[2] = new Container<>(4);
        arrayContainer[3] = new Container<>(5);
        //findMax(arrayContainer);
        findMax(array);
        findMax(stringArray);
    }

    public static <T> void printContainer(Container<T> container){
        System.out.println(container);
    }

    public static <T> void printArray(T[] array){
        for(T element : array){
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static <T extends Comparable<T>> void findMax(T[] array){
        T max = array[0];
        for(T element : array){
            if(element.compareTo(max) > 0){
                max = element;
            }
        }
        System.out.println("Max is " + max);
    }
}
