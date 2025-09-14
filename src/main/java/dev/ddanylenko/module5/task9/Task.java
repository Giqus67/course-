package dev.ddanylenko.module5.task9;

public class Task {
    private final String name;
    private final TaskPriority taskPriority;

    public Task(String name, TaskPriority taskPriority) {
        this.name = name;
        this.taskPriority = taskPriority;
    }

    public String getName() {
        return name;
    }

    public TaskPriority getTaskPriority() {
        return taskPriority;
    }

    @Override
    public String toString() {
        return name + " : " + taskPriority;
    }
}
