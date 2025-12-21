import java.util.Scanner;

public class Sem12 {
    public static void main(String[] args) {
        //1.
        String s1 = "Hello";
        s1.concat(" World"); // This change is "lost" if not assigned
        
        System.out.println("Original String s1: " + s1); // Still prints "Hello"
        
        if (s1 == s1.concat(" World")) {
            System.out.println("Mutable");
        } else {
            System.out.println("String is Immutable");
        }

        //2.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.println("Characters: " + str.length());
        
        // Trim and split by whitespace to count words
        String[] words = str.trim().split(" ");
        System.out.println("Words: " + words.length);

        //3.
        String str1 = "I love Java programming";
        
        // Replace a word
        String newWordStr = str1.replace("Java", "Python");
        System.out.println("Replaced Word: " + newWordStr);
        
        // Replace characters
        String newCharStr = str1.replace('a', '@');
        System.out.println("Replaced Characters: " + newCharStr);

        //4.
        String str2 = "madam", rev = "";
        // str2 = str2+"ji";
        // System.out.println(str2); //madamji
        
        for (int i = str2.length() - 1; i >= 0; i--) {
            rev += str2.charAt(i);
        }
        
        if (str2.equals(rev)) 
            System.out.println(str2 + " is a Palindrome");
        else 
            System.out.println(str2 + " is not a Palindrome");
    }
}
