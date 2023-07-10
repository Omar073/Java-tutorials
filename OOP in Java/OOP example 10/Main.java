// 16- OOP concepts

// Encapsulation:
// Encapsulation is the process of combining data and functions into a single unit called class, and restricting access
//  to the data from outside of the class. In encapsulation, the internal details of the object are hidden from the outside world,
//  and the access to them is restricted through the use of access modifiers such as public, private and protected.
//  Encapsulation helps to achieve data hiding, abstraction, and modularization of code.

// Example: Consider a bank account class that has fields like account number, account balance,
//  and account holder name. The class has methods like deposit(), withdraw(), and getBalance().
//  The account balance is hidden from the outside world, and can only be accessed through the deposit and withdraw methods.

// This is basically just the process of making classes and instance methods and such

class Student {
    private String name;
    private int age;

   // setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

   // getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}

/////////////////////////////////////////////////////////////////////////////

//Inheritance:
// Inheritance: Inheritance is a mechanism in object-oriented programming that allows a new class to be based on an existing class,
// inheriting all of its properties and methods. The new class is called the subclass or derived class,
// and the existing class is called the superclass or base class.

// Example: Consider a class called Animal, and two subclasses of Shape called Dog and Cat. 
// Both Dog and Cat inherit the properties and methods of Shape, 
// but they also have their own unique properties and methods.


class Animal {
    public void eat() {
        System.out.println("The animal is eating");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("The dog is barking");
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println("The cat is meowing");
    }
}

// In the above example, the Dog class is a subclass of the Animal class.
// It inherits the eat() method from the Animal class and adds a new method bark().

//////////////////////////////////////////////////////////////////

// Abstraction:
// Abstraction is a concept in object-oriented programming that focuses on the essential features of an object
//  and ignores the non-essential details. It is the process of hiding implementation details and
//  showing only the necessary features of an object to the outside world.
//  Abstraction is achieved through abstract classes and interfaces.

abstract class Shape1 {
    abstract void draw();
}

class Circle1 extends Shape1 {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

// In the above example, the Shape class is an abstract class that contains an abstract method draw().
//  The Circle class extends the Shape class and implements the draw() method. The Shape class represents
//  the essential features of all shapes, and the Circle class represents a specific shape.

//////////////////////////////////////////////////////////////////

// Polymorphism:
// Polymorphism is a concept in object-oriented programming that allows objects of different classes to be treated 
// as if they were objects of the same class. Polymorphism can be achieved through method overloading and method overriding.

// Example: Consider a Shape class with a draw() method. The draw() method is overridden in two subclasses of Shape called 
// Circle and Rectangle. When the draw() method is called on an instance of Circle or Rectangle, 
// it behaves differently based on the type of the object. This is an example of polymorphism in action.


class Shape2 {
    void draw() {
        System.out.println("Drawing Shape");
    }
}

class Circle2 extends Shape2 {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle2 extends Shape2 {
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

// In the above example, the Shape class has a draw() method that prints "Drawing Shape".
// The Circle and Rectangle classes override the draw() method and provide their own implementation.
// The draw() method can be called on objects of type Shape, Circle, or Rectangle, 
// and the appropriate implementation will be executed. This is an example of polymorphism.
