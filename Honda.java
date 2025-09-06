class Bike{
    final void run(){
        System.out.println("running");
    }
}
public class Honda extends Bike {
    void run(){
        System.out.println("running smoothly");
    }
    public static void main(String[] args) {
        Honda ob = new Honda();
        ob.run();
    }
}
