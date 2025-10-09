package lambdamotivation;

import java.util.List;

public class AppWithClasses {

    public static void main(String[] args) {
        System.out.println("App with classes");

        List<String> strings = List.of(
            "Per", "Anette", "Mikael", "Hanne", "Kell", "Morten", "Lis"
        );

        int countLongs = countAccepted(strings, new LongStringFilter());
        System.out.println("Count of strings longer than 5: " + countLongs);

        int countStarts = countAccepted(strings, new StartsWithFilter());
        System.out.println("Count of strings starting with 'M': " + countStarts);
    }

    public static int countAccepted(List<String> list, Filter f) {
        int count = 0;
        for (String str : list) {
            if (f.accept(str)) {
                count++;
            }
        }
        return count;
    }
}

class LongStringFilter implements Filter {
    @Override
    public boolean accept(String str) {
        return str.length() > 5;
    }
}

class StartsWithFilter implements Filter {
    @Override
    public boolean accept(String str) {
        return str.startsWith("M");
    }
}
