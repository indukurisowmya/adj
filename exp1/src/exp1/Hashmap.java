package exp1;
import java.util.*;
public class Hashmap {



 public static void main(String args[]) {
 HashMap hm = new HashMap();
 hm.put("Prathyusha", new Double(3434.34)); 
hm.put("Bhargavi", new Double(123.22));
hm.put("Prabha", new Double(1378.00));
hm.put("Santhoshi", new Double(99.22));
hm.put("Divya", new Double(-19.08));
Set set = hm.entrySet();
Iterator i = set.iterator();
while(i.hasNext()) {
Map.Entry me = (Map.Entry)i.next();
System.out.print(me.getKey() + ": ");
System.out.println(me.getValue());
}
System.out.println();
double balance = ((Double)hm.get("Prathyusha")).doubleValue();
hm.put("Prathyusha", new Double(balance + 1000));
System.out.println("Prathyusha's new balance: " +
hm.get("Prathyusha"));
}
}