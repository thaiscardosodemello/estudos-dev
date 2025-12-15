package entities;

public class Student {
	public String name;
	public double grade1, grade2, grade3;

	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}

	public boolean isApproved() {
		return finalGrade() >= 60.0;
	}

	public double missingPoints() {
		if (isApproved()) {
			return 0.0;
		}
		return 60.0 - finalGrade();
	}
}
