package ch13.pac01;

public class ClassStudent {
	// Field
	int sno;
	String name;
	int sum;
	double avg;

	// Constructor
	ClassStudent() {

	}

	ClassStudent(int sno, String name, int sum, double avg) {
		this.name = name;
		this.sum = sum;
		this.avg = avg;
	}

	// Method

	// Override Object equals P597
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ClassStudent) {
			ClassStudent student = (ClassStudent) obj;
			return (sno == student.sno) && (name.equals(student.name));
		} else {
			return false;
		}
	}

	// Override hashCode
	@Override
	public int hashCode() {
		return sno + name.hashCode();
	}
}
