class Outer{
    int outer_x = 10;
    int outer_y = 20;
    private int outer_q = 50;
    static int outer_z = 30;
    private static int outer_p = 40;
    //STATIC-INNER
    static class Inner{
        void display(){
            //Non-Static variable cannot be accessed in static inner class
            // System.out.println(outer_x);
            // System.out.println(outer_q);

            System.out.println(outer_z);
            System.out.println(outer_p);
        }
    }
}

class Outer1{
    int outer_x = 10;
    int outer_y = 20;
    private int outer_q = 50;
    static int outer_z = 30;
    private static int outer_p = 40;
    //NON-STATIC INNER
    class Inner1{
        void display(){
            //Non-Static Inner class can print everything of outer class
            System.out.println(outer_x);
            System.out.println(outer_q);

            System.out.println(outer_z);
            System.out.println(outer_p);
        }
    }
}

public class Sem8 {
    public static void main(String[] args){
        Outer.Inner ob = new Outer.Inner();
        ob.display();
        Outer1 ob1 = new Outer1();
        Outer1.Inner1 ob2 = ob1.new Inner1();
        ob2.display();
    }
}
