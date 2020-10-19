package com.example.project;

public class myTest {

    public static void main(String[] args) {

        Triangle firstTri = new Triangle(1, 1, 3, 2, 3, 5);

        System.out.println("x0 is "+firstTri.getx0());    //printing out each point with the expected value to check things are working right
        System.out.println("Expected 1.0");
        System.out.println("y0 is "+firstTri.gety0());
        System.out.println("Expected 1.0");
        System.out.println("x1 is "+firstTri.getx1());
        System.out.println("Expected 3.0");
        System.out.println("y1 is "+firstTri.gety1());
        System.out.println("Expected 2.0");
        System.out.println("x2 is "+firstTri.getx2());
        System.out.println("Expected 3.0");
        System.out.println("y2 is "+firstTri.gety2());
        System.out.println("Expected 5.0");

        System.out.println(firstTri.perimeter());    //testing the perimeter function
        System.out.println("Expected 9.7");

        System.out.println(firstTri.area());    //testing the area function
        System.out.println("Expected 3.0");


        firstTri.translateX(2);    //translating x-values
        firstTri.translateY(2);    //translating y-values

        System.out.println("x0 is "+firstTri.getx0());    //printing out each point with the expected value to check things are working right
        System.out.println("Expected 3.0");
        System.out.println("y0 is "+firstTri.gety0());
        System.out.println("Expected 3.0");
        System.out.println("x1 is "+firstTri.getx1());
        System.out.println("Expected 5.0");
        System.out.println("y1 is "+firstTri.gety1());
        System.out.println("Expected 4.0");
        System.out.println("x2 is "+firstTri.getx2());
        System.out.println("Expected 5.0");
        System.out.println("y2 is "+firstTri.gety2());
        System.out.println("Expected 7.0");

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        System.out.println("----------HERE MARKS THE NEXT START OF THE TESTS FOR THE NEXT TRIANGLE----------");
        Triangle zeroTri = new Triangle(0, 0, 0, 0, 0, 0);

        System.out.println("x0 is "+zeroTri.getx0());    //printing out each point with the expected value to check things are working right
        System.out.println("Expected 0.0");
        System.out.println("y0 is "+zeroTri.gety0());
        System.out.println("Expected 0.0");
        System.out.println("x1 is "+zeroTri.getx1());
        System.out.println("Expected 0.0");
        System.out.println("y1 is "+zeroTri.gety1());
        System.out.println("Expected 0.0");
        System.out.println("x2 is "+zeroTri.getx2());
        System.out.println("Expected 0.0");
        System.out.println("y2 is "+zeroTri.gety2());
        System.out.println("Expected 0.0");

        System.out.println(zeroTri.perimeter());    //testing the perimeter function
        System.out.println("Expected 0.0");

        System.out.println(zeroTri.area());    //testing the area function
        System.out.println("Expected 0.0");


        zeroTri.translateX(1);    //translating x-values
        zeroTri.translateY(2);    //translating y-values

        System.out.println("x0 is "+zeroTri.getx0());    //printing out each point with the expected value to check things are working right
        System.out.println("Expected 1.0");
        System.out.println("y0 is "+zeroTri.gety0());
        System.out.println("Expected 2.0");
        System.out.println("x1 is "+zeroTri.getx1());
        System.out.println("Expected 1.0");
        System.out.println("y1 is "+zeroTri.gety1());
        System.out.println("Expected 2.0");
        System.out.println("x2 is "+zeroTri.getx2());
        System.out.println("Expected 1.0");
        System.out.println("y2 is "+zeroTri.gety2());
        System.out.println("Expected 2.0");

    }
}
