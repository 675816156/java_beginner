class Person {
	String name;
	static int count;

	static {
		//静态代码块只执行一次
		System.out.println("静态代码块被执行");
	}

	{
		//构造块, 在创建对象时被调用, 在构造方法执行前被调用
		System.out.println("构造块被执行");
		count++;
	}

	public Person() {
		System.out.println("无参数构造方法被执行");
		this.name = "Null";
	}

	public Person(String name) {
		System.out.println("带参数构造方法被执行");
		this.name = name;
	}

	void print() {
		System.out.println(this.name);
	}

	public static void static_print() {
		System.out.println("Total Person:" + count);
	}
}

public class oop {
	public static void main(String args[]) {
		Person nnn      = new Person();
		Person zhangsan = new Person("张三");
		Person lisi     = new Person("李四");

		nnn.print();
		zhangsan.print();
		lisi.print();

		Person.static_print();
	}
}
