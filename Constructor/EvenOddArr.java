import java.util.*;

class EvenOdd{
    int []arr; int n;
    EvenOdd(int []arr, int n){
        this.arr = arr;
        this.n = n;
    }
    EvenOdd count(){
        int even = 0, odd = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0) even++;
            else odd++;
        }
        return new EvenOdd(new int[] {even, odd}, 2);
    }
    void display(){
        System.out.println("Even: "+arr[0]+" Odd: "+arr[1]);
    }
}

public class EvenOddArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter ary elemnts: ");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array: " + Arrays.toString(arr));
        EvenOdd ob = new EvenOdd(arr, n);
        EvenOdd ref = ob.count();
        ref.display();
    }
}
