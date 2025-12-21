package package2;
import package1.fun;
import java.util.*;
public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st num: ");
        int x = sc.nextInt();
        System.out.println("Enter 2nd num: ");
        int y = sc.nextInt();
        fun ob = new fun();
        int r = ob.sum(x, y);
        System.out.println(r);
    }
}
