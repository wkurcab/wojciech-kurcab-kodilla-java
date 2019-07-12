package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> shapes = new ArrayList<Shape>();

    public Shape addFigure(Shape shape) {
        shapes.add(shape);
        return shape;
     }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapes.contains(shape)) {
            shapes.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        Shape shape = null;
        if (n >= 0 && n < shapes.size()) {
            shape = shapes.get(n);
        }
        return shape;
    }

    public void showFigures() {
        for (Shape figures : shapes) {
            System.out.println("Figure name: " + figures.getShapeName() + ", field: " + figures.getField());
        }
    }

    public int getShapesSize() {
        return shapes.size();
    }
}

