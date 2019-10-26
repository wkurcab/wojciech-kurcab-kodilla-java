package com.kodilla.patterns2.observer.homework;

public class TaskUser implements Observer {
    private final String taskUserName;
    private int updateCount;

    public TaskUser(String taskUserName) {
        this.taskUserName = taskUserName;
    }

    @Override
    public void update(TaskList taskList) {
        System.out.println(taskUserName + ": New task on list " + taskList.getTaskName() + "\n" +
                "total: " + taskList.getTask().size() + " tasks)");
        updateCount++;
    }

    public String getTaskUserName() {
        return taskUserName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
