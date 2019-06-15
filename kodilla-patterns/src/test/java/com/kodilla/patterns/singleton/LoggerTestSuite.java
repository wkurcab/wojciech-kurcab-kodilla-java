package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void setLogger() {
        Logger.getInstance().log("Pierwszy testowy wpis w logach");
    }

    @Test
    public void testGetLastLog() {
        //Given
        //When
        String lastLog = Logger.getInstance().getLastLog();
        System.out.println("Log: " + lastLog);
        //Then
        Assert.assertEquals("Pierwszy testowy wpis w logach", lastLog);
    }
}
