// 22- example for exception handling in java

import java.util.Scanner;
import java.util.InputMismatchException;

// public class Main {
//     public static void main(String[] args) throws Exception {
    
//         Scanner scanner = new Scanner(System.in);

//         // exception = an event that occurs during the execution of a program that,
//         // disrupts the normal flow of instructions
//         try {
//             System.out.println("Enter a whole number to divide: ");
//             int x = scanner.nextInt ();
//             System.out.println("Enter a whole number to divide by: ");
//             int y = scanner.nextInt ();
//             int z = x/y;
//             System.out.println("result: " + z);
//         }
//         catch (ArithmeticException e) { // The type of exception you are catching is called arithmetic exception  this happens when you divide by zero
//             System.out.println("You can't divide by zero! IDIOT!");
// 	    // Note: ArithmeticException only works with integers and doesn't work when you make the result variable non-int type
//         }
//         catch (InputMismatchException e){ // This is called input mismatch exception this happens when you enter a string instead of a number
//             System.out.println("You must enter a whole number!");
// 	    // Note: InputMismatchException only works with integers and doesn't work when you use Integer.parseInt(scanner.nextLine());
//         }
//         catch (Exception e){ // This is called a generic exception
//             System.out.println("Something went wrong!");
//         }
//         finally { // This is called a finally block and it will always run wether there is an exception or not
//             System.out.println("This will always run!");
//         }
//         scanner.close();
//     }
// }

////////////////////////////////////////////////////////////////////

// same code but looping until user enters a proper value and also adding some improvments

public class Main {
    public static void main(String[] args) throws Exception {
    
        Scanner scanner = new Scanner(System.in);

        // exception = an event that occurs during the execution of a program that,
        // disrupts the normal flow of instructions
        boolean error;
        
        do{
            error = false;
            try {
                System.out.println("\nEnter a whole number to divide: ");
                int x = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter a whole number to divide by: ");
                int y = Integer.parseInt(scanner.nextLine());

                if (y == 0) {
                    throw new ArithmeticException("Division by zero!"); // You can manually throw an exception when dividing by zero
                }

                //int z = x / y ;
                float z = (float)x / y ; 
                // if the value of y is zero it won't trigger the arithmetic exception automatically because,
                // the result var type is float, this is why we manually throw an exception
                System.out.println("result: " + z);
            }

            catch (ArithmeticException e) { // The type of exception you are catching is called arithmetic exception this happens when you divide by zero
                System.out.println("You can't divide by zero! IDIOT!");
                error = true;
                // Note: ArithmeticException only works with integers and doesn't work when you make the result variable non-int 
                // therefore here it doesn't automatically catch when you divide by zero and you have to manually throw an exception as in line 27
            }

            catch (NumberFormatException e){ // This is called a number format exception and it happens when you try to parse a string that is not a number
                System.out.println("You must enter a number!");
                error = true;
                //scanner.nextLine();
                // we can still use catch (InputMismatchException e) if we add scanner.nextLine() to empty the buffer after catching the exception
            }

            catch (Exception e){ // This is called a generic exception
                System.out.println("Something else went wrong!");
                error = true;
            }

            finally { // This is called a finally block and it will always run wether there is an exception or not
                System.out.println("This will always run!");
            }

        }while(error);
        scanner.close();
    }
}