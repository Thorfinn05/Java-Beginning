class A {
    void fun(){
        System.out.println("Hello");
    }
}
class B extends A {
    void fun(){
        System.out.println("Hello World");
    }
}

public class Method_Overriding {
    public static void main(String[] args){
        A ob = new A();
        ob.fun();  //Output: Hello World
        B obj = new B();
        obj.fun();  //Output: Hello World
        A ref = new B();
        ref.fun();  //Output: Hello World
    }
}
