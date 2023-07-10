//9- an array of objects from the same class and do functions on these objects while using constraints

import java.util.Scanner;
import java.awt.Point;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);

        System.out.printf("enter the number of circles: ");
        int num = Integer.parseInt(scanner.nextLine());

        Circle[] circles = new Circle[num];

        for(int i=0 ; i < num ; i++){

            System.out.println("\nEnter the center co-ordinates of the circle " + (i+1) ); // can use (Circle.countcircles()+1) instead of (i+1)
            System.out.print("X: ");
            int x = Integer.parseInt(scanner.nextLine());
            System.out.print("Y: ");
            int y = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter the radius of the circle: ");
            float r = Float.parseFloat(scanner.nextLine());

            System.out.printf("Which unit are you using, m or cm ? ");
            String unit = scanner.nextLine();

            circles[i] = new Circle(new Point(x, y), r, unit);

            
        }

        for(int i=0; i<circles.length; i++){
            String loop;
            String op;
            
            System.out.println("\nCircle " + (i+1) + " has been created with the following properties:");
            do{
                do{
                    System.out.println("Enter the operation you want to do\n'per' or 'area'");
                    op = scanner.nextLine();
                    switch(op){
                        case "per":
                            System.out.println(circles[i].getPerimeter() + "\u03c0 " + circles[i].unit + " = " + circles[i].getPerimeter() * Math.PI + " " + circles[i].unit); 
                            // "\u03c0" this prints the pi symbol
                            break;
                        case "area":
                            System.out.println(circles[i].getArea() + "\u03c0 " + circles[i].unit + "\u00B2 = " + circles[i].getArea() * Math.PI + " " + circles[i].unit + "\u00B2");
                            // "\u00B2" this prints the squared symbol
                            break;
                    }  
                }while(!op.equals("per") && !op.equals("area"));   
                
                System.out.print("Loop? ");
                loop = scanner.nextLine();
            }while(loop.equals("yes"));
        }

        //find out a way to print back the largest circle with the original unit (and print out its number **this one is done)
        //print out the largest circle
        //System.out.println("The largest circle is: " + test.largestCircle(circles).getArea() + "\u03c0 " + test.largestCircle(circles).unit + "\u00B2 = " + test.largestCircle(circles).getArea() * Math.PI + " " + test.largestCircle(circles).unit + "\u00B2");
        Object[] result = test.largestCircle(circles);
        Circle largestCircle = (Circle) result[0];
        int numLargest = (int) result[1];
        System.out.println("\nThe largest circle is circle #"+ (numLargest + 1) + " with an area of\n" + largestCircle.getArea() + "\u03c0 " + largestCircle.unit + "\u00B2 = " + largestCircle.getArea() * Math.PI + " " + largestCircle.unit + "\u00B2");

        System.out.println("\nThank you this is the end of this code");
        
        scanner.close();
    }
    
}

class test{
    // A function to find the largest circle and it's order
    public static Object[] largestCircle(Circle[] circles){
        int numLargest = 0;
        Circle largest = circles[0];
        for(int i=0 ; i < circles.length ; i++){
            if(!circles[i].unit.equals("m") ) {
                circles[i].unit = "m";
                circles[i].radius = circles[i].radius / 100;
            }
            if(circles[i].getArea() > largest.getArea()){
                largest = circles[i];
                numLargest = i;
            }
        }
        Object[] result = {largest, numLargest};
        return result;
    }
    // a fn to return the number of the largest circle
    public static int getNumLargest(Circle[] circles) {
        int numlargest = 0;
        Circle largest = circles[0];
        for (int i = 0; i < circles.length; i++) {
            if (circles[i].getArea() > largest.getArea()) {
                largest = circles[i];
                numlargest = i;
            }
        }
        return numlargest;
    //bonus question: try to merge the two functions into one
    }
}