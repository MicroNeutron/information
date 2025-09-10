import java.util.Scanner;

public class lab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("please enter your name");
        String name = input.nextLine();
        
        System.out.println("please enter your age in years");
        byte aiy = input.nextByte();
        
        System.out.println("please enter your height in cm");
        int hicm = input.nextInt();
        
        System.out.println("please enter your GPA");
        double gpa = input.nextDouble();  
        
        System.out.println("do you like programming (true/false)");
        boolean prb = input.nextBoolean();
        
        input.nextLine();
        
        System.out.println("This is your information: ");
        System.out.println("Your name: "+ name);
        System.out.println("You have been on this world for " + aiy * 365 + " days. ");        
        System.out.println("Your height is " + hicm / 100.0 + " meters. ");     
        System.out.println("Your GPA is: " + gpa);
        if (prb = true) {
            System.out.println("You like programming");
        } else {
            System.out.println("You dont like programming");
        }    
    }
}