package ch13.pac01;

// Set Package
import java.util.Set;
import java.util.HashSet;

// Iterator Package
import java.util.Iterator;

public class CollectionSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Set Collection HashSet
		System.out.println("-------------------- Set Collection HashSet --------------------");
		Set<String> stringHashSet = new HashSet<>();
		stringHashSet.add("JAVA");
		stringHashSet.add("C#");
		stringHashSet.add("PHP");
		stringHashSet.add("PHP");
		stringHashSet.add("PHP");
		stringHashSet.add("PHP");
		stringHashSet.add("HTML");
		stringHashSet.add("CSS");
		stringHashSet.add("JAVASCRIPT");
		
		System.out.println("stringHashSet : " + stringHashSet);
		System.out.println("stringHashSet.contains(\"JAVA\") : " + stringHashSet.contains("JAVA"));
		System.out.println("stringHashSet.isEmpty() : " + stringHashSet.isEmpty());
		System.out.println("stringHashSet.size() : " + stringHashSet.size());
		
		System.out.println("---------- stringIterator ----------");
		Iterator<String> stringIterator = stringHashSet.iterator();
		System.out.println("stringIterator : " + stringIterator);
		while(stringIterator.hasNext()) {
			if(stringIterator.equals("PHP")) {
				stringIterator.remove();
			}
			System.out.println("stringIterator.next() : " + stringIterator.next());
		}

		System.out.println("---------- For : HashSet ----------");
		for (String str : stringHashSet) {
			if (str == "HTML") {
				stringHashSet.remove("HTML");
			}
			System.out.println("stringHashSet : " + str);
		}
		
		System.out.println("---------- For : HashSet ----------");
		for (String str : stringHashSet) {
			System.out.println("stringHashSet : " + str);
		}
	}

}
