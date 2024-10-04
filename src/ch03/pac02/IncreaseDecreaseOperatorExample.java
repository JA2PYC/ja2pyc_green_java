package ch03.pac02;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 10;
		int z;

		System.out.println("--------------------");
		x++;
		++x;
		System.out.println("X = " + x);
		System.out.println("--------------------");
		y--;
		--y;
		System.out.println("Y = " + y);
		System.out.println("--------------------");
		z = x++;
		System.out.println("Z = " + z);
		System.out.println("X = " + x);
		System.out.println("--------------------");
		z = ++x;
		System.out.println("Z = " + z);
		System.out.println("X = " + x);
		System.out.println("--------------------");
		z = ++x + y++;
		System.out.println("Z = " + z);
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
	}

}
