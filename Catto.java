class Cat {
    String breed = "Persian";
    void sound(){
        System.out.println("Meow!");
    }
}
public class Catto {
    public static void main(String args[]){
        Cat c1 = new Cat();  // c1 is an Object
        c1.sound();     // accessing the method
        System.out.println(c1.breed);  // accessing attribute
    }
}