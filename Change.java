class Student {
    int roll_no;
    String name;
    static String college = "Techno Main Salt Lake";
    static void change(){
        college = "TMSL";
    }
    Student(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }
    void display(){
        System.out.println("Roll: " + roll_no + " Name: " + name + " College: " + college);
    }
}
public class Change{
    public static void main(String[] args) {
        Student s1 = new Student(10, "Aitijhya");
        Student s2 = new Student(88, "Rudranil");
        s1.display();
        s2.display();
        Student.change();
        s1.display();
        s2.display();
    }
}
