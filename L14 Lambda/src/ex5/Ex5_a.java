package ex5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Ex5_a {

    public static void main(String[] args) {

        class Pair {
            int count, sumGrades;

            Pair(int count, int sumGrades) {
                this.count = count;
                this.sumGrades = sumGrades;
            }
        }

        var map = new HashMap<String, Pair>();

        var filename = "L14 Lambda/src/ex5/FilmGrades.txt";
        try (Scanner scanner = new Scanner(new File(filename))) {
            int filmCount = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < filmCount; i++) {
                String filmName = scanner.nextLine();
                int filmGrade = scanner.nextInt();
                scanner.nextLine();

//                map.merge(filmName, new Pair(1, filmGrade), (Pair oldPair, Pair grade) ->
//                        new Pair(oldPair.count + grade.count, oldPair.sumGrades + grade.sumGrades)
//                );

                if (map.containsKey(filmName)) {
                    Pair oldValue = map.get(filmName);
                    map.put(filmName, new Pair(oldValue.count + 1, oldValue.sumGrades + filmGrade));
                } else {
                    Pair pair = new Pair(1, filmGrade);
                    map.put(filmName, pair);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error reading file: " + ex.getMessage());
        }

        map.forEach((filmName, pair) ->
                System.out.printf("%s: %d karakterer, gennemsnit %.1f\n",
                        filmName, pair.count, (double) pair.sumGrades / pair.count)
        );
    }
}
