public class Sem11 {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Hello");

        System.out.println(sb.append(" World!"));

        System.out.println(sb.length());

        System.out.println(sb.capacity());

        System.out.println(sb.charAt(3));

        System.out.println(sb.delete(1, 4));

        System.out.println(sb.deleteCharAt(1));

        char [] box = new char[5];
        sb.getChars(2,7, box, 0);
        System.out.println(box);

        sb.insert(1,"Java"); 
        System.out.println(sb);

        sb.setCharAt(2,"M"); 
        System.out.println(sb);


    }
}
