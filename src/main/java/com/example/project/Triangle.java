package com.example.project;
import java.lang.Math;

public class Triangle {

    // your code goes here: good luck =)
    private double x0;    //setting private instance variables
    private double y0;
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Triangle (double xZero, double yZero, double xOne, double yOne, double xTwo, double yTwo) {    //parameters for point values
        x0 = xZero;    //setting private instance variables to parameters
        y0 = yZero;
        x1 = xOne;
        y1 = yOne;
        x2 = xTwo;
        y2 = yTwo;
    }
    public Triangle () {
        x0 = 0.0;   //setting private instance variables to 0.0 to make sure the system works no matter what
        y0 = 0.0;
        x1 = 0.0;
        y1 = 0.0;
        x2 = 0.0;
        y2 = 0.0;
    }

    // DO NOT DELETE THESE!
    public double getx0() {
        return x0;
    }
    public double gety0() {
        return y0;
    }
    public double getx1() {
        return x1;
    }
    public double gety1() {
        return y1;
    }
    public double getx2() {
        return x2;
    }
    public double gety2() {
        return y2;
    }

    public double perimeter() {
        double distance1;
        double distance2;
        double distance3;

        distance1 = Math.sqrt(Math.pow((x2 - x1),2)+Math.pow((y2 - y1),2));
        distance2 = Math.sqrt(Math.pow((x1 - x0),2)+Math.pow((y1 - y0),2));
        distance3 = Math.sqrt(Math.pow((x2 - x0),2)+Math.pow((y2 - y0),2));

        double periValue = distance1 + distance2 + distance3;
        return periValue;
    }

    public double area() {
        double distance1;    //creating distance variables
        double distance2;
        double distance3;

        distance1 = Math.sqrt(Math.pow((x2 - x1),2)+Math.pow((y2 - y1),2));    //setting distance variables with distance formulas
        distance2 = Math.sqrt(Math.pow((x1 - x0),2)+Math.pow((y1 - y0),2));
        distance3 = Math.sqrt(Math.pow((x2 - x0),2)+Math.pow((y2 - y0),2));

        double s = (distance1 + distance2 + distance3)/2;
        double areaValue = Math.sqrt((s)*(s-distance1)*(s-distance2)*(s-distance3));

        return areaValue;

    }

    public void translateX(double TXvalue) {
        x0 += TXvalue;    // adding translation value
        x1 += TXvalue;
        x2 += TXvalue;
    }

    public void translateY(double TYvalue) {
        y0 += TYvalue;    //adding translation value
        y1 += TYvalue;
        y2 += TYvalue;
    }

}
