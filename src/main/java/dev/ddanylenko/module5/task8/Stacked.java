package dev.ddanylenko.module5.task8;


import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Stacked {
    public static void main(String[] args) {
        startBuffer();
    }

    public static void startCheckStack(){
        Stack<Character> stack = new Stack<>();
        stack.push('(');
        stack.push('[');
        stack.push('{');
        stack.push('}');
        stack.push(']');
        stack.push(')');
        System.out.println("Equal stack: " + stack + " to ([{}])?" + checkStack(stack));
    }
    public static void startReverse(){
        Stack<Integer> integers = new Stack<>();
        for(int i = 0; i < 10; i++){
            integers.push((int) (Math.random() * 10));
        }
        System.out.println("Stack before reverse: " + integers);
        reverseStack(integers);
        System.out.println("Stack before after: " + integers);
    }

    public static void startBuffer() {
        Scanner scanner = new Scanner(System.in);
        Stack<String> buffer = new Stack<>();
        Stack<String> redo = new Stack<>();
        boolean end = false;
        while (!end){
            System.out.println("Select operation: \n1. Add \n2. Undo \n3. Redo \n4. Exit \n");
            Integer option = scanner.nextInt();
            scanner.nextLine();
            switch (option){
                case 1:
                    System.out.print("Enter text: ");
                    String string = scanner.nextLine();
                    buffer.push(string);
                    redo.push(string);
                    System.out.println(buffer);
                    break;
                case 2:
                    buffer.pop();
                    System.out.println(buffer);
                    break;
                case 3:
                    buffer.clear();
                    buffer.addAll(redo);
                    System.out.println(buffer);
                    break;
                case 4:
                    end = true;
                    break;
                default:
                    System.out.println("Unsupported operation!");
            }
        }

    }

    public static boolean checkStack(Stack<Character> stack) {
        String string = ")]}{[)";
        if(stack.isEmpty() || stack.size() != string.length()){
            return false;
        }
        for(int i = 0; i < stack.size(); i++){
            if(!stack.pop().equals(string.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static void reverseStack(Stack<Integer> stack){
        Stack<Integer> temp = new Stack<>();
        while (!stack.isEmpty()){
            temp.push(stack.pop());
        }
        stack.addAll(temp);
    }
}
