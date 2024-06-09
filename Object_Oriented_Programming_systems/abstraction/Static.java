package Object_Oriented_Programming_systems.abstraction;

class Student {
    String name;
    static String school;
    public static void changeSchool(String newSchool) {
        school = newSchool;
    }
}

public class Static {
    public static void main(String[] args) {
        Student.school = "MES";                         // We can access static variables without creating an object using class name (Student)
        Student s1 = new Student();
        s1.name = "Nikhil";
        System.out.println(Student.school + " " + s1.name);
        Student.changeSchool("NMV");
        System.out.println(Student.school + " " + s1.name);
    }
}
