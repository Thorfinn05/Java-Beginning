class Animal {                   // Modularity
    private String name;          // Encapsulation
    public Animal(String name){
        this.name = name;         // Constructor
    }
    public String getName() { return name; }
    public void speak(){      // Polymorphism (will be overridden)
        System.out.println(name + " makes a sound.");
    }
}
class Cat extends Animal{     // Inheritence -> Reusuability
    public Cat(String name){
        super(name);
    }
    public void speak(){     // Overriding -> Polymorphism
        System.out.println(getName() + " says: Meow!");
    }
}
public class Test{
    public static void main(String args[]){
        Animal a = new Cat("Kochu");  // Polymorphic Reference
        a.speak();                  // Output: Kouch says: Meow!
    }
}
