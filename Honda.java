public class Honda {
    final int speedlimit = 90;
    void run(){
        speedlimit = 400;
    }
    public static void main(String[] args) {
        Honda ob = new Honda();
        ob.run();
    }
}
