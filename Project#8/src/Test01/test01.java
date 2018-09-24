package Test01;

import java.util.Arrays;

public class test01 {
	public static void main(String[] args) {
		System.out.println("Hell 1");
	}
}

class A {
	int[] a = { 1, 2, 3, 4, 8, 9, 0, 124, 4 };

	public void sort() {
		Arrays.sort(a);
	}

	public void print() {
		for (int i : a) {
			System.out.print(i+"\t");
		}
		System.out.println();
	}
	
	public static void main (String[] args) {
		A a = new A();
		a.print();
		a.sort();
		a.print();
	}
}