//8- A circle class that takes center point and radius and returns area and circumference

import java.util.Scanner;
import java.awt.Point;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);


        System.out.println("Enter the co-ordinates of the center");
        System.out.print("X: ");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.print("Y: ");
        int y = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter the radius of the circle: ");
        float r = Float.parseFloat(scanner.nextLine());

        System.out.printf("What unit are you using? ");
        String unit = scanner.nextLine();

        Circle c1 = new Circle(new Point(x, y), r);

        

        int loop;
        do{
        System.out.println("Enter the operation you want to do\n'per' or 'area'");
        String op = scanner.nextLine();
        switch(op){
            case "per":
                System.out.println(c1.getPerimeter() + "\u03c0 " + unit + " = " + c1.getPerimeter() * Math.PI + " " + unit); 
                // "\u03c0" this prints the pi symbol
                break;
            case "area":
                System.out.println(c1.getArea() + "\u03c0 " + unit + "\u00B2 = " + c1.getArea() * Math.PI + " " + unit + "\u00B2");
                // "\u00B2" this prints the squared symbol
                break;
        }  
        System.out.print("Loop? ");
        loop = Integer.parseInt(scanner.nextLine());
        }while(loop == 1);
        
        scanner.close();
    }
}
