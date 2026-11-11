
import java.util.Scanner;

public class TuitionFees {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        String programCode;
        int semester;
        int creditHours;
        String programName = "";
        int feePerCredit = 0;
        int semesterFee = 0;
        boolean validCode = true;
        boolean validSemester = true;
 
        System.out.print("Program code: ");
        programCode = input.next().toUpperCase();
        System.out.print("Semester number: ");
        semester = input.nextInt();
        System.out.print("Credit hours registered: ");
        creditHours = input.nextInt();
 
        switch (programCode) {
            case "MCS":
                programName = "Master of Computer Science";
                feePerCredit = 250;
                if (semester == 1) {
                    semesterFee = 1250;
                } else if (semester >= 2) {
                    semesterFee = 1000;
                } else {
                    validSemester = false;
                }
                break;
 
            case "ME":
                programName = "Master of Environment";
                feePerCredit = 250;
                if (semester == 1) {
                    semesterFee = 1400;
                } else if (semester >= 2) {
                    semesterFee = 1100;
                } else {
                    validSemester = false;
                }
                break;
 
            case "MPM":
                programName = "Master in Plantation Management";
                feePerCredit = 275;
                if (semester == 1) {
                    semesterFee = 1250;
                } else if (semester >= 2) {
                    semesterFee = 1000;
                } else {
                    validSemester = false;
                }
                break;
 
            case "MEOH":
                programName = "Master of Environmental and Occupational Health";
                feePerCredit = 350;
                if (semester == 1) {
                    semesterFee = 1250;
                } else if (semester >= 2) {
                    semesterFee = 1000;
                } else {
                    validSemester = false;
                }
                break;
 
            default:
                validCode = false;
        }
 
        System.out.println("--------------------------------------------------------------");
        if (!validCode) {
            System.out.println("Invalid programme code!");
        } else if (!validSemester) {
            System.out.println("Invalid semester!");
        } else {
            int totalFee = semesterFee + (creditHours * feePerCredit);
            System.out.println("Master program: " + programName);
            System.out.println("Semester number: " + semester);
            System.out.println("Credit hours: " + creditHours);
            System.out.println("Total tuition fees: RM" + totalFee);
        }
 
        input.close();
    }
}
 


