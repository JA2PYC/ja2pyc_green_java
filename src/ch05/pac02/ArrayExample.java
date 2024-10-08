package ch05.pac02;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Array Create By Value List Example
		int[] score = { 83, 90, 87 };
		System.out.println("score[0] : " + score[0]);
		System.out.println("score[1] : " + score[1]);
		System.out.println("score[2] : " + score[2]);

		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum / score.length;
		System.out.println("평균 : " + avg);

		int[] intArray;
		intArray = new int[3];
		System.out.println("intArray : " + intArray);
		intArray = new int[] { 1, 2, 3 };
		System.out.println("intArray : " + intArray);

		// Use Method
		int sumScores = addScore(new int[] { 80, 85, 90 });
		System.out.println("sumScores : " + sumScores);
		int[] scoresLiteral = { 1, 2, 3 };
		int sumLiteral = addScore(scoresLiteral);
		System.out.println("sumLiteral : " + sumLiteral);
		int[] scoresNew = new int[] { 81, 89, 92 };
		int sumNew = addScore(scoresNew);
		System.out.println("sumScores : " + sumNew);

		// Array Create By New Example
		int[] intNewArray = new int[3];
		for (int i = 0; i < intNewArray.length; i++) {
			System.out.println("intNewArray[i] : " + intNewArray[i]);
		}

		intNewArray[0] = 83;
		intNewArray[1] = 86;
		intNewArray[2] = 92;
		for (int i = 0; i < intNewArray.length; i++) {
			System.out.println("intNewArray[i] : " + intNewArray[i]);
		}

		double[] doubleNewArray = new double[3];
		for (int i = 0; i < doubleNewArray.length; i++) {
			System.out.println("doubleNewArray[i] : " + doubleNewArray[i]);
		}

		doubleNewArray[0] = 3.14;
		doubleNewArray[1] = 3.141;
		doubleNewArray[2] = 3.1415;
		for (int i = 0; i < doubleNewArray.length; i++) {
			System.out.println("doubleNewArray[i] : " + doubleNewArray[i]);
		}

		String[] stringNewArray = new String[3];
		for (int i = 0; i < stringNewArray.length; i++) {
			System.out.println("stringNewArray[i] : " + stringNewArray[i]);
		}

		stringNewArray[0] = "JAVA";
		stringNewArray[1] = "C#";
		stringNewArray[2] = "PHP";
		for (int i = 0; i < stringNewArray.length; i++) {
			System.out.println("stringNewArray[i] : " + stringNewArray[i]);
		}

		// Array In Array Example
		int[][] mathScores = new int[2][3];
		for (int i = 0; i < mathScores.length; i++) {
			for (int j = 0; j < mathScores[i].length; j++) {
				System.out.println("mathScores[" + i + "][" + j + "] : " + mathScores[i][j]);
			}
		}

		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];

		for (int i = 0; i < englishScores.length; i++) {
			for (int j = 0; j < englishScores[i].length; j++) {
				System.out.println("englishScores[" + i + "][" + j + "] : " + englishScores[i][j]);
			}
		}

		int[][] historyScores = { { 95, 80 }, { 92, 96, 80 } };
		for (int i = 0; i < historyScores.length; i++) {
			for (int j = 0; j < historyScores[i].length; j++) {
				System.out.println("historyScores[" + i + "][" + j + "] : " + historyScores[i][j]);
			}
		}

		// Array Reference Object
		String[] strArray = new String[3];
		strArray[0] = "JAVA";
		strArray[1] = "JAVA";
		strArray[2] = new String("JAVA");
		String[] strJava = { "JAVA" };

		System.out.println("strArray[0] == strArray[1] : " + (strArray[0] == strArray[1]));
		System.out.println("strArray[0] == strArray[2] : " + (strArray[0] == strArray[2]));
		System.out.println("strArray[0].equals(strArray[2] : " + (strArray[0].equals(strArray[2])));
		System.out.println("strArray[0] == strJava[0] : " + (strArray[0] == strJava[0]));

		// Array Copy By For Example
		int[] oldIntArray = { 1, 2, 3 };
		int[] newIntArray = new int[5];

		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}

		for (int i = 0; i < newIntArray.length; i++) {
			System.out.println("newIntArray[" + i + "] : " + newIntArray[i]);
		}

		int[] copyIntArray = new int[5];
		System.arraycopy(oldIntArray, 0, copyIntArray, 0, oldIntArray.length);
		for (int i = 0; i < copyIntArray.length; i++) {
			System.out.println("copyIntArray[" + i + "] : " + copyIntArray[i]);
		}

		// Array Copy Example
		String[] oldStrArray = { "JAVA", "C#", "C++" };
		String[] newStrArray = new String[5];

		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		for (int i = 0; i < newStrArray.length; i++) {
			System.out.println("newStrArray[" + i + "] : " + newStrArray[i]);
		}

		// Advanced For Example
		int[] intAdvFor = { 95, 71, 83, 90, 87 };
		int sumAdvFor = 0;
		for (int scoreAdvFor : intAdvFor) {
			sumAdvFor += scoreAdvFor;
		}
		System.out.println("sumAdvFor : " + sumAdvFor);

		double avgAdvFor = (double) sumAdvFor / intAdvFor.length;
		System.out.println("avgAdvFor : " + avgAdvFor);

	}

	public static int addScore(int[] scores) {
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	}

}
