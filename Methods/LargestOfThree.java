import java.util.Scanner;

class Largest{
    int largestInt;
    int largest(int a, int b, int c){
        if(a >= b && a >= c){
            largestInt = a;
        }
        else if (b >= a && b >= c){
            largestInt = b;
        }
        else{
            largestInt = c ;
        }
    //     System.out.println("Largest = " + largestInt);
    return largestInt;
    }
    // return largestInt;
}
public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 number: ");
        int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt();
        Largest ob = new Largest();
        System.out.println("Largest = " + ob.largest(a, b, c));
    }
}
