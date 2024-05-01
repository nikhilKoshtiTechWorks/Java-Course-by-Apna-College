package Object_Oriented_Programming_systems.abstraction;

// Here Animal class actually doesn't make any sense so made this class as a abstract class which includes constructor, abstract & non-abstract methods

abstract class Animal {
    Animal() {
        System.out.println("You are creating an Animal");
    }
    String myFood;
    abstract void eats();
    public void Walks() {
        System.out.println("Animal eats");
    }
}

class Horse extends Animal {
    Horse() {
        System.out.println("You have created a Horse");
    }
    public void eats() {
        System.out.println("Eats vegeterian food");
    }
}

class Tiger extends Animal {
    String myFood = "meat";
    public void eats() {
        System.out.println("Eats non-vegeterian food that is " + myFood);
    }
}


public class Abstract {
    public static void main(String args[]) {
        Horse h1 = new Horse();
        h1.eats();
        Tiger t1 = new Tiger();
        t1.eats();
    }
}

/*
    Output:
    You are creating an Animal 
    You have created a Horse
    Eats vegeterian food
    You are creating an Animal
    Eats non-vegeterian food that is meat
 */

/*
    When we create an object of Horse class firstly the Animal() constructor gets called and then the Horse().
    This phenamenon is called the 'Constructor Chaining' in inheritance
*/
