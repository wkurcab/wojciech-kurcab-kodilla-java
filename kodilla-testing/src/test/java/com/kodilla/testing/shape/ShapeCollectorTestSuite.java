package com.kodilla.testing.shape;

import org.junit.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of test.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape sh = new Triangle("Trójkąt", 13.0);
        //When
        shapeCollector.addFigure(sh);
        //Then
        Assert.assertEquals(1, shapeCollector.getShapesSize());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape sh = new Triangle("Trójkąt", 13.0);
        shapeCollector.addFigure(sh);
        //When
        boolean result = shapeCollector.removeFigure(sh);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.getShapesSize());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape sh = new Triangle("Trójkąt", 13.0);
        shapeCollector.addFigure(sh);
        //When
        Shape result = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(sh, result);
    }
}
