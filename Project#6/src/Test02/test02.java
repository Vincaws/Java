package Test02;

public class test02 {

}

abstract class CalltimeAbstractPublic {
	public abstract void abstractMetnod();

	public void hookMethod() {
		System.out.println("The Programing TimIng:\t");
	}

	public final long concerteMethod() {
		long CurrentTime = System.currentTimeMillis();
		return CurrentTime;
	}

	/**
	 * @author Chan_
	 *
	 */
	public void doJob() {
		for (int i = 0; i < 100; i++) {
			System.out.println("jisuan shjian");
		}
	}

	public long temlatMethod() {
		long startTime = concerteMethod();
		System.out.println("start" + startTime);
		doJob();
		long endTime = concerteMethod();
		System.out.println("end" + endTime);
		return endTime - startTime;
	}
}

class Concrete extends CalltimeAbstractPublic {
	@Override
	public void abstractMetnod() {
		System.out.println("Concreate Method");
	}
}

class TemplateDemo1 {
	public static void main(String[] args) {
		Concrete concrete = new Concrete();
		long DoTime = concrete.temlatMethod();
		System.out.println(DoTime);
	}
}