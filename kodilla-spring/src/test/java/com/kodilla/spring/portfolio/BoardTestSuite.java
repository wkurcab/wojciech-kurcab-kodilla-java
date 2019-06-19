package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        TaskList toDoList = board.getToDoList();
        TaskList inProgressList = board.getInProgressList();
        TaskList doneList = board.getDoneList();

        toDoList.addTask("Test: task to do list");
        inProgressList.addTask("Test: task in progress list");
        doneList.addTask("Test: task done list");

        //When
        String taskToDoList = board.getToDoList().tasks.get(0);
        String taskInProgressList = board.getInProgressList().tasks.get(0);
        String taskDoneList = board.getDoneList().tasks.get(0);

        //Then
        Assert.assertEquals("Test: task to do list", taskToDoList);
        Assert.assertEquals("Test: task in progress list", taskInProgressList);
        Assert.assertEquals("Test: task done list", taskDoneList);
    }
}
