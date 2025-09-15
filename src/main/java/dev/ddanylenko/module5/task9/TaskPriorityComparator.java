package dev.ddanylenko.module5.task9;

import java.util.Comparator;

public class TaskPriorityComparator implements Comparator<TaskPriority> {
    @Override
    public int compare(TaskPriority taskPriority1, TaskPriority taskPriority2) {
        return Integer.compare(taskPriority1.getPriority(), taskPriority2.getPriority());
    }
}
