import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[3];

        System.out.println("Type in 3 numbers");
        for (int i = 0; i < 3; i++) {
            System.out.print("Number: " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        double max = Math.max(numbers[0], Math.max(numbers[1], numbers[2]));
        double min = Math.min(numbers[0], Math.min(numbers[1], numbers[2]));
        double average = (numbers[0] + numbers[1] + numbers[2]) / 3;
        
        System.out.println("Result: ");
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + String.format("%.4f", average));
    }
}