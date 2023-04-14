import java.util.Scanner;
import java.util.ArrayList;
public class Arraylist{
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(67);
        list.add(78);
        list.add(101);
        list.add(120);
        System.out.println(list);
        System.out.println(list.contains(120));
        System.out.println(list.contains(1566));
        list.remove(1);
        System.out.println(list);
    }
    
}
