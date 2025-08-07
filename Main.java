class Car {
    String brand;
    Car(String brand){
        this.brand = brand;
    }
}

public class Main {
    public static void main(String args[]){
        Car car1 =  new Car ("BMW");
        Car car2 = new Car ("BMW");
        System.out.println(car1 == car2);  // Output: false
    }
}
