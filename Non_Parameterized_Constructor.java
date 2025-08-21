class Student{
    int roll;
    String name;
    Student(){
        this.roll = 4;
        this.name = "Rudranil";
    }
    void display(){
        System.out.println("Non-Parameterized Constructor: \nName: " + name + ", Roll: " + roll);
    }
}

public class Non_Parameterized_Constructor {
    public static void main(String[] args){
        Student s = new Student();
        s.display();
    }
}
