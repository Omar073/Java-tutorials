// 1- take input from user
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.printf("whats up, whats your name? ");
        String name = scanner.nextLine();
        System.out.printf("how old are you?, %s ", name);
        int age = Integer.parseInt(scanner.nextLine());
        // we use this line to avoid the next nextLine not being available by the compiler
        // to understand what I am saying try to replace this by
        // int test = scanner.nextInt(); and you will see the mistake
        System.out.printf("what coding language do you like? ");
        String lang = scanner.nextLine();
        System.out.printf("whats your gpa? ");
        float gpa = Float.parseFloat(scanner.nextLine());
        
        //System.out.println("your name is: " + name);
        System.out.printf("\nhey %s how you dooiiin.\n", name);
        System.out.printf("you were probably born in %d .\n", 2023-age);
        System.out.printf("%s is a great programming language.\n", lang);
        System.out.printf("you are %f away from 4.0 GPA.\n", 4-gpa);
        
        scanner.close();
    }
    
}

// 2- simple calculator using if statements
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.printf("enter first num: ");
        double num1 = Double.parseDouble(scanner.nextLine());
        
        System.out.printf("enter the desired operation: \n +,-,*,/: ");
        String symb = scanner.nextLine();
        
        System.out.printf("enter second num: ");
        double num2 = Double.parseDouble(scanner.nextLine());
        
        if(symb.equals("+")){
            System.out.printf("%f + %f = %f", num1,num2,num1+num2);
        }
        else if(symb.equals("-")){
            System.out.printf("%f - %f = %f", num1,num2,num1-num2);
        }
        else if(symb.equals("*")){
            System.out.printf("%f * %f = %f", num1,num2,num1*num2);
        }
        else if(symb.equals("-") && num2!= 0){
            System.out.printf("%f / %f = %f", num1,num2,num1/num2);
        }
        else{
            System.out.printf(" %s is not a supported operation or you want to divide by zero\n sobasically an error", symb);
        }
        scanner.close();
    }
    
}
*/

/*
3- simple calculator using switch case

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.printf("enter first num: ");
        double num1 = Double.parseDouble(scanner.nextLine());
        
        System.out.printf("enter the desired operation: \n +,-,*,/: ");
        String symb = scanner.nextLine();
        
        System.out.printf("enter second num: ");
        double num2 = Double.parseDouble(scanner.nextLine());
        
        switch(symb){
            case "+" :
                System.out.printf("%f + %f = %f", num1,num2,num1+num2);
                break;
            case "-" :
                System.out.printf("%f - %f = %f", num1,num2,num1-num2);
                break;
            case "*" :
                System.out.printf("%f * %f = %f", num1,num2,num1*num2);
                break;
            case "/" :
                if(num2 == 0){
                    System.out.printf("cannot divide by zero");
                    break;
                }
                System.out.printf("%f / %f = %f", num1,num2,num1/num2);
                break;
            default:
                System.out.printf(" %s is not a supported operation or you want to divide by zero\n sobasically an error", symb);
        }
        scanner.close();
    }
    
}
 */