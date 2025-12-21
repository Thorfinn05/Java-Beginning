//Encapsulation
class Person{
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
}

public class Sem2 {
    public static void main(String[] args){
        Person ob = new Person();
        ob.setName("Rudra");
        System.out.println(ob.getName());
        ob.setAge(20);
        System.out.println(ob.getAge());
    }
}
