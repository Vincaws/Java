package Test01;

public class test01 {
	public static void main(String[] args) {
		System.out.println("Hello java");
	}
}

/**
 * @author Chan_ 必须实现的一个业务方法
 */

abstract class AbstractPublic {
	public abstract void abstractMetnod();

	public void hookMethod() {

	}

	public final void concerteMethod() {

	}

	/**
	 * @author Chan_
	 *
	 */

	public void temlatMethod() {
		concerteMethod();
		hookMethod();
		abstractMetnod();
	}
}

class Concrete extends AbstractPublic {

	@Override
	public void abstractMetnod() {
		System.out.println("Concreate Method");
	}

	public void hookMethod() {
		System.out.println("Method Rewrite");
	}

}

