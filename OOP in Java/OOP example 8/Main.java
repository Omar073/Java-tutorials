// 15- Typecasting: Upcasting & Downcasting and what they can access explained
// a good video to explain the concept https://www.youtube.com/watch?v=Qpz2MA4KE9U

public class Main {
    public static void main(String[] args) throws Exception {

        ParentClass p = new SubClassA(); // Upcasting
        // Entity of type parent class can hold the reference of child class

        //When upcasting:
        // The variable type (ParentClass) determines: what methods are available to call,
        // meaning only methods of the variable (ParentClass) type are available.

        // The object type (SubClassA) determines: what version of the method is executed.
        // meaning the version of the method in the object type (SubClassA) is executed.

        p.test(); // Can access only parent class methods
        p.testa();
        // p.testb(); // error
        ((SubClassA) p).testb(); // we can bypass this error by using parenthesis () and downcasting
        System.out.println();

        //////////////////////////////////////////////////////////////////////////////////////////////////

        // SubclassA s1 = p; // error because compiler isnt sure if p is of type subclassA or not
        SubClassA s1 = (SubClassA) p; // Downcasting
        // Entity of type child class can hold the reference of parent class
        s1.test(); // Can access both methods of parent and subclassA
        s1.testa();
        s1.testb();
        System.out.println();

        //////////////////////////////////////////////////////////////////////////////////////////////////

        ParentClass p2 = new ParentClass(); // Parent entity
        p2.test(); // Can access only parent class methods
        p2.testa();
        // p2.testb(); // error
        System.out.println();

        //////////////////////////////////////////////////////////////////////////////////////////////////

        SubClassA s2 = new SubClassA(); // Child entity
        s2.test(); // Can access both methods of parent and subclassA
        s2.testa();
        s2.testb();
        System.out.println();

        //////////////////////////////////////////////////////////////////////////////////////////////////

        SubClassB s3 = new SubClassB(); // Child entity
        // (SubClassA(s3)).testb(); // error because s3 is'nt of type subclassA

    }
}


class ParentClass{

    void test(){
        System.out.println("this is parent class");
    }
    void testa(){
        System.out.println("this is parent class A"); 
    }
}

class SubClassA extends ParentClass {

    @Override
    void test(){
        System.out.println("this is subclass A overriding parent class");
    }
    void testb(){
        System.out.println("this is subclass A");
    }
}

class SubClassB extends SubClassA {

    @Override
    void test(){
        System.out.println("this is subclass B overriding SubClass A");
    }
    void testc(){
        System.out.println("this is subclass B");
    }
}