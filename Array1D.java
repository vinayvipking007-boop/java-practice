import java.util.Arrays;
public class Array1D {
    public static void main(String[]args){
        int A = 90;
        int b= 95;
        int c = 94;
        int d = 88;

        int [] marks = new int[4];
        marks[0] = 90;
        marks [1] = 95;
        marks[2] = 94;
        marks[3] = 88;
        //lenght
        //System.out.println(marks.length);
        //sort
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[3]);

    }
}