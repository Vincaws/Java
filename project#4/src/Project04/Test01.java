package Project04;

public class Test01 {
	public static void main(String[] args) {

	}
}

class Person {
	String name;

	public void smoking() {

	}
}

class Student extends Person {
	public void smoking() {
		System.out.println("___");
	}
}

class Worker extends Person {
	public void smoking() {
		System.out.println("____");
	}

	public void smoking1() {
		System.out.println("123");
	}
}

class Tset0121 {
	public static void main(String[] args) {
		Person person_worker = new Worker();
		person_worker.smoking();
	}
}

abstract class Teacher {
	String name;
	int age;

	public abstract void teaching();
}

class JavaTeacher extends Teacher {

	@Override
	public void teaching() {

		System.out.println("PHP Teaching");
	}

}

class Test0123 {
	public static void main(String[] args) {
		System.out.println("Hello world");
	}
}