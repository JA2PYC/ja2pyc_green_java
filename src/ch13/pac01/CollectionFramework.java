package ch13.pac01;

import java.util.ArrayList;
import java.util.List;

public class CollectionFramework {

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
		studentArr[0].name = "JAVA";
		studentArr[0].sum = 264;
		studentArr[0].avg = (double) studentArr[0].sum / 3;

		studentArr[1] = new ClassStudent();
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
		stringList.add("JAVASCRIPT");
		stringList.add(3, "JSP");

		System.out.println("stringList : " + stringList);
		System.out.println("stringLIst.size() : " + stringList.size());

		// Array List Class
		System.out.println("-------------------- Array List Class --------------------");
		List<ClassStudent> studentList = new ArrayList<ClassStudent>();
		ClassStudent studentJava = new ClassStudent();
		studentJava.name = "JAVA";
		studentJava.sum = 290;
		studentJava.avg = (double) studentJava.sum / 3;
		studentList.add(studentJava);

		for (int i = 0; i < studentList.size(); i++) {
			System.out.println("studentList.get(" + i + ").name : " + studentList.get(i).name);
			System.out.println("studentList.get(" + i + ").sum : " + studentList.get(i).sum);
			System.out.println("studentList.get(" + i + ").avg : " + studentList.get(i).avg);
		}

	}

}
