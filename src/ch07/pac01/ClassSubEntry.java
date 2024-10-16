package ch07.pac01;

public class ClassSubEntry extends ClassEntry {

	String definition;
	int year;

	ClassSubEntry(String w) {
		super(w);
	}

	ClassSubEntry(String w, String d, int y) {
		this(w);
		this.definition = d;
		this.year = y;
	}

	public void printVoid() {
		System.out.println("----------약어사전----------");
		System.out.println("약어 : " + this.word);
		System.out.println("원어 : " + this.definition);
		System.out.println("시기 : " + this.year);
	}
}
