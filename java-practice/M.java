
import java.util.HashMap;
import java.util.Map;
 class M {

    public static void main (String[] args){
        Map<Integer, String> students = new HashMap<>(); 
       students.put(19,"priya");
       students.put(17,"chhaya");
       students.put(30,"nancy");
       students.put(15,"krishna");
       System.out.println(students);
       students.put(5,"harshita");
       System.out.println(students);
       System.out.println("the value at the 15th key is " + students.get(5));
       //Iterating a map
     for(Map.Entry<Integer, String>map: students.entrySet()){
        System.out.println("the key is " + map.getKey() +"and the value is " + map.getValue());
        
     }
   
    }
}