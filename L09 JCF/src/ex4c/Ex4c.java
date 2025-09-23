package ex4c;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Ex4c {

    public static void main(String[] args) {
        File f = new File("L09 JCF/src/ex4c/Gjoengehoevdingen.txt");
        Map<Integer, Set<String>> map = new LinkedHashMap<>();
        int count = 0;
        try (Scanner scan = new Scanner(f)) {
            scan.useDelimiter("[^A-ZÆØÅa-zæøå]+");
            while (scan.hasNext()) {
                String word = scan.next().toLowerCase();
                int hash = word.hashCode();
                if (map.containsKey(hash)) {
                    map.get(hash).add(word);
                } else {
                    Set<String> set = new HashSet<>();
                    set.add(word);
                    map.put(hash, set);
                }
                count++;
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }

        System.out.printf("%10s  %s\n", "hash", "words");
        System.out.println("------------------------");
        for (var hash : map.keySet()) {
            var set = map.get(hash);
            if (set.size() > 1) {
                System.out.printf("%10d  %s\n", hash, set);
            }
        }
        System.out.println();

        System.out.println("Word count: " + count);
        System.out.println("Map size: " + map.size());
    }
}
