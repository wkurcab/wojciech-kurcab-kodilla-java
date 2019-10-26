package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TaskList implements Observable {
    private final List<Observer> observers;
    private final List<String> task;
    private final String taskName;

    public TaskList(String taskName) {
        observers = new ArrayList<>();
        task = new ArrayList<>();
        this.taskName = taskName;
    }

    public void addTask(String post) {
        task.add(post);
        notifyObservers();
    }

    public List<String> getTask() {
        return task;
    }

    public String getTaskName() {
        return taskName;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
