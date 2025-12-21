import java.io.*;

public class FileDemo {
    public static void main(String[] args) {
        
        // 1. WRITING to a file
        try {
            FileWriter writer = new FileWriter("test.txt");
            writer.write("Hello World!\nThis is a text file.");
            writer.close(); // ALWAYS close streams!
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
        }

        // 2. READING from a file
        try {
            FileReader reader = new FileReader("test.txt");
            int data;
            
            // reader.read() returns -1 when the file ends
            while ((data = reader.read()) != -1) {
                System.out.print((char) data); // Cast byte to char
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}