class Student{
    String name;
    int age;
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    Student(Student ref){
        this.name = ref.name;
        this.age = ref.age;
    }
    void displayData(){
        System.out.println("Name: " + this.name + "\nAge: " + this.age);
    }
}
public class Copy_Constructor {
    public static void main(String args[]){
        Student s1 = new Student("Ruddranil", 20);
        Student s2 = new Student(s1);
        s1.displayData();
        s2.displayData();
    }
}
