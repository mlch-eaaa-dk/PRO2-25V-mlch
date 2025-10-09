package lambdamotivation;

import java.util.List;

public class App {

    public static void main(String[] args) {
        System.out.println("App");

        List<String> strings = List.of(
            "Per", "Anette", "Mikael", "Hanne", "Kell", "Morten", "Lis"
        );

        int countLongs = countLongStrings(strings);
        System.out.println("Count of strings longer than 5: " + countLongs);

        int countStarts = countStartsWith(strings);
        System.out.println("Count of strings starting with 'M': " + countStarts);
    }

    public static int countLongStrings(List<String> list) {
        int count = 0;
        for (String str : list) {
            if (str.length() > 5) { // str.length() > 5, returns boolean, called on String
                count++;
            }
        }
        return count;
    }

    public static int countStartsWith(List<String> list) {
        int count = 0;
        for (String str : list) {
            if (str.startsWith("M")) { // str.startsWith("M"), returns boolean, called on String
                count++;
            }
        }
        return count;
    }
}
