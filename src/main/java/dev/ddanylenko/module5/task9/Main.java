package dev.ddanylenko.module5.task9;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        serviceClient();
        sortStudents();
        sortTask();
    }

    public static void serviceClient() {
        Queue<String> bankQueue = new LinkedList<>();
        bankQueue.add("Denys");
        bankQueue.add("Ivan");
        bankQueue.add("Stacy");
        System.out.println("Service client: " + bankQueue.remove());
        System.out.println("Service client: " + bankQueue.remove());
        System.out.println("Service client: " + bankQueue.remove());
    }

    public static void sortStudents(){
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("Denys", 86.3));
        pq.add(new Student("Ivan", 70.3));
        pq.add(new Student("Stacy", 61.2));
        pq.add(new Student("John", 81.3));
        pq.add(new Student("Mike", 95.3));

        System.out.println(pq);
    }

    public static void sortTask(){
        PriorityQueue<Task> taskPQ = new PriorityQueue<>(new TaskComparator());
        taskPQ.add(new Task("Wash dish", TaskPriority.LOW));
        taskPQ.add(new Task("Have a lunch", TaskPriority.MEDIUM));
        taskPQ.add(new Task("Write code", TaskPriority.HIGH));
        taskPQ.add(new Task("Buy crypto", TaskPriority.HIGH));
        taskPQ.add(new Task("Chill", TaskPriority.LOW));
        taskPQ.add(new Task("Water flowers", TaskPriority.LOW));

        while (!taskPQ.isEmpty()) {
            System.out.println(taskPQ.poll());
        }
    }

}
