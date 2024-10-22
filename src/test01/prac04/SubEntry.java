package test01.prac04;

public class SubEntry extends Entry{
	String definition;
	int year;
	
	SubEntry(String w){
		super(w);
	}
	
	SubEntry (String w, String d, int y){
		this(w);
		this.definition = d;
		this.year = y;
	}
	
	public void printView() {
		System.out.println("원어 : " + this.definition);
		System.out.println("시기 : " + this.year + "년");
	}
}
