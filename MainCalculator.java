/**
 * Name: Aryan Kiran Revankar
 * PRN: 24070126502
 * Batch: SY AIML A1
 */

 import java.util.Scanner;

 public class MainCalculator {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         boolean continueCalc = true;
 
         while (continueCalc) {
             System.out.println("\nChoose Operation:");
             System.out.println("1) Addition\n2) Subtraction\n3) Multiplication\n4) Division");
             System.out.println("5) Square\n6) Cube\n7) Square Root\n8) Exit");
 
             int choice = sc.nextInt();
 
             try {
                 switch (choice) {
                     case 1:
                         System.out.println("Enter two numbers:");
                         System.out.println("Result: " + Addition.add(sc.nextDouble(), sc.nextDouble()));
                         break;
                     case 2:
                         System.out.println("Enter two numbers:");
                         System.out.println("Result: " + Subtraction.subtract(sc.nextDouble(), sc.nextDouble()));
                         break;
                     case 3:
                         System.out.println("Enter two numbers:");
                         System.out.println("Result: " + Multiplication.multiply(sc.nextDouble(), sc.nextDouble()));
                         break;
                     case 4:
                         System.out.println("Enter two numbers:");
                         System.out.println("Result: " + Division.divide(sc.nextDouble(), sc.nextDouble()));
                         break;
                     case 5:
                         System.out.println("Enter a number:");
                         System.out.println("Result: " + Square.square(sc.nextDouble()));
                         break;
                     case 6:
                         System.out.println("Enter a number:");
                         System.out.println("Result: " + Cube.cube(sc.nextDouble()));
                         break;
                     case 7:
                         System.out.println("Enter a number:");
                         System.out.println("Result: " + SquareRoot.squareRoot(sc.nextDouble()));
                         break;
                     case 8:
                         continueCalc = false;
                         System.out.println("Exiting Calculator. Thank you!");
                         break;
                     default:
                         System.out.println("Invalid choice. Please select from 1 to 8.");
                 }
             } catch (Exception e) {
                 System.out.println("Error: " + e.getMessage());
             }
         }
 
         sc.close();
     }
 }
 