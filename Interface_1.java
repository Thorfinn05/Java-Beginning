interface B{
    int methodB(int i);  //Method is declared having just the defn
}

class A implements B{
    public int methodB(int i){
        return i = i*i;
    }
}

public class Interface_1 {
    public static void main(String[] args) {
        B ob = new A();
        System.out.println(ob.methodB(2));  //Reference of type B holds object of type A
    }
}
