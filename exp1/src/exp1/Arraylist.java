package exp1;
import java.util.ArrayList;
public class Arraylist {
 public static void main(String args[]) {
 ArrayList<String> obj = new ArrayList<String>();
 obj.add("Manasa");
 obj.add("Sivani");
 obj.add("Bhargavi");
 obj.add("Anusha");
 System.out.println("The array list elements are:"+obj);
 obj.add(1, "Pratyusha");
 obj.remove("Bhargavi");
 obj.remove("Sivani");
 System.out.println("Current array list is:"+obj);
 obj.remove(1);
 System.out.println("Current array list is:"+obj);
 }
}