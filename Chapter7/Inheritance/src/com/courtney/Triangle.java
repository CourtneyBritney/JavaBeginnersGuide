package com.courtney;

// A subclass of TwoDShape for triangles.
class Triangle extends TwoDShape {
    String style;

    double area() {
        return width * height / 2; // Error! can't access
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
