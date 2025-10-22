package ex5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex5_b {

    public static void main(String[] args) {
        Map<String, Integer> mapGradeSum = new HashMap<>();
        Map<String, Integer> mapCount = new HashMap<>();

        String filename = "L14 Lambda/src/ex5/FilmGrades.txt";
        try (Scanner scanner = new Scanner(new File(filename))) {
            int filmCount = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < filmCount; i++) {
                String filmName = scanner.nextLine();
                int filmGrade = scanner.nextInt();
                scanner.nextLine();

//                mapGradeSum.merge(filmName, filmGrade, (Integer oldValue, Integer grade) -> oldValue + grade);
//                mapCount.merge(filmName, 1, Integer::sum);

                if (mapGradeSum.containsKey(filmName)) {
                    mapGradeSum.put(filmName, mapGradeSum.get(filmName) + filmGrade);
                    mapCount.put(filmName, mapCount.get(filmName) + 1);
                } else {
                    mapGradeSum.put(filmName, filmGrade);
                    mapCount.put(filmName, 1);
                }
            }
        } catch (
                FileNotFoundException ex) {
            System.out.println("Error reading file: " + ex.getMessage());
        }

        mapGradeSum.forEach((filmName, sumGrades) -> {
            int count = mapCount.get(filmName);
            System.out.printf("%s: %d karakterer, gennemsnit %.1f\n", //
                    filmName, count, (double) sumGrades / count);
        });
    }
}
