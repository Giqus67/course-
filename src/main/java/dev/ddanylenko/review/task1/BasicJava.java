package dev.ddanylenko.review.task1;

import dev.ddanylenko.module8.task1.Lists;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BasicJava {
    public static void main(String[] args) {
        printPrimitives();
        fahrenheitConvert(25);
        calculator();
        workWithArray();
    }

    public static void printPrimitives() {
        byte b = (byte) (Math.pow(2, 8) / 2);
        System.out.println("byte: " + b);
        short s = (short) (Math.pow(2, 16) / 2);
        System.out.println("short: " + s);
        int i = (int) (Math.pow(2, 32) / 2);
        System.out.println("int: " + i);
        long l = (long) Math.pow(2, 64) / 2;
        System.out.println("long: " + l);
        float f = (float) Math.pow(2, 32) / 2;
        System.out.println("float: " + f);
        double d = Math.pow(2, 64) / 2;
        System.out.println("double: " + d);
        char c = 99;
        System.out.println("char: " + c);
        System.out.println("boolean: " + true);
    }

    public static void fahrenheitConvert(double C) {
        double F = (C * 9) / 5 + 32;
        System.out.println("C: " + C + "°. Converted to F: " + F + "°F");
    }

    public static void calculator() {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Input x: ");
                double x = sc.nextDouble();
                System.out.println("Input y: ");
                double y = sc.nextDouble();
                System.out.println("Select operation \"+\", \"-\", \"*\" or \"/\" to calculate the result: ");
                String op = sc.next();
                switch (op) {
                    case "+":
                        System.out.println("Sum of " + x + " + " + y + " = " + (x + y));
                        break;
                    case "-":
                        System.out.println("Subtract  of " + x + " - " + y + " = " + (x - y));
                        break;
                    case "*":
                        System.out.println("Multiply of " + x + " * " + y + " = " + (x * y));
                        break;
                    case "/":
                        System.out.println("Division of " + x + " / " + y + " = " + (x / y));
                        break;
                    default:
                        System.out.println("Invalid operation");
                        return;
                }
            } catch (InputMismatchException e) {
                System.out.println("Inputed wrong number!");
            }
        }
    }

    public static void workWithArray() {
        int[] array = Lists.getArray(10);
        System.out.println("Array: " + Arrays.toString(array));
        double sum = 0;
        double multiply = 1;
        for (int j : array) {
            sum += j;
            multiply *= j;
        }
        System.out.println("Sum of array: " + sum);
        System.out.println("Multiply of array: " + multiply);
        System.out.println("Average of array " + (sum / array.length));
    }
}
