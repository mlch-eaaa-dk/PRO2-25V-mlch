package lambdamotivation;

import java.util.List;

public class AppWithLambda {

    public static void main(String[] args) {
        System.out.println("App with lambda");

        List<String> strings = List.of(
            "Per", "Anette", "Mikael", "Hanne", "Kell", "Morten", "Lis"
        );

        int countLongs = countAccepted(strings, (String str) -> str.length() > 5);
        System.out.println("Count of strings longer than 5: " + countLongs);

        int countStarts = countAccepted(strings, (String str) ->  str.startsWith("M"));
        System.out.println("Count of strings starting with 'M': " + countStarts);

        int count = countAccepted(strings, (String str) -> str.contains("i"));
        System.out.println("Lambda: Count of strings containing 'i': " + count);
    }

    //-----------------------------------------------------

    public static int countAccepted(List<String> list, Filter f) {
        int count = 0;
        for (String s : list) {
            if (f.accept(s)) {
                count++;
            }
        }
        return count;
    }
}
