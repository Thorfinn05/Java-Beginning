// public class Sem16 {
//     static void checkAge(int age){
//         try{
//             if(age<18){
//                 throw new ArithmeticException("Not Eligible");
//             }
//             System.out.println("Eligible");
//         }
//         catch(ArithmeticException e){
//             System.out.println(e);
//         }
//     }
//     public static void main(String[] args){
//         checkAge(15);
//         System.out.println("End");
//     }
// }

public class Sem16 {
    static void checkAge(int age) throws ArithmeticException{
            if(age<18){
                throw new ArithmeticException("Not Eligible");
            }
            System.out.println("Eligible");
    }
    public static void main(String[] args){
        try{
            checkAge(15);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("End");
    }
}
