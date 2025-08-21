class Student{
    int roll;
    String name;
    Student(int roll, String name){
        this.roll = roll;
        this.name = name;
    }
    void display(){
        System.out.println("Parameterized Constructor: \nName: " + name + ", Roll: " + roll);
    }
}

public class Parameterized_Constructor {
    public static void main(String[] args){
        Student s = new Student(4, "Rudranil");
        s.display();
    }
}
