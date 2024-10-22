package test01.prac04;

public class Entry {
	String word;

	Entry() {

	}

	Entry(String w) {
		this.word = w;
	}
	
	public void writeView() {
		System.out.println("*****약어사전*****");
		System.out.println("약어 : " + this.word);
	}
}
