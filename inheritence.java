class volume{
    int length;
    int bredth;
    volume (int l, int b){
        length = l;
        bredth = b;
    }
    void compute(){
        int result;
        result = length * bredth;
        System.out.println(result);
    }
}

class weight extends volume{
    int w;
    weight (int l1, int b1, int w1){
        super(l1, b1);
        w = w1;
    }
    void display(){
        System.out.println(w);
    }
}

public class inheritence {
    public static void main(String[] args){
        weight ob = new weight(2,3,4);
        ob.compute();
        ob.display();
    }
}
