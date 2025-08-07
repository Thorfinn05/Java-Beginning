class Student {
    String name;
    int age;
    // Parameterized Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Copy Constructor
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class Data {
    public static void main(String[] args) {
        Student s1 = new Student("Rudranil", 20);  // constructor invoked
        Student s2 = new Student(s1);              // copy constructor
        s1.display();
        s2.display();
    }
}
