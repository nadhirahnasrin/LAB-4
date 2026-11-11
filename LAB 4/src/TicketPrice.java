import java.util.Scanner;

public class TicketPrice {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        int age;
        int parkType;
        double charge = 0;
        String ageGroup = "";
        String parkName = "";
        boolean valid = true;
 
      
        System.out.println("===================================");
        System.out.println("   WELCOME TO MAHKOTA THEME PARK   ");
        System.out.println("===================================");
        System.out.print("Enter visitor's age: ");
        age = input.nextInt();
 
        System.out.println("\nSelect park type:");
        System.out.println("  1. Theme Park");
        System.out.println("  2. Water Park");
        System.out.println("  3. Both Parks");
        System.out.print("Enter choice (1-3): ");
        parkType = input.nextInt();
 
    
        if (age >= 55) {
            ageGroup = "Over 55";
            if (parkType == 1) {
                parkName = "Theme Park";
                charge = 10;
            } else if (parkType == 2) {
                parkName = "Water Park";
                charge = 15;
            } else if (parkType == 3) {
                parkName = "Both Parks";
                charge = 20;
            } else {
                valid = false;
            }
        } else if (age >= 21 && age <= 54) {
            ageGroup = "21-54";
            if (parkType == 1) {
                parkName = "Theme Park";
                charge = 25;
            } else if (parkType == 2) {
                parkName = "Water Park";
                charge = 30;
            } else if (parkType == 3) {
                parkName = "Both Parks";
                charge = 45;
            } else {
                valid = false;
            }
        } else if (age >= 13 && age <= 20) {
            ageGroup = "13-20";
            if (parkType == 1) {
                parkName = "Theme Park";
                charge = 20;
            } else if (parkType == 2) {
                parkName = "Water Park";
                charge = 25;
            } else if (parkType == 3) {
                parkName = "Both Parks";
                charge = 40;
            } else {
                valid = false;
            }
        } else if (age >= 3 && age <= 12) {
            ageGroup = "3-12";
            if (parkType == 1) {
                parkName = "Theme Park";
                charge = 10;
            } else if (parkType == 2) {
                parkName = "Water Park";
                charge = 15;
            } else if (parkType == 3) {
                parkName = "Both Parks";
                charge = 20;
            } else {
                valid = false;
            }
        } else if (age >= 0 && age <= 2) {
            ageGroup = "Under 3";
            if (parkType == 1) {
                parkName = "Theme Park";
                charge = 0;      // Free
            } else if (parkType == 2) {
                parkName = "Water Park";
                charge = 7;
            } else if (parkType == 3) {
                parkName = "Both Parks";
                charge = 5;
            } else {
                valid = false;
            }
        } else {
            valid = false;  
        }
 
        System.out.println("\n-----------------------------------");
        if (age < 0) {
            System.out.println("Invalid age! Age cannot be negative.");
        } else if (!valid) {
            System.out.println("Invalid park type! Please choose 1, 2 or 3.");
        } else {
            System.out.println("          TICKET SUMMARY           ");
            System.out.println("-----------------------------------");
            System.out.println("Age             : " + age);
            System.out.println("Age group       : " + ageGroup);
            System.out.println("Park type       : " + parkName);
            if (charge == 0) {
                System.out.println("Ticket charge   : FREE");
            } else {
                System.out.printf("Ticket charge   : RM%.2f%n", charge);
            }
            System.out.println("-----------------------------------");
            System.out.println("   Thank you and enjoy your visit!  ");
        }
 
        input.close();
    }
}
 