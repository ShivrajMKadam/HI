//Write Java Program to find the number of the words in the given text file

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class n13_2 {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\Samruddhi Kadam\\Desktop\\abc.txt");
            Scanner scanner = new Scanner(file);

            int wordCount = 0;

            while (scanner.hasNext()) {
                scanner.next();
                wordCount++;
            }

            System.out.println("Number of words in the file: " + wordCount);

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
