public class MutipleCatch {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            
            // This might throw ArithmeticException
            // OR ArrayIndexOutOfBoundsException
            arr[5] = 30 / 0; 
            
        } 
        catch (ArithmeticException e) {
            System.out.println("Math error!");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error!");
        } 
        catch (Exception e) {
            // This is the "Generic" net. It catches anything else.
            // It MUST be the last catch block.
            System.out.println("Some other error occurred: " + e);
        }
    }
}