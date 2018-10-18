package collections;

import java.util.HashMap;
import java.util.Map;

public class CollectionHashMap {

	public static void main(String[] args) {
		Map<Integer, String> Kids = new HashMap<>();
		// Ages and names of my kids
		Kids.put(2, "Jarom Elias");
		Kids.put(5, "Kimberly Alaina");
		Kids.put(7, "Charlotte Elizabeth");
		Kids.put(10, "Miley Renee");
		Kids.put(12, "Alexandra Sage");
		Kids.put(14, "Zachary William");
		Kids.put(15, "Joshua David");
		

		// Print total number of kids
		System.out.println("Total of kiddos in the Humphreys Family: " + Kids.size());
		System.out.println();
		System.out.println();

		Map<String, Integer> Teenagers = new HashMap<>();

		Teenagers.put("Joshua David", 15);
		Teenagers.put("Zachary William", 14);
		
		// Print total teenagers
		System.out.println("Humphreys Family Teenagers: " + Teenagers.size());
			// Print names and ages of teenagers
            Teenagers.keySet().forEach((key) -> {
                System.out.println(key + " - Age: " + Teenagers.get(key));
            });
		System.out.println();

	}

}