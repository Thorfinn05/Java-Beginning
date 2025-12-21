final class Bike{  //final class can not be INHERITED
    final int speed = 100; //final variable is CONSTANT
    int speed = 200;
    final void run(){  //final method can't be OVERRIDDEN
        speed = 300;
        System.out.println("Speed: "+speed);
    }
    void run(){
        speed=300;
        System.out.println("Speed: "+speed);
    }
}
class Car extends Bike{
    void run(){
        speed = 400;
        System.out.println("Speed: " + speed);
    }
}


public class Sem5 {
    public static void main(String[] args){
        Car b = new Car();
        b.run();  //ERROR

    }
}
