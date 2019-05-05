package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = new int[20];
        numbers[0] = 8;
        numbers[1] = 5;
        numbers[2] = 45;
        numbers[3] = 52;
        numbers[4] = 2;
        numbers[5] = 5;
        numbers[6] = 89;
        numbers[7] = 6;
        numbers[8] = 0;
        numbers[9] = 11;
        numbers[10] = 23;
        numbers[11] = 53;
        numbers[12] = 3;
        numbers[13] = 8;
        numbers[14] = 9;
        numbers[15] = 0;
        numbers[16] = 95;
        numbers[17] = 9;
        numbers[18] = 54;
        numbers[19] = 51;

        //When
        double array = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average()
                .getAsDouble();

        //Then
        Assert.assertEquals(26.4, array, 0.001);
    }
}
