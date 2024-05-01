package Object_Oriented_Programming_systems.abstraction;

interface Animal {
    void walks();
}

interface Herbivore {

}

class Horse implements Animal, Herbivore {          // Multiple inheritance
    public void walks() {
        System.out.println("Walks on 4 legs");
    }
}

public class Interface {
    
}
