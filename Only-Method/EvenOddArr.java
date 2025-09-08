import java .util.*;

public class EvenOddArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int []arr = new int [n];

        System.out.println("Enter Array Elements: ");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array: " + Arrays.toString(arr));

        int evenC = 0;
        int oddC = 0;
        for(int i=0; i<n; i++){
            if(arr[i]%2 == 0){
                evenC ++;
            }
            else{
                oddC++;
            }
        }
        System.out.println("Even count is "+evenC+" and Odd count is "+oddC);
    }
}
