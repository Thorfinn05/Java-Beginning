class outerClass{
    static int outer_x = 10;
    int outer_y = 20;
    private static int outer_private = 30;
    class innerClass{
        void display(){
            System.out.println(outer_x);
            System.out.println(outer_y);
            System.out.println(outer_private);
        }
    }
}

public class NonStaticNestedClass {
    public static void main(String[] args) {
        outerClass outer = new outerClass();
        outerClass.innerClass ob = outer.new innerClass();
        ob.display();
    }
}
