import java.util.*;
class Largest{
    int largestInt;
    int a, b, c;
    Largest (int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    Largest (int largestInt){
        this.largestInt = largestInt;
    }
    Largest findLargest(){
        if (a>b && a>c){
            return new Largest(a);
        }
        else if (b>c && b>a){
            return new Largest(b);
        }
        else{
            return new Largest(c);
        }
    }

}
public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt();
        Largest ob = new Largest(a, b, c);
        Largest result = ob.findLargest();
        System.out.println("Largest Number: " + result.largestInt);
    }
}
