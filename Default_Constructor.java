class Student{
    int roll=34;
    String name="Rudra";
    void display(){
        System.out.println("Default Constructor: \nName: " + name + ", Roll: " + roll);
    }
}

public class Default_Constructor {
    public static void main(String args[]){
        Student s = new Student();
        s.display();
    }
}
