package exercises;
import java.util.Scanner;

public class InAndOut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Howdy! What's your name?");
        String name = input.nextLine();
        System.out.println("Welcome, " + name);
    }
}
