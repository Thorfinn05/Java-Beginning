//Method Overloading
class A{
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a*b*c;
    }
}

//Method Overriding
class B {
    void fun(){
        System.out.println("hello");
    }
}
class C extends B{
    void fun(){
        System.out.println("hello there");
    }
}
public class Sem4 {
    public static void main(String[] args){
        A a = new A();
        int s1 = a.add(2,3);
        int s2 = a.add(2,3,4);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(a.add(2,4,5));

        B b = new C();
        b.fun();
    }
}
