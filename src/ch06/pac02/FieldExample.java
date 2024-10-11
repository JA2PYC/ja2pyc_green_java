package ch06.pac02;

public class FieldExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Use ClassCar
		System.out.println("----------ClassCar----------");
		ClassCar myCar = new ClassCar();
		System.out.println("compay : " + myCar.company);
		System.out.println("model : " + myCar.model);
		System.out.println("color : " + myCar.color);
		System.out.println("maxSpeed : " + myCar.maxSpeed);
		System.out.println("initSpeed : " + myCar.speed);
		
		myCar.speed = 60;
		System.out.println("currentSpeed : " + myCar.speed);
		
		// Field Init Value
		System.out.println("----------ClassFieldValue----------");
		ClassFieldValue fieldValue = new ClassFieldValue();
		System.out.println("byteField : " + fieldValue.byteField);
		System.out.println("shortField : " + fieldValue.shortField);
		System.out.println("charField : " + fieldValue.charField);
		System.out.println("intField : " + fieldValue.intField);
		System.out.println("longField : " + fieldValue.longField);
		
		System.out.println("booleanField : " + fieldValue.booleanField);
		
		System.out.println("floatField : " + fieldValue.floatField);
		System.out.println("doubleField : " + fieldValue.doubleField);
		
		System.out.println("intArrField : " + fieldValue.intArrField);
		System.out.println("strField : " + fieldValue.strField);
		
		// Use ClassMember
		System.out.println("---------- ClassMember ----------");
		ClassMember newMember = new ClassMember();
		System.out.println("newMember : " + newMember);
		newMember.name = "김자바";
		newMember.id = "java";
		newMember.password = "1234";
		newMember.age = 33;
		System.out.println("name : " + newMember.name);
		System.out.println("id : " + newMember.id);
		System.out.println("password : " + newMember.password);
		System.out.println("age : " + newMember.age);
		
		// Class Staff
		System.out.println("---------- ClassStaff ----------");
		Staff newStaff = new Staff();
		System.out.println("newStaff : " + newStaff);
		newStaff.name = "스태프";
		newStaff.id = "staff";
		newStaff.password = "1234";
		newStaff.age = 25;
		System.out.println("name : " + newStaff.name);
		System.out.println("id : " + newStaff.id);
		System.out.println("password : " + newStaff.password);
		System.out.println("age : " + newStaff.age);
	}

}
