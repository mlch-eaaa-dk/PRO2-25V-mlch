package demolambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Demo {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>(List.of(
                new Person("Bent", 25),
                new Person("Susan", 34),
                new Person("Mikael", 67),
                new Person("Klaus", 44),
                new Person("Birgitte", 17),
                new Person("Liselotte", 9),
                new Person("Birgitte", 10),
                new Person("Klaus", 9)
        ));
        System.out.println(persons);
        System.out.println();

        //---------------------------------------------------------------------

        // Interface List<E> has a default method:
        // 		default void forEach(Consumer<E> action)

        // Interface Consumer<T> has one abstract method:
        // 		void action(T t)     action: (T) -> void

        System.out.println("Names printed with List.forEach():");
        Consumer<Person> consumer = (Person p) -> System.out.println(p.getName());
        persons.forEach(consumer);
        System.out.println();

//        // Interface Consumer<T> has a default method:
//        //		default Consumer<T> andThen(Consumer<E> after)
//
//        System.out.println("Age increased by 5,
//        and then Name and age printed with List.forEach():");
//        Consumer<Person> incAge = (Person p) -> p.setAge(p.getAge() + 5);
//        Consumer<Person> printNameAndAge = p -> System.out.println(p.getName() + " " + p.getAge());
//        persons.forEach(incAge.andThen(printNameAndAge));
//        System.out.println();

        //---------------------------------------------------------------------

        // Interface List<E> has a default method:
        //		default void List<E>.sort(Comparator<E> c)

        // Interface Comparator<T> has one abstract method:
        // 		int compare(T t1, T t2)    compare: (T,T) -> int

        System.out.println("Sorted with List.sort() on age:");
        persons.sort((Person p1, Person p2) -> Integer.compare(p1.getAge(), p2.getAge()));
        System.out.println(persons);
        System.out.println();

//        // Interface Comparator<T> has a default method:
//        //		default Comparator<T> thenComparing(ComparatorT> other)
//
//        System.out.println("Sorted with List.sort() on name first and then age:");
//        Comparator<Person> compareName = (p1, p2) -> p1.getName().compareTo(p2.getName());
//        Comparator<Person> compareAge = (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge());
//        persons.sort(compareName.thenComparing(compareAge));
//        System.out.println(persons);
//        System.out.println();

//		// Interface Comparator<T> has a static method:    (U must implement Comparable<U>)
//		//		static <T, U> Comparator<T> comparing(Function<T,U> keyExtractor)
//		// Interface Comparator<T> has a default method:    (U must implement Comparable<U>)
//		//		default <T, U> Comparator<T> thenComparing(Function<T,U> keyExtractor)
//		// Interface Function<T,U> has one abstract method:
//		//		U apply(T t)    apply: (T) -> U
//
//        System.out.println("Sorted with List.sort() on age and then name:");
//        persons.sort(Comparator
//                .comparing((Person p) -> p.getAge())
//                .thenComparing(p -> p.getName()));
//        System.out.println(persons);
//        System.out.println();

        //---------------------------------------------------------------------
        System.out.println();

        // Interface List<E> has a default method:
        // 		default boolean removeIf(Predicate<E> filter)

        // Interface Predicate<T> has one abstract method:
        //		boolean test(T t)    test: (T) -> boolean

        System.out.println("After use of List.removeIf() with predicate:");
        persons.removeIf((Person p) -> p.getAge() < 18 || p.getAge() > 50);
        System.out.println(persons);
        System.out.println();

//        // Predicate default method:
//        //		default Predicate<T> negate()
//
//        System.out.println("After use of List.removeIf() with predicate.negate():");
//        Predicate<Person> pred = p -> p.getAge() < 18 || p.getAge() > 50;
//        persons.removeIf(pred.negate());
//        System.out.println(persons);
//        System.out.println();

//        // Predicate default method:
//        //		default Predicate<T> or(Predicate<T> other)
//        // Predicate default method:
//        //		default Predicate<T> and(Predicate<T> other)
//        System.out.println("After use of List.removeIf() with predicate1.or(predicate2):");
//        Predicate<Person> pred18 = p -> p.getAge() < 18;
//        Predicate<Person> pred50 = p -> p.getAge() > 50;
//        persons.removeIf(pred18.or(pred50));
//        System.out.println(persons);
//        System.out.println();

        //---------------------------------------------------------------------
        System.out.println();

        // Static method in this class (see below):
        // 		public static void printNumbers(Supplier<Integer> supplier)

        // Interface Supplier<T> has one abstract method:
        // 		T get()    get: () -> T

        System.out.println("Numbers supplied by a Supplier:");
        Random rand = new Random();
        printNumbers(10, () -> rand.nextInt(100));
        System.out.println();
    }

    /**
     * Print n numbers supplied by the Supplier.
     * Pre: n >= 1.
     */
    public static void printNumbers(int n, Supplier<Integer> supplier) {
        for (int i = 0; i < n; i++) {
            System.out.print(supplier.get() + " ");
        }
    }
}
