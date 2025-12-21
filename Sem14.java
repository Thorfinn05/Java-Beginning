public class Sem14 {
    public static String selectLetters(String s1, String s2){
        StringBuffer result = new StringBuffer();
        int minlen = Math.min(s1.length(), s2.length());
        for(int i=0; i<minlen; i++){
            if(Character.isUpperCase(s1.charAt(i))){
                result.append(s2.charAt(i));
            }
            if(Character.isUpperCase(s2.charAt(i))){
                result.append(s1.charAt(i));
            }
        }
        return result.toString();
    }
    public static void main(String[] args){
        System.out.println("Result: "+selectLetters("heLLo", "GUlp"));
    }
}
