package ex4b;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Ex4b {

    public static void main(String[] args) {
        File f = new File("L09 JCF/src/ex4a/Gjoengehoevdingen.txt");
        SortedMap<String, Integer> map = new TreeMap<>();
        int count = 0;
        try (Scanner scan = new Scanner(f)) {
            scan.useDelimiter("[^A-ZÆØÅa-zæøå]+");
            while (scan.hasNext()) {
                String word = scan.next().toLowerCase();
                if (map.containsKey(word)) {
                    map.replace(word, map.get(word) + 1);
                } else {
                    map.put(word, 1);
                }
                count++;
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }

        for (String word : map.keySet()) {
            int freq = map.get(word);
            if (freq >= 1000) {
                System.out.println(word + "\t " + freq);
            }
        }

        System.out.println("Word count: " + count);
        System.out.println("Unique words count: " + map.size());
    }
}
