import java.awt.*;

public class Circle{
    
    Point center;
    double radius;

    Circle() {} // default constructor

    // constructor
    Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
    }

    double getPerimeter(){
        return 2 * this.radius;
    }

    double getArea(){
        return Math.pow(this.radius, 2);
    }
}