package demo;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(2, 5, 3, 9, 4, 7));
        System.out.println("List before: " + list);
        System.out.println("sum = " + sum(list));
        System.out.println("List after: " + list);
    }

    // lastIndex = list.size()-1
    // sum(list[0..lastIndex] = list[0] + sum(list[1..lastIndex]   if list is not empty
    // sum(list) = 0   if list is empty

//    /**
//     * Return the sum of elements in the list.
//     * Return 0 if the list is empty.
//     */
//    public static int sum(List<Integer> list) {
//        int result;
//        if (list.isEmpty()) {
//            result = 0;
//        } else {
//            int element = list.getFirst();
//            list.removeFirst();
//            result = element + sum(list);
//        }
//        return result;
//    }

    /**
     * Return the sum of elements in the list.
     * Return 0 if the list is empty.
     */
    public static int sum(List<Integer> list) {
        return sum(list, 0);
    }

    // Return the sum of elements in list[index..list.size()-1]
    // Pre: 0 <= index <= list.size()
    private static int sum(List<Integer> list, int index) {
        if (index == list.size()) {
            return 0;
        } else {
            return list.get(index) + sum(list, index + 1);
        }
    }
}
