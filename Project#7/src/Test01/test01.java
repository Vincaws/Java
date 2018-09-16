package Test01;


public class test01 {
	public static void main(String[] args) {
		System.out.println("Ryzen 7 2700x");
	}
}

class Test{
	public static void main(String[] args) {
		Test test = new Test();
		test.print();
	}
	
	public void print() {
		A a = new A();
		a.print1();
	}
	
	public class A{
		private void print1() {
			System.out.println("Hello java11");
		}
	}
}