package Test01;

import java.util.Scanner;

public class test {

}

class p{
	String a;
	int x,y;
	
}
 

class Main1 {
	static Scanner in=new Scanner(System.in); 
    
	public static void main(String[] args) {
		p a=new p();
		a.x=10;
		p[] b=new p[2];
		for(int i=0;i<2;i++){//һ��Ҫ������һ��
			b[i]=new p();
		}
		for(int i=0;i<2;i++){
			b[i].x=in.nextInt();
			b[i].y=in.nextInt();
			b[i].a = in.next();
		}
		for(int i=0;i<2;i++){
			System.out.println(b[i].x+b[i].y);
		}
		Scanner in1=new Scanner(System.in);
		System.out.println("What is your name��");
		String name1=in1.nextLine();
		System.out.println("���������"+name1);
		Scanner in2=new Scanner(System.in);
		System.out.println("What is your name��");
		String name2=in2.next();
		System.out.println("���������"+name2);

		
	}
}


