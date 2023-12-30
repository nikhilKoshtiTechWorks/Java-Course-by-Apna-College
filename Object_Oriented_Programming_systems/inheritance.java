package Object_Oriented_Programming_systems;

// Hybrid Inheritence -> overall we are implementing this type of inheritence
/*
 *              Parent Class (Shape)
                          |
                ---------------------
                |                   |
        Child (Triangle)      Child (Circle)
                |
    Child (EquilateralTriangle)
    
 */

class Shape {
    String color;
}

// (Single Inheritence) Parent class --> Child Class
/*
 *              Parent Class (Shape)
                        |
                 Child (Triangle)

 */

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(0.5*h*l);
    }
}

// (Multilevel Inheritence) Parent class --> Child Class --> Child Class
/*
 *              Parent Class (Shape)
                        |
                 Child (Triangle)
                        |
            Child (EquilateralTriangle)

 */
class EquilateralTriangle extends Shape {
    public void area(int l, int h) {
        System.out.println(0.5*h*l);
    }
}

// (Hierarchical Inheritence)
/*
                Parent Class (Shape)
                          |
                ---------------------
                |                   |
        Child (Triangle)      Child (Circle)
 
 */
class Circle extends Shape {
    public void area(int r) {
        System.out.println(3.14*r*r);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Triangle tri1 = new Triangle();
        System.out.println(tri1.color);
    }
}
