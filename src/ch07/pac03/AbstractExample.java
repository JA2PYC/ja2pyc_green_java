package ch07.pac03;

public class AbstractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ClassSmartPhone
		System.out.println("-------------------- ClassAndroidPhone --------------------");
		// Can't Instantiate
		// ClassPhone newPhone = new ClassPhone("JAVA");
		ClassAndroidPhone newAndroidPhone = new ClassAndroidPhone("JAVA");
		newAndroidPhone.turnOn();
		newAndroidPhone.internetSearch();
		newAndroidPhone.turnOff();

		// ClassPhone
		System.out.println("-------------------- ClassPhone --------------------");
		ClassPhone newPhone = null;
		ClassIOSPhone newIOSPhone = new ClassIOSPhone("C#");
		newPhone = newAndroidPhone;
		newPhone.calling();
		newPhone = newIOSPhone;
		newPhone.calling();

		// ClassPhone Static
		System.out.println("-------------------- ClassPhone Static --------------------");
		ClassPhone.phoneCalling(new ClassAndroidPhone("JS"));
		ClassPhone.phoneCalling(new ClassIOSPhone("PHP"));

		// ClassHttpServlet
		System.out.println("-------------------- ClassHttpServlet --------------------");
		methodHttpService(new ClassLoginServlet());
		methodHttpService(new ClassFileDownloadServlet());

	}

	public static void methodHttpService(ClassHttpServlet httpServlet) {
		httpServlet.service();
	}

}
