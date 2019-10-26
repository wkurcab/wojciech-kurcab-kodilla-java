package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class TaskUserTestSuite {
    @Test
    public void testUpdate() {
        //Given
        TaskList johnSmithTask = new JohnSmithTaskList();
        TaskList ivoneEscobarTask = new IvoneEscobarTaskList();
        TaskUser mentorOne = new TaskUser("Mentor One");
        TaskUser mentorTwo = new TaskUser("Mentor Two");
        johnSmithTask.registerObserver(mentorOne);
        ivoneEscobarTask.registerObserver(mentorTwo);
        //When
        johnSmithTask.addTask("Task 2.2 is done");
        johnSmithTask.addTask("Task 2.3 is done");
        ivoneEscobarTask.addTask("Task 4.1 is done");
        johnSmithTask.addTask("Task 2.6 is done");
        ivoneEscobarTask.addTask("Task 4.2 is done");
        //Then
        assertEquals(3, mentorOne.getUpdateCount());
        assertEquals(2, mentorTwo.getUpdateCount());
    }
}
