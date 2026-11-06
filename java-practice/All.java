import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class All {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 5, 6));

        System.out.println("Contains all elements of list2: " + list1.containsAll(list2));
        List<Integer> intersection = new ArrayList<>(list1);
        intersection.retainAll(list2);
        System.out.println("Intersection: " + intersection);

        List<Integer> difference = new ArrayList<>(list1);
        difference.removeAll(list2);
        System.out.println("Elements only in list1: " + difference);
    }
}
