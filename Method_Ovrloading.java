class C{
    int a, b;
    C(){
        this.a = a;
        this.b = b;
    }
    int maximum(int a, int b){
        if(a>b) return a;
        else return b;
    }
    int maximum(int x, int y, int z){
        if(x>y && x>z) return x;
        else if(y>x && y>z) return y;
        else return z;
    }
}

public class Method_Ovrloading {
    public static void main(String[] args) {
        C ob = new C();
        System.out.println("The maximum of two: " + ob.maximum(55, 42));
        System.out.println("The maximum of three: " + ob.maximum(45, 67, 23));
    }
}
