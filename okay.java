class Num {
    int a;
    Num(int i){
        a = i;
    }
    Num incr(){
        Num temp = new Num(a*2);
        return temp;
    }
    void incre(){
        a *= 3;
    }
}
public class okay {
    public static void main(String args[]){
        Num n1 = new Num(5);
        Num n2 = n1.incr();
        System.out.println(n1.a);
        System.out.println(n2.a);
        n1.incr();
        System.out.println(n1.a);
        n1.incre();
        System.out.println(n1.a);
    }
}