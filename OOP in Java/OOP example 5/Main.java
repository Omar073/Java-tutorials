// 12- abstract class example and how we can make an entity of an abstract class using an anonymous inner class by adding {}
// this is not included in the curriculum and
// if you are asked if you can make an instance of an abstract class the answer is still no, as this method creates an anonymous subclass


public class Main {
    public static void main(String[] args) throws Exception {

        Shape matrix = new Shape(){};
        Square square = new Square();
        matrix.display();
        square.display();
        //output
        // hellooo
        //helloo222
    }
}

abstract class Shape{

    void display(){
        System.out.println("hellooo");
    }
}

class Square extends Shape {

    void display(){
        System.out.println("helloo222");
    }
}
