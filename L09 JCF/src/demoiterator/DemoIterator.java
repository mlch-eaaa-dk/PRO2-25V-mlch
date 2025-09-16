package demoiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoIterator {

    public static void main(String[] args) {
        List<Runner> runners = new ArrayList<>(List.of(
            new Runner("Ib", 30),
            new Runner("Per", 50),
            new Runner("Ole", 27),
            new Runner("Ulla", 40),
            new Runner("Jens", 35),
            new Runner("Hans", 28)
        ));
        System.out.println(runners);
        System.out.println();

        System.out.println("All runners: (with iterator)");
        Iterator<Runner> it1 = runners.iterator();
        while (it1.hasNext()) {
            Runner runner = it1.next();
            System.out.println(runner.getName() + " " + runner.getLapTime() + " sec");
        }
        System.out.println();

        // for-each sætningen er syntaktisk sukker for brug af en iterator
        System.out.println("All runners: (with for-each statement)");
        for (Runner runner : runners) {
            System.out.println(runner.getName() + " " + runner.getLapTime() + " sec");
        }
        System.out.println();

        System.out.println("All runners with laptime < 40 (with iterator)");
        Iterator<Runner> it2 = runners.iterator();
        while (it2.hasNext()) {
            Runner runner = it2.next();
            if (runner.getLapTime() < 40) {
                System.out.println(runner.getName() + " " + runner.getLapTime() + " sec");
            }
        }
        System.out.println();

        System.out.println("All runners with laptime < 40 (with for-each statement)");
        for (Runner runner : runners) {
            if (runner.getLapTime() < 40) {
                System.out.println(runner.getName() + " " + runner.getLapTime() + " sec");
            }
        }
        System.out.println();

        System.out.println("After runners with laptime >= 40 are removed");
        Iterator<Runner> it3 = runners.iterator();
        while (it3.hasNext()) {
            Runner runner = it3.next();
            if (runner.getLapTime() >= 40) {
                // runners.remove(runner); // ConcurrentModificationException !!
                it3.remove();
            }
        }
        System.out.println(runners);
        System.out.println();

//        System.out.println("After runners with laptime >= 40 are removed");
//        for (Runner runner : runners) {
//            if (runner.getLapTime() >= 40) {
//                runners.remove(runner); // ConcurrentModificationException !!
//            }
//        }
//        System.out.println(runners);
//        System.out.println();


        // Udskrift med forEach() metoden:
        runners.forEach((Runner runner) ->
            System.out.println(runner.getName() + " " + runner.getLapTime() + " sec"));
    }
}
