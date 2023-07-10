// 11- Generate a Package with two public classes:  Clinic class and Doctor class.
// Doctor class  should contain  a string for name, that must be constant (final),  a string for working_day
// ( ex: Saturday, Sunday ..etc.) and a static counter to count number of generated Doctors objects. 
// Implement a parametrized constructor that sets the name and working day.
// Clinic class should contain (1) a private array of 3 doctors . (2) A function  Insert_doctor , that accepts a doctor object and
// adds it in the array , and also  prints the value of the counter after each insertion.(3) A function display_doctors that 
// prints all the doctors names that work on a given day.
// Create a class with the main function in another package.
// In main generate a Clinic object  and scan data of  the 3 doctors and display all doctors who works on saturday.

import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Please enter the number of doctors in this clinic: ");
        int Numdoctors = Integer.parseInt(scanner.nextLine());

        Clinic clinic = new Clinic(); // we have only one clinic that has n doctors
        Doctor[] doctors = new Doctor[Numdoctors];

        for(int i = 0; i < Numdoctors; i++){
            System.out.print("\nEnter the name of doctor " + (Doctor.countdoctors + 1) + " : "); // we can also use i+1 instead of count doctors
            String name = scanner.nextLine();
            System.out.print("Enter the working day of the doctor: ");
            String day = scanner.nextLine().toLowerCase();

            doctors[i] = new Doctor (name, day);
        }

        clinic.display_doctors(doctors);

        System.out.print("\nThank you this is the end of this code.");
        
        scanner.close();
    }
}



