package quiz01;

interface Number {
	int sum(int[] a, boolean odd);

}

public class Quiz08 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		OENumber OE = new OENumber();
		// 1,3,5,7,9 == 25
		// 2,4,6,8 == 20
		System.out.println(OE.sum(a, true) + ", " + OE.sum(a, false));
	}
}

class OENumber implements Number {
	public int sum(int[] a, boolean odd) {
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			if ((odd && a[i] % 2 != 0) || (!odd && a[i] % 2 == 0))
				result += a[i];
		}
		return result;
	}
}
