package Object_Oriented_Programming_systems.polymorphism;

// Method overloading is an example of compile time polymorphism
class Students {
    String name;
    int age;
    String std;

    public void printInfo(String name, String std) {
        if(std == null){
            System.out.println(name);
        } else {
            System.out.println(name+" "+std);
        }
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }

    Students(String name, int age, String std) {
        this.name = name;
        this.age = age;
        this.std = std;
    }
}

public class compileTimePolymorphism {

    public static void main(String[] args) {
        Students s1 = new Students("Nikhil", 20, "BE");
        s1.printInfo(s1.name, s1.std);
    }
}