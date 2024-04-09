package Exception_Handling;

import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter the marks: ");
            int marks = scanner.nextInt();
            
            if (marks < 0 || marks > 100) {
                throw new IllegalArgumentException("Marks should be between 0 and 100");
            }
            
            if (marks >= 20) {
                System.out.println("Student has passed!");
            } else {
                System.out.println("Student has failed!");
            }

        } catch (Exception e) {
            System.out.println("Error: Invalid input");
        }
    }
}
