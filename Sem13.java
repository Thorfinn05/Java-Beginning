public class Sem13 {
    public static boolean canCreate(String s1, String s2){
        int[] letterCounts = new int[256];
        for(int i =0; i<s1.length(); i++){
            char c = s1.charAt(i);
            letterCounts[c]++;
        }
        for(int i=0; i<s2.length(); i++){
            char c = s2.charAt(i);
            letterCounts[c]--;
            if(letterCounts[c]<0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(canCreate("Java", "java"));  //false
        System.out.println(canCreate("Program", "Gram"));  //false
        System.out.println(canCreate("Aitijhya", "Ait"));  //true
    }
}
