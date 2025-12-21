import java.util.ArrayList;
class Box<T1, T2> {
    T1 name;
    T2 value;

    Box(T1 name, T2 value){
        this.name = name;
        this.value = value;
    }

    public T1 getname(){
        return name;
    }

    public T2 getvalue(){
        return value;
    }
}
public class Generics{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        System.out.println(list.get(0));
        Box<String, Integer> box = new Box<>("Meow", 5);
        System.out.println(box.getvalue());
        System.out.println(box.getname());
        //can't be added as incompatible type 
        //list.add(123);
        //System.out.println(list.get(1));
    }
}