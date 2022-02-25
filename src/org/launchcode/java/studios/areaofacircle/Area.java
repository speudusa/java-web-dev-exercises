package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:  ");
        double userRad = input.nextDouble();
        // -- Task 1: calc area
//        double area = 3.14 * (userRad * userRad);
//        System.out.println("The area of a circle with a radius of " + userRad + " is: " + area);

        // -- Task 2:  use Circle method to return area
        // -- saved as a varialbe to print the output
        double circleArea = Circle.getArea(userRad);
        System.out.println(circleArea);
    }
}
