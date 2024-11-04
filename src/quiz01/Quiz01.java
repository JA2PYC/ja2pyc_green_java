package quiz01;

public class Quiz01 {
	static void func(String[] m, int n) {
		for (int i = 1; i<n; i++) {
			if (m[i-1].equals(m[i]) ) {
				System.out.println("O");
			} else {
				System.out.println("N");
			}
		}
		for (String mo : m) {
			System.out.println(mo);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] m = new String[3];
		m[0] = "A";
		m[1] = "A";
		m[2] = new String("A");
		func(m, 3);
	}

}
