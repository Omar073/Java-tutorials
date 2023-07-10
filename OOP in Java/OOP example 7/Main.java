// 14- abstract calss examples and function overriding
// Create an Employee class (Abstract class) which contains:
// employeeName as a string, paymentPerHour as a integer number. All the parameters are protected.
// Parametrized constructor to fill the attributes.
// CalculateSalary() function. This function returns an integer number. The salary of the employee is calculated using the following equation: paymentPerHour * 8.
// Create Contractor class which is derived from Employee class. This class contains:
// WorkingHours as a private integer attribute.
// Parametrized constructor to fill all attributes.
// Implementation of calculateSalary function. The salary of the contractor is calculated using the following equation: paymentPerHour * WorkingHours.
// Create FullTimeEmployee class which is derived from Employee class. This class contains:
// overtime as a private integer attribute that represents additional working hours.
// Parametrized constructor to fill all attributes.
// Implementation of calculateSalary function. The salary of the FullTimeEmployee is calculated using the following equation: paymentPerHour * (8 + overtime).
// In another package, create a class that contains the main function:
// Create 2 objects from Contractor class and FullEmployee class.
// Display the salary of every employee.


public class Main {
    public static void main(String[] args) throws Exception {

        Contractor contractor = new Contractor("john", 80, 4);
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("alex", 100, 70);
        // bonus :  try to make so that the user enters the number of contractors and full time employees and their details

        System.out.println(contractor.Calc_salary());
        System.out.println(fullTimeEmployee.Calc_salary());

    }
}
