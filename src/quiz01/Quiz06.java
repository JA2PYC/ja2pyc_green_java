package quiz01;

public class Quiz06 {

	public static void check(int[] x, int[] y) {
		if (x == y) System.out.println("O");
		else System.out.println("N");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[] {1,2,3,4};
		int b[] = new int[] {1,2,3,4};
		int c[] = new int[] {1,2,3};
		System.out.println("a : " +a);
		System.out.println("b : " +b);
		System.out.println("c : " +c);
		check(a,b);
		check(b,c);
		check(a,c);
	}

}
