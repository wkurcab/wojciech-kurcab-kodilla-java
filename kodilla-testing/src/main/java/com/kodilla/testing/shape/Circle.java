package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {
    private String shapeName;
    private Double field;

    public Circle(String shapeName, Double field) {
        this.shapeName = shapeName;
        this.field = field;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }
    @Override
    public Double getField() {
        return field;
    }
}

