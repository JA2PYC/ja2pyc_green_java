package test01.prac03;

public class Test34 extends Salary {
	String department;
	
	Test34(String name, int salary, String department){
		super(name, salary);
		this.department = department;
	}
	
	void getInformation2 () {
		System.out.println("부서 : " + this.department);
	}
}
