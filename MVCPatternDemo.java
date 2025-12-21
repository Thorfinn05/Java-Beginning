//The Model
class Student {
    private String rollNo;
    private String name;
    public String getName(){
        return name;
    }
    public String getrollno() {
        return rollNo;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setrollNo(String rollNo){
        this.rollNo = rollNo;
    }
}

//The View
class Studentview{
    public void printStudentDetails(String studentname, String studentrollNo){
        System.out.println("Student: ");
        System.out.println("name: " + studentname);
        System.out.println("Roll No: " + studentrollNo);
    }
}

//The Controller
class StudentController{
    private Student model;
    private Studentview view;

    public StudentController(Student model, Studentview view){
        this.model = model;
        this.view = view;
    }

    public void setStudentname(String name){
        model.setName(name);
    }
    public void setStudentrollNo(String rollNo){
        model.setrollNo(rollNo);
    }
    public void updateView(){
        view.printStudentDetails(model.getName(), model.getrollno());
    }
}

//The main
public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = new Student();
        model.setName("Aitijhya");
        model.setrollNo("010");

        Studentview view = new Studentview();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentname("Rudra");
        controller.setStudentrollNo("088");
        controller.updateView();
    }
}