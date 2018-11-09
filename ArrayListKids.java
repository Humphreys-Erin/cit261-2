package collectionlist;

import java.util.*;

public class ArrayListKids{

public static void main(String []args) {
 List<String> kids=new ArrayList<String>();
 kids.add("Joshua");
 kids.add("Zachary");
 kids.add("Alexandra");
 kids.add("Miley");
 kids.add("Charlotte");
 kids.add("Kimberly");
 kids.add("Jarom");
 Iterator<String> i=kids.iterator();
 while(i.hasNext()) {
    System.out.println(i.next());
 }
}
} 


