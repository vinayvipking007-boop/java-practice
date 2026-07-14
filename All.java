//1.containsAll()check if 
//2.retainAll()
//3.removeAll()

import java.util.ArrayList;
import java.util.List;
class All {
    public static void main(String[] args){
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
      list1.add(1); list1.add(2); list1.add(3); list1.add(4); list1.add(5);
      list2.add(1); list2.add(2); list2.add(3); list2.add(4); list2.add(5);
      System.out.println("Does the list contains all element of list2?" +list1.containsAll(list2));
      System.out.println("The intersection of list 1 and list 2 is " + list1.retainAll (list2));
      System.out.println("The intersection of list 1 and list 2 is " + list1.removeAll (list2));
    }

    
}
