package com.kodilla.patterns.factory.task;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Shopping", "Shoes", 1.0);
            case PAINTING:
                return new PaintingTask("Painting", "Yellow", "Wall");
            case DRIVING:
                return new DrivingTask("Driving", "New York", "car");
            default:
                return null;
        }
    }
}
