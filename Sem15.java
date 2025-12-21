public class Sem15 {
    public static void main(String[] args){
        try{
            int n1 = 50, n2 = 0;
            int[] a = new int[5];
            int r = n1/5;
            a[4] = r;
            try{
                int out = a[4]/0;
            }
            catch(ArithmeticException e){
                System.out.println(e);
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("hello\n");
    }
}
