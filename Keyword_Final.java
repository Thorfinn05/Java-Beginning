class Bike{
    final void run(){
        System.out.println("running");
    }
}
public class Keyword_Final extends Bike {
    public static void main(String[] args) {
        Keyword_Final ob = new Keyword_Final();
        ob.run();
    }
}
