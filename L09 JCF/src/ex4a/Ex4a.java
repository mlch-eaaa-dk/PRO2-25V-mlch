package ex4a;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Ex4a {

    public static void main(String[] args) {
        File f = new File("L09 JCF/src/ex4a/Gjoengehoevdingen.txt");
        SortedSet<String> set = new TreeSet<>();
        int count = 0;
        try (Scanner scan = new Scanner(f)) {
            scan.useDelimiter("[^A-ZÆØÅa-zæøå]+");
            while (scan.hasNext()) {
                String word = scan.next().toLowerCase();
                set.add(word);
                count++;
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }

        for (String word : set) {
            System.out.println(word);
        }
        System.out.println("Word count: " + count);
        System.out.println("Unique words count: " + set.size());
    }
}
