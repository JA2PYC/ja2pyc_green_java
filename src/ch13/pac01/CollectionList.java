package ch13.pac01;

// List Package
import java.util.List;
import java.util.ArrayList;
import java.util.Vector;
import java.util.LinkedList;

public class CollectionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Array
		System.out.println("-------------------- Array --------------------");
		String[] stringArr = new String[3];
		stringArr[0] = "JAVA";
		stringArr[1] = "C#";
		stringArr[2] = "PHP";
		for (int i = 0; i < stringArr.length; i++) {
			System.out.println("stringArr[" + i + "] : " + stringArr[i]);
		}

		// Object Array
		System.out.println("-------------------- Object Array --------------------");
		ClassStudent[] studentArr = new ClassStudent[3];
		studentArr[0] = new ClassStudent();
		studentArr[0].sno = 1;
		studentArr[0].name = "JAVA";
		studentArr[0].sum = 264;
		studentArr[0].avg = (double) studentArr[0].sum / 3;

		studentArr[1] = new ClassStudent();
		studentArr[0].sno = 2;
		studentArr[1].name = "C#";
		studentArr[1].sum = 278;
		studentArr[1].avg = (double) studentArr[1].sum / 3;

		for (int i = 0; i < studentArr.length; i++) {
			if (studentArr[i] != null) {
				System.out.println("studentArr[" + i + "].name : " + studentArr[i].name);
				System.out.println("studentArr[" + i + "].sum : " + studentArr[i].sum);
				System.out.println("studentArr[" + i + "].avg : " + studentArr[i].avg);
			}
		}

		// Array List
		System.out.println("-------------------- Array List String --------------------");
		List<String> stringList = new ArrayList<String>();
		stringList.add("JAVA");
		stringList.add("C#");
		stringList.add("PHP");
		stringList.add("PHP");
		stringList.add("PHP");
		stringList.add("JAVASCRIPT");
		stringList.add(3, "JSP");
		stringList.add("JDBC");

		System.out.println("stringList : " + stringList);
		System.out.println("stringLIst.size() : " + stringList.size());
		System.out
				.println("stringList.get(" + (stringList.size() - 1) + ") : " + stringList.get(stringList.size() - 1));

		for (String str : stringList) {
			System.out.println("stringList : " + str);
		}

		System.out.println("---------- Remove Data ----------");
		stringList.remove(3);
		stringList.remove(3);
		stringList.remove("PHP");

		for (int i = 0; i < stringList.size(); i++) {
			System.out.println("stringList.get(" + i + ") : " + stringList.get(i));
		}

		// Array List Class
		System.out.println("-------------------- Array List Class --------------------");
		List<ClassStudent> studentList = new ArrayList<ClassStudent>();
		ClassStudent studentJava = new ClassStudent();
		studentJava.sno = 1;
		studentJava.name = "JAVA";
		studentJava.sum = 290;
		studentJava.avg = (double) studentJava.sum / 3;
		studentList.add(studentJava);
		studentList.add(new ClassStudent(2, "C#", 269, ((double) 269 / 3)));
		studentList.add(new ClassStudent(3, "PHP", 278, ((double) 278 / 3)));

		System.out.println("studentList.size() : " + studentList.size());
		for (int i = 0; i < studentList.size(); i++) {
			System.out.println("studentList.get(" + i + ").name : " + studentList.get(i).name);
			System.out.println("studentList.get(" + i + ").sum : " + studentList.get(i).sum);
			System.out.println("studentList.get(" + i + ").avg : " + studentList.get(i).avg);
		}

		// List Vector
		System.out.println("-------------------- List Vector (Thread Safe) --------------------");
		List<ClassBoard> boardVectorList = new Vector<>();
		boardVectorList.add(new ClassBoard("제목 1", "내용 1", "작성자 1"));
		boardVectorList.add(new ClassBoard("제목 2", "내용 2", "작성자 2"));
		boardVectorList.add(new ClassBoard("제목 3", "내용 3", "작성자 3"));
		boardVectorList.add(new ClassBoard("제목 4", "내용 4", "작성자 4"));
		boardVectorList.add(new ClassBoard("제목 5", "내용 5", "작성자 5"));
		boardVectorList.add(new ClassBoard("제목 6", "내용 6", "작성자 6"));
		boardVectorList.add(new ClassBoard("제목 7", "내용 7", "작성자 7"));
		boardVectorList.add(new ClassBoard("제목 8", "내용 8", "작성자 8"));
		boardVectorList.add(new ClassBoard("제목 9", "내용 9", "작성자 9"));
		boardVectorList.add(new ClassBoard("제목 10", "내용 10", "작성자 10"));
		boardVectorList.add(new ClassBoard("제목 11", "내용 11", "작성자 11"));

		System.out.println("boardVectorList : " + boardVectorList);
		for (ClassBoard boardData : boardVectorList) {
			System.out.println("boardData: " + boardData.subject + ", " + boardData.content + ", " + boardData.writer);
		}

		System.out.println("---------- Remove Data ----------");
		boardVectorList.remove(4);
		boardVectorList.remove(4);

		for (ClassBoard boardData : boardVectorList) {
			System.out.println("boardData: " + boardData.subject + ", " + boardData.content + ", " + boardData.writer);
		}

		// Linked List
		System.out.println("-------------------- Linked List --------------------");
		List<String> stringArrayList = new ArrayList<>();
		List<String> stringLinkedList = new LinkedList<>();

		long startTime;
		long endTime;

		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			stringArrayList.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("stringArrayList Time : " + (endTime - startTime) + " ns");

		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			stringLinkedList.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("stringLinkedList Time : " + (endTime - startTime) + " ns");

	}

}
