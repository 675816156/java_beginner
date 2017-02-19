class Outer {
	/* private int a = 10; */
	private static int a = 10;
	static class Inner {
		/* public void printInfo() {
			System.out.println("Inner a = " + a);
		} */
		public void printInfo() {
			System.out.println("Inner a = " + a);
		}
	}
}

public class InnerClass {
	public static void main(String args[]) {
		/* Outer o = new Outer();
		Outer.Inner in = o.new Inner(); */
		Outer.Inner in = new Outer.Inner();
		in.printInfo();
	}
}
