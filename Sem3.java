//Inheritence
class Vol{
    int length, bredth;
    Vol(int l, int b){
        length = l;
        bredth = b;
    }
    void area(){
        System.out.println("Result: "+(length*bredth));
    }
}

class Volume extends Vol{
    int weight;
    Volume(int l1, int b1, int w1){
        super(l1, b1);
        weight = w1;
    }
    void display(){
        System.out.println(weight+" "+bredth+" "+length);
    }
}

class A{
    public A(){
        System.out.println("Class A constructor");
    }
    int i = 10;
}
class B extends A{
    public B(){
        System.out.println("Class B");
    }
    int i=20;
}
class C extends B{
    public C(){
        System.out.println("Class C");
    }
    int i = 30;
}

public class Sem3 {
    public static void main(String[] args){
        Volume ob = new Volume(3, 5, 2);
        ob.area();
        ob.display();
        C a = new C(); //i=30
        // B a = new B() new C(); //i=20
        // A a = new A() new B() new C(); //i=10
        System.out.println(a.i);
    }
}
