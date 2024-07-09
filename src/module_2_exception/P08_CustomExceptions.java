package module_2_exception;

class Student {

	String rollNo;
	String name;
	int age;
	String course;

	public Student(String rollNo, String name, int age, String course) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.course = course;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

}

class AgeNotWithinRangeException extends Exception {

	public AgeNotWithinRangeException(String str) {
		super(str);
	}

}

class NameNotValidException extends Exception {

	public NameNotValidException(String str) {
		super(str);
	}
}

public class P08_CustomExceptions {

	public static void main(String[] args) {

		Student s = new Student("1", "Anjali#$", 25, "Java");
		try {
			validateStudent(s);
		} catch (AgeNotWithinRangeException | NameNotValidException e) {
			e.printStackTrace();
		}
	}

	static void validateStudent(Student s) throws AgeNotWithinRangeException, NameNotValidException {

		int age = s.getAge();
		String name = s.getName();
		if (age >= 15 && age <= 21) {
			throw new AgeNotWithinRangeException("Age not within Range.");
		} else {
			System.out.println("student name: " + s.name + " student age:" + age);
		}

		char a[] = name.toCharArray();
		for (int i = 0; i < a.length; i++) {
			if (!Character.isLetter(a[i])) {
				throw new NameNotValidException("Name is not valid.");
			}
		}
	}
}
