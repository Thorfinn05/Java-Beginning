import java.util.*;
class Student{
    int age;
    String name;
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    Student (Student s){
        this.name = s.name;
        this.age = s.age;
    }
    int roll;
    Student (int r){
        roll = r;
    }
    Student returndemo(){
        Student rore = new Student(roll+78);
        return rore;
    }
    void display(){
        System.out.println("Name: "+name+" Age: "+age);
    }
}
public class Sem1 {
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter name: ");
        // String name = sc.next();
        // System.out.println("Enter age: ");
        // int age = sc.nextInt();
        // Student s1 = new Student(name, age);
        // s1.display();
        // Student s2 = new Student(s1);
        // s2.display();
        Student r1 = new Student(10);
        System.out.println(r1.roll);
        Student r2;
        r2 = r1.returndemo();
        System.out.println(r2.roll);
    }
}
