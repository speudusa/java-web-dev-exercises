package exercises;
import java.util.Scanner;

public class NumberFun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's calculate the area of a rectangle.  What is the length?");
        double length = input.nextDouble();
        System.out.println("What is the width?");
        double width = input.nextDouble();
        System.out.println("The area of the rectangle is: " + (length * width));

    }
}
