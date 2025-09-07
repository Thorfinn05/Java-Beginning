class outerClass{
    static int outer_x = 20;
    int outer_y = 30;
    private static int outer_private = 40;
    static class staticInnerClass{
        void display(){
            System.out.println(outer_x);
            System.out.println(outer_private);
        }
    }
}

public class Static_Nested_Class {
    public static void main(String[] args) {
        outerClass.staticInnerClass ob = new outerClass.staticInnerClass();
        ob.display();
    }
}
