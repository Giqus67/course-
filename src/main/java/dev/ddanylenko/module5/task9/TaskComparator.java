package dev.ddanylenko.module5.task9;

import java.util.Comparator;

public class TaskComparator implements Comparator<Task> {

    private final TaskPriorityComparator taskPriorityComparator = new TaskPriorityComparator();
    @Override
    public int compare(Task task1, Task task2) {
        int priority = taskPriorityComparator.compare(task1.getTaskPriority(), task2.getTaskPriority());
        if(task1.getTaskPriority().equals(task2.getTaskPriority())){
            return task1.getName().compareTo(task2.getName());
        }
        else{
            return priority;
        }
    }
}
