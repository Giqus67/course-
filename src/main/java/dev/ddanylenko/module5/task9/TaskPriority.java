package dev.ddanylenko.module5.task9;

public enum TaskPriority{
    LOW(1), MEDIUM(2), HIGH(3);

    private final int priority;
    private TaskPriority(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }


}
