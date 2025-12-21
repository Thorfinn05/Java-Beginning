class Student{
    int roll;
    String name;
    static String college = "TMSL"; //Memory management only one time created class variable
    Student(int r, String n){
        roll = r;
        name = n;
    }
    void display(){
        System.out.println(roll+" "+name+" "+college);
    }
}

class Counter {
    int count = 0; //as this is getting created each time output is gonna be 1 every time
    static int counting = 0;  //one time creation hence increasing
    Counter(){
        count++;
        counting++;
        System.out.println(count+" "+counting);
    }
}

public class Sem6 {
    public static void main(String[] args){
        Student s = new Student(10, "RD");
        Student s2 = new Student(88, "AR");
        s.display();
        s2.display();
        Counter c1 = new Counter(); 
        Counter c2 = new Counter();
    }
}