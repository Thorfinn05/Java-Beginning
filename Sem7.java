//PCA1
abstract class Employee{
    private String name;
    private int employeeID;
    public Employee(String name, int employeeID){
        this.name = name;
        this.employeeID = employeeID;
    }
    public String getName(){
        return name;
    }
    public int getEmployeeID(){
        return employeeID;
    }
    public abstract double calculateSalary();
}

class Manager extends Employee{
    private int teamsize;

    public Manager (String name, int employeeID, int teamsize){
        super(name, employeeID);
        this.teamsize = teamsize;
    }
    public int getTeamsize(){
        return teamsize;
    }
    @Override
    public double calculateSalary(){
        double base = 50000;
        return (base + teamsize * 500);
    }
}

class Developer extends Employee{
    private String progLang;
    private int experience;
    public Developer(String name, int employeeID, String progLang, int experience){
        super(name, employeeID);
        this.progLang = progLang;
        this.experience = experience;
    }
    public String getProgLang(){
        return progLang;
    }
    public int getExperience(){
        return experience;
    }
    @Override
    public double calculateSalary(){
        // double experience = 5;
        double base = 30000;
        return (experience>5) ? (base+10000) : (base+5000);
    }
}

public class Sem7 {
    public static void main(String[] args){
        Manager man = new Manager("Aitijhya", 010, 8); //taking Manager as ref as I am printing teamsize too which is Employee unaware of
        Employee dev = new Developer("Rudranil", 88, "Java", 6); 
        System.out.println("Name: "+man.getName()+" ID: "+man.getEmployeeID()+" Teamsize: "+man.getTeamsize()+" Salary: "+man.calculateSalary());
        System.out.println("Name: "+dev.getName()+" ID: "+dev.getEmployeeID()+" Salary: "+dev.calculateSalary());
    }
}
