import zhangsan.*;
import lisi.*;
public class Pack {
	public static void main(String args[]) {
		System.out.println("Hello Package");
		System.out.println("add" + zhangsan.Math.add(1, 2));
		System.out.println("sub" + lisi.Math.sub(1, 2));
	}
}
