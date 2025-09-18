import java.util.Scanner;
import java.math.BigInteger;

public class lab4 {
    public static void main(String[] args) {
//1
        for (int i = 1; i < 51; i++) {
            System.out.println(i);
        }
// print from 1 to 50

//2
        Scanner scanner = new Scanner(System.in);

        String pswd = "";
        System.out.println("\nType in JavaRocks to get in next step");
        while (!pswd.equals("JavaRocks")) {
            pswd = scanner.nextLine().trim();
        }
// keep looping if pswd doesn't equals to "JavaRocks"

//3
        int choice;

        do {
            System.out.println("\nMenu");
            System.out.println("1) Say Hello");
            System.out.println("2) Say Goodbye");
            System.out.println("3) Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("\nHello!");
                    break;
                case 2:
                    System.out.println("\nGoodbye!");
                    break;
                case 3:
                    System.out.println("\nExiting program...\n");
                    break;
                default:
                    System.out.println("\nInvalid choice! Please select 1-3.");
            }
        } while (choice != 3);
// use scanner to confirm the choice and use switch case to do the work, keep looping when choice unequals to 3)

//4
        int sum = 0;
        
        for (int num = 2; num <= 100; num += 2) {
            sum += num; 
        }
        
        System.out.println("Sum of even numbers from 2 to 100 is: " + sum + "\n");

// add current even number to sum

//5
        for (int k = 1; k <= 5; k++) {
            for (int l = 1; l <= k; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

// out for is for # of rows, in for is for # of * each rows. 

/*
        for (int j = 1; j < 2; j++) {
            System.out.println("*");
            System.out.println("**");
            System.out.println("***");
            System.out.println("****");
            System.out.println("*****");
        }
remain a "funny" solution
*/

//6
        int die1, die2;
        
        do {
            die1 = (int)(Math.random() * 6) + 1;
            die2 = (int)(Math.random() * 6) + 1;

            System.out.println("\nRoll: " + die1 + " and " + die2);
            
        } while (die1 != die2);
        
        System.out.println("\nDoubles! Both dice show " + die1);
//roll 2 dies from 1 to 6, keep looping if die 1 not equal to die 2)

//7
        for (int m = 1; m <= 10; m++) {
            for (int n = 1; n <= 10; n++) {

                System.out.printf("%4d", m * n);
            }
            System.out.println("\n");
        }
//use 2 variable from 1 to 10 to multiple

//8
        for (int row = 0; row < 8; row++) {

            for (int col = 0; col < 8; col++) {

                if ((row + col) % 2 == 0) {
                    System.out.print("X ");
                } else {
                    System.out.print("O ");
                }
            }
            System.out.println(); 
        }
// Put X and O in turn in every row when row + col is odd number

//9
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();
        
        StringBuilder reversedBuilder = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversedBuilder.append(input.charAt(i));
        }
        
        System.out.println("\nReversed string: " + reversedBuilder.toString());
//use scanner to get input and reverse it

//10
        double sum2 = 0;
        double max = Double.MIN_VALUE;  
        double min = Double.MAX_VALUE;  

        System.out.println("Enter 10 numbers:");
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number #" + i + ": ");
            double num2 = scanner.nextDouble();
            
            sum2 += num2;
            
            if (num2 > max) {
                max = num2;
            }
            
            if (num2 < min) {
                min = num2;
            }
        }
        
        double average = sum2 / 10;
        
        System.out.println("\nResults:");
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Average: " + average + "\n");
// input 10 of number and storage into num2, and singly calculate related data

//11
        for (int o = 1; o <= 5; o++) {
            for (int p = 1; p <= 5 - o; p++) {
                System.out.print(" ");
            }
            
            // Print stars
            for (int q = 1; q <= o; q++) {
                System.out.print("*");
            }
            
            // Move to next line
            System.out.println("\n");
        }
// same with 5 but add space based on lines

//12
        for (int i = 10; i >= 1; i--) {
            System.out.println(i + "...");
            
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("Countdown interrupted!");
                return;
            }
        }
        
        System.out.println("Blast Off!");
// use for to show time and sleep to stay

//13
        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();
        
        if (n < 0) {
            System.out.println("Error: Negative numbers not allowed");
            return;
        }
        
        BigInteger factorial = BigInteger.ONE;
        
        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        
        System.out.println(n + "! = " + factorial);
// input number in n, and times for more times using factorial.multiply

//14
        long st1 = 0; 
        long nd2 = 1; 
        
        System.out.println("First 15 Fibonacci numbers:");
        
        for (int i = 1; i <= 15; i++) {
            System.out.print(st1 + " ");
            

            long next = st1 + nd2;
            
            st1 = nd2;
            nd2 = next;
        }
// set the first and second, and set the next as third, and the first become second, the  second become third, keep looping

//15
        System.out.println("\n");
        for (int m2 = 1; m2 <= 12; m2++) {
            for (int n2 = 1; n2 <= 12; n2++) {

                System.out.printf("%4d", m2 * n2);
            }
            System.out.println("\n");
        }

    }
}