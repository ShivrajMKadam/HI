//Write a program to read 10 string from console and then print the sorted strings on console (Use String Class).
// 2) combine two string
// 3)reverse first string nd dispaly it .

import java.util.Arrays;
import java.util.Scanner;
public class n17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read 10 strings from the console
        String[] strings = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }

        // Sort and print the strings
        Arrays.sort(strings);
        System.out.println("Sorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }

        // Combine two strings
        String combinedString = strings[0] + strings[1];
        System.out.println("Combined string: " + combinedString);

        // Reverse the first string and display it
        StringBuilder reversedString = new StringBuilder(strings[0]);
        reversedString.reverse();
        System.out.println("Reversed first string: " + reversedString);

        scanner.close();
    }
}
