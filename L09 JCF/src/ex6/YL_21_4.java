package ex6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class YL_21_4 {
    public static void main(String[] args) {
//        System.out.println("Type name of the text file to read:");
//        Scanner scanner1 = new Scanner(System.in);
//        String fileName = scanner1.nextLine();
//        scanner1.close();
        String fileName = "L09 JCF/src/ex6/Text.txt";
        Set<Character> vowels = new HashSet<>(Set.of('A','E','I','O','U'));
        int vowelsCount = 0;
        int consonantsCount = 0;
        File in = new File(fileName);
        try (Scanner scanner2 = new Scanner(in)) {
            scanner2.useDelimiter("[^A-Za-z]+");
            while(scanner2.hasNext()) {
                String word = scanner2.next().toUpperCase();
                for (int i = 0; i < word.length(); i++) {
                    if (vowels.contains(word.charAt(i))) {
                        vowelsCount++;
                    } else {
                        consonantsCount++;
                    }
                }
//                 System.out.print(word + " ");
//                 System.out.println(vowelsCount + " " + consonantsCount);
            }
            System.out.println("Number of vowels: " + vowelsCount);
            System.out.println("Number of consonants: " + consonantsCount);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
