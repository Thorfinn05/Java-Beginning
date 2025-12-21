public class Sem9 {
    public static void main(String[] args){
        String s1 = new String("Hello");
        s1=s1.replace('e', 'a');
        System.out.println(s1); 

        String s2 = "Hello hello Woggy Boggy";

        System.out.println(s2.length());

        System.out.println(s1.concat(s2));

        String s3 = "I was thinking.";

        char result = s3.charAt(4);
        System.out.println(result);

        System.out.println(s3.indexOf('i', 9));

        System.out.println(s3.substring(2, 9));

        String s4 = "I Wish I Were A Bird";
        char a[] = s4.toCharArray();
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }

        System.out.println(s4.toLowerCase());
        System.out.println(s4.toUpperCase());
        
        System.out.println(s4.trim());
    }
}
