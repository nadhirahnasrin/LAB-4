import java.util.Scanner;

public class BMIHealthRisk {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        char gender;
        double bmi;
        double waist;
        String category;
        boolean higherRisk = false;
        boolean validGender = true;
 
        System.out.println("===================================");
        System.out.println("   BMI AND HEALTH RISK CHECKER     ");
        System.out.println("===================================");
        System.out.print("Enter gender (F/M): ");
        gender = Character.toUpperCase(input.next().charAt(0));
        System.out.print("Enter BMI: ");
        bmi = input.nextDouble();
        System.out.print("Enter waist size (inches): ");
        waist = input.nextDouble();
 
        if (bmi >= 35) {
            category = "Severely Obese";
        } else if (bmi >= 30 && bmi <= 34.9) {
            category = "Obese";
        } else if (bmi >= 25 && bmi <= 29.9) {
            category = "Overweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            category = "Normal";
        } else {
            category = "Below normal range";
        }

        if (gender == 'F' && waist > 35) {
            higherRisk = true;
        } else if (gender == 'M' && waist > 40) {
            higherRisk = true;
        } else if (gender != 'F' && gender != 'M') {
            validGender = false;
        }
        
        System.out.println("\n-----------------------------------");
        if (!validGender) {
            System.out.println("Invalid gender! Please enter F or M.");
        } else {
            System.out.println("Weight category : " + category);
            if (higherRisk) {
                System.out.println();
                System.out.println("********************************************");
                System.out.println("CAUTION!!");
                System.out.println("Women - waist size > 35 inches");
                System.out.println("Men   - waist size > 40 inches");
                System.out.println("----- HIGHER RISK FOR HEART DISEASE AND TYPE 2 DIABETES!! -----");
                System.out.println("********************************************");
            }
        }
 
        input.close();
    }
}
 


