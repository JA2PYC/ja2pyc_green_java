package ch06.pac06;

public class ClassAccessModifier {
	// Static Field
	static ClassAccessModifier accessModifierPublic = new ClassAccessModifier(true);
	static ClassAccessModifier accessModifierDefault = new ClassAccessModifier(1);
	static ClassAccessModifier accessModifierProtected = new ClassAccessModifier(1, 1.0);
	static ClassAccessModifier accessModifierPrivate = new ClassAccessModifier("Private");
	
	// Field
	public boolean boolValue;
	int intValue;
	protected double doubleValue;
	private String strValue;

	// Constructor
	public ClassAccessModifier(boolean boolValue) {
		this.boolValue = boolValue;
	}

	ClassAccessModifier(int intValue) {
		this.intValue = intValue;
	}

	protected ClassAccessModifier(int intValue, double doubleValue) {
		this.intValue = intValue;
		this.doubleValue = doubleValue;
	}

	private ClassAccessModifier(String strValue) {
		this.strValue = strValue;
		System.out.println("strValue " + this.strValue);
	}

	// Method
	public void methodPublic () { 
		System.out.println("methodPublic");
	}
	
	void methodDefault () {
		System.out.println("methodDefault");
	}
	
	protected void methodProtected() {
		System.out.println("methodProtected");
	}
	
	void callMethodPivate() {
		methodPrivate();
	}
	
	private void methodPrivate() {
		System.out.println("methodPrivate");
	}
}
