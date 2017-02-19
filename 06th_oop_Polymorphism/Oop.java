class Father {
	public void printInfo() {
		System.out.println("This is Father");
	}

	public void drink() {
		System.out.println("Father is drinking");
	}
}

class Son extends Father {
	public void printInfo() {
		System.out.println("This is Son");
	}

	public void play() {
		System.out.println("Son is playing");
	}
}

class Daughter extends Father {
	public void printInfo() {
		System.out.println("This is Daughter");
	}

	public void dance() {
		System.out.println("Daughter is dancing");
	}
}


public class Oop {
	public static void main(String args[]) {
		/* Son son = new Son();
		Daughter daughter = new Daughter();

		Father f = son;
		f.printInfo();

		Father g = daughter;
		g.printInfo(); */

		/* //执行出错！
		Father f = new Father();
		Son son = (Son)f;
		f.printInfo(); */

		/* Father f = new Son();
		Son son = (Son)f;
		f.printInfo(); */

		Father f = new Father();
		Son s = new Son();
		Daughter d = new Daughter();

		print(f);
		print(s);
		print(d);

		printAction(f);
		printAction(s);
		printAction(d);
	}

	public static void printAction(Father f) {
		if (f instanceof Son) {
			Son son = (Son)f;
			son.play();
		} else if (f instanceof Daughter) {
			Daughter d = (Daughter)f;
			d.dance();
		} else if (f instanceof Father) {
			f.drink();
		} else {
			System.out.println("unknown type f");
		}
	}

	public static void print(Father f) {
		f.printInfo();
	}
	/* public static void print(Father f) {
		f.printInfo();
	}
	public static void print(Son s) {
		s.printInfo();
	}
	public static void print(Daughter d) {
		d.printInfo();
	} */
}
