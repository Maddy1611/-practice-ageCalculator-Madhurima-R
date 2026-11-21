import java.util.Scanner;


public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();
        int yearsLeft = 100 - age;
        System.out.println("You have " + yearsLeft + " years until you are 100.");
        scanner.close();
    }
}
