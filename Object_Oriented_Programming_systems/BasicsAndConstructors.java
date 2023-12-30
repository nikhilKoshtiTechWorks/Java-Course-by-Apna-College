package Object_Oriented_Programming_systems;

// Non-parameterized constrictor
class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name + " " + this.age);
    }

    // Non-parameterized constrictor
    Student() {
        System.out.println("Non-parameterized Constructor called");
    }
}

// Parameterized constrictor
class Pen {
    String name;
    String color;
    String type;

    public void write1(String color) {
        System.out.println("color is " + color);
    }
     
    public void write2() {
        System.out.println(this.name + " type is " + this.type);        // 'this' resembles the name of object eg. this.color -> pen1.color
    }

    // Parameterized constructor
    Pen(String argumentColor, String argumentType) {
        this.color = argumentColor;
        this.type = argumentType;
    }
}

// Copy constructor
class Tree {
    int height = 20;
    public void printHeight() {
        System.out.println(height);
    }

    Tree() {}
    
    Tree (Tree t) {
        this.height = t.height;
    }
}

public class BasicsAndConstructors {

    // Functions to create objects, assign values to data members and call data functions
    public static void callStudent() {
        Student s1 = new Student();
        // s1.name = "Nikhil";
        // s1.age = 20;
        System.out.print("s1 :");
        s1.printInfo();         // will print 'null 0' where name=null; age=0 are default values given automatically this is only possible with non-parameterized constructors because when we define a parameterized constructor we have to pass arguments at the time of object creation
    }
    
    public static void callPen() {
        Pen pen1 = new Pen("blue", "ball");
        pen1.name = "pen1";
        pen1.write1(pen1.color);    // both gives
        pen1.write2();              // same outputs
        
        Pen pen2 = new Pen("black", "gel");
        pen2.write1(pen1.color);                                        // we can use data members of another objects also
        pen2.write2();          
    }
    
    public static void callTree() {
        Tree t1 = new Tree();
        System.out.print("Default value: ");
        t1.printHeight();
        t1.height = 30;
        Tree t2 = new Tree(t1);         // used the copy contructor
        System.out.println("Changed height to 30 and then copied the object t1 in t2.");
        t2.printHeight();
    }
    
    public static void main(String[] args) {
        System.out.println("Studnet class");
        callStudent();
        System.out.println("\nPen class");
        callPen();
        System.out.println("\nTree class");
        callTree();
    }
}
