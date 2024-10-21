package ch13.pac01;

// Calendar Package
import java.util.Calendar;
// Set Package
import java.util.Set;

// Map Package
import java.util.Map;
import java.util.HashMap;

// Iterator Package
import java.util.Iterator;

// Collection Package
import java.util.Collection;

public class CollectionMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Hash Map
		System.out.println("-------------------- Hash Map --------------------");
		Calendar newCalendar = Calendar.getInstance();
		int currentYear = newCalendar.get(Calendar.YEAR);

		Map<String, Integer> stringIntegerMap = new HashMap<>();
		stringIntegerMap.put("JAVA", currentYear - 1991);
		stringIntegerMap.put("C#", currentYear - 2000);
		stringIntegerMap.put("PHP", currentYear - 1994);
		stringIntegerMap.put("HTML", currentYear - 1993);
		stringIntegerMap.put("CSS", currentYear - 1996);
		stringIntegerMap.put("PHP", currentYear - 1995);
		stringIntegerMap.put("PHP", currentYear - 1995);
		stringIntegerMap.put("PHP", currentYear - 1995);
		stringIntegerMap.put("PHP", currentYear - 1995);
		stringIntegerMap.put("JAVASCRIPT", currentYear - 1995);

		System.out.println("stringIntegerMap : " + stringIntegerMap);
		stringIntegerMap.remove("PHP");

		System.out.println("stringIntegerMap : " + stringIntegerMap);
		System.out.println("stringIntegerMap.isEmpty() : " + stringIntegerMap.isEmpty());
		System.out.println("stringIntegerMap.size() : " + stringIntegerMap.size());
		System.out.println("stringIntegerMap.containsKey(C#) : " + stringIntegerMap.containsKey("C#"));
		System.out.println("stringIntegerMap.containsValue(29) : " + stringIntegerMap.containsValue(29));
		System.out.println("stringIntegerMap.get(\"PHP\") : " + stringIntegerMap.get("PHP"));

		System.out.println("---------- Set Map Entry ----------");
		Set<Map.Entry<String, Integer>> mapEntry = stringIntegerMap.entrySet();
		System.out.println("mapEntry : " + mapEntry);
		System.out.println("---------- Iterator ----------");
		Iterator<Map.Entry<String, Integer>> entryIterator = mapEntry.iterator();
		System.out.println("entryIterator : " + entryIterator);
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println("entryIterator.next() : " + entry);
			System.out.println("entryKey : " + key + ", entryValue : " + value);
		}

		System.out.println("---------- Key Iterator ----------");
		Set<String> setKeyString = stringIntegerMap.keySet();
		Iterator<String> keyIterator = setKeyString.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			System.out.println("keyIterator.next() : " + key);
			System.out.println("stringIntegerMap.get(key) : " + stringIntegerMap.get(key));
		}

		System.out.println("---------- Value Iterator ----------");
		Collection<Integer> collectionMap = stringIntegerMap.values();
		Iterator<Integer> valueIterator = collectionMap.iterator();
		while (valueIterator.hasNext()) {
			int value = valueIterator.next();
			System.out.println("valueIterator.next() : " + value);
		}

		System.out.println("-------------------- Override hashCode() equals() --------------------");
		Map<ClassStudent, Integer> studentMap = new HashMap<>();

		studentMap.put(new ClassStudent(1, "JAVA", 270, 270 / 3), 90);
		studentMap.put(new ClassStudent(1, "JAVA", 270, 270 / 3), 90);
		System.out.println("studentMap.size() : " + studentMap.size());

		System.out.println("---------- hashCode ----------");
		ClassStudent studentJava = new ClassStudent(2, "JAVA", 289, 289 / 3);
		ClassStudent studentJavaDup = new ClassStudent(2, "JAVA", 289, 279 / 3);
		ClassStudent studentPHP = new ClassStudent(3, "PHP", 280, 280 / 3);
		System.out.println("studentJava : " + studentJava.hashCode());
		System.out.println("studentJavaDup : " + studentJavaDup.hashCode());
		System.out.println("studentPHP : " + studentPHP.hashCode());
	}

}
