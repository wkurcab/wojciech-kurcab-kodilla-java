package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import java.util.*;
//import java.lang.*;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }
    @After
    public void after() {
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<>();
        //When
        List<Integer> result = oddNumbersExterminator.exterminate(numbers);
        //Then
        Assert.assertTrue(result.size() == 0);
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(9);
        numbers.add(10);
        //When
        List<Integer> result = oddNumbersExterminator.exterminate(numbers);
        //Then
        Assert.assertEquals(Collections.singletonList(10), result);
    }
}
