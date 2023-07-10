// 18- how to invoke a constructor in the same class

public class MyClass {
    private String name;
    private int age;

    public MyClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public MyClass(String name) {
        this(name, 0); // invoke the first constructor with default age
    }
}