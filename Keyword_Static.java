class Student {
    int roll_no;
    String name;
    // static variable to be shared among all student objects
    static String college = "Techno Main Salt Lake";

    // constructor to initialize instance variables
    Student(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }

    // method to display the values
    void display() {
        // Added spaces for readability
        System.out.println("Roll: " + roll_no + ", Name: " + name + ", College: " + college);
    }
}

public class Keyword_Static {
    public static void main(String[] args) {
        Student s1 = new Student(10, "Aitijhya");
        Student s2 = new Student(88, "Rudranil");
        
        s1.display();
        s2.display();
    }
}