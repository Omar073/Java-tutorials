// 20-Interfaces 
// this is the explanation that was in the slides
// What is an interface?
// Why is an interface useful?
// An interface is a classlike construct that contains only constants and abstract methods. 
// In many ways, an interface is similar to an abstract class, but the intent of an interface is to specify common behavior for objects. 
// For example, you can specify that the objects are comparable, edible, cloneable using appropriate interfaces.

// EXAMPLE:

public class Main {
    public static void main(String[] args) throws Exception {
    
        Hawk hawk = new Hawk();
        Fish fish = new Fish();
        Rabbit rabbit = new Rabbit();

        hawk.hunt(); // Hawk is hunting
        fish.hunt(); // Fish is hunting
        rabbit.flee(); // Rabbit is fleeing
        fish.flee(); // Fish is fleeing

    }
}