import java.awt.*;

public class Circle{
    
    Point center;
    double radius;
    String unit;
    static int numcircles;

    Circle() {
        numcircles++;
    } // default constructor

    // constructor
    Circle(Point center, double radius, String unit){
        this.center = center;
        this.radius = radius;
        this.unit = unit;
        numcircles++;
    }


    static int countcircles(){
        return numcircles;
    }

    double getPerimeter(){
        return 2 * this.radius;
    }

    double getArea(){
        return Math.pow(this.radius, 2);
    }
}