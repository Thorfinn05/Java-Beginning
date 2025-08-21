class Game{
    private int UID;
    public void setUID(int newUID){
        UID = newUID;
    }
    public int getUID(){
        return UID;
    }
}

public class Encapsulation {
    public static void main(String args[]){
        Game obj = new Game();
        obj.setUID(456782);
        System.out.println(obj.getUID());
    }
}
