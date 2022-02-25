package exercises;
import java.util.Scanner;

public class MilesPerGal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your Mileage: ");
        double miles = input.nextDouble();
        System.out.println("How many gallons did your car use? ");
        double gallons = input.nextDouble();
        System.out.println("Your miles-per-gallon is: " + miles/gallons);

    }
}
