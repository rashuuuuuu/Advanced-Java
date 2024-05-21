package javaIntro;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sysout control space
		//main control space
		calculator c=new calculator();
		c.add(2, 3);
		int sub =c.sub();
		System.out.println("subtract=" +sub);
		c.mul(3, 4);
		
		System.out.println("division=" +div(4,2));
		c.mode();

	}
	public void add(int a, int b) {
		int add=a+b;
		System.out.println("Add="+add);
	}
	//no argument with return value
	public int sub() {
		int sub;
		
		sub=8-4;
		return sub;
		
	}
	//argument with no return value
	public void mul(int a, int b) {
		int mul=a*b;
		System.out.println("Multiply="+mul);
	}
	//argument with return value
	public static int div(int a, int b) {
		return a/b;
		
	}
	//no argument no return value
	public void mode() {
		float mode=8%5;
		System.out.println("mode="+mode);
	}

}
//mysql_connector-jar file
