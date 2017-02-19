/*
面向对象

a. 封装:
	把属性/方法封装包成一个整体，限制访问权限
	private 本类可以访问
	default 本包可以访问
	protected 本包、其他包的子类可访问
	public 所有都可访问
使用方法类访问属性: setter、getter

b. 继承:
	复用代码

	final 类不能有子类
	final 方法不能被复写
	final 变量变成常量、不能被修改

继承的限制
父传子
1. 子类无法直接操作父类的私有属性/方法
2. 子类不能使父类属性/方法改为私有

c. 多态:

 */

class Person {
	private int age;

	public Person() {
		System.out.println("Person 构造方法");
	}

	public Person(int age) {
		System.out.println("Person(age) 构造方法");
		this.setAge(age);
	}

	public void setAge(int age) {
		if (age < 0 || age > 200) {
			this.age = 0;
		} else {
			this.age = age;
		}
	}

	public int getAge() {
		return this.age;
	}

	public void printInfo() {
		System.out.println("age = " + this.getAge());
	}
}

class Student extends Person {
	private String school;

	public Student(String school) {
		/* will call the super() */
		super(5);
		this.setSchool(school);
		System.out.println("Student 构造方法");
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getSchool() {
		return this.school;
	}

	/* override */
	public void printInfo() {
		System.out.println("age = " + this.getAge());
		System.out.println("school = " + this.getSchool());
	}
}

abstract class Father {
	private int money;
	public int getMoney() { return this.money; }
	public void setMoney(int money) { this.money = money; }
	private void printInfo() {
		System.out.println("money = " + this.money + "in Father");
	}
	public void printInfo2() {
		System.out.println("money = " + this.money + "in Father");
	}
	public abstract void study();
}

class Son extends Father {
	public void study() {
		System.out.println("I am Studying ...");
	}
}

interface A {
	public static final int i = 10;
	public abstract int getNum();
}

interface B {
	public static final String name = "InterfaceB";
	public abstract String getName();
}

class C implements A, B {
	public int getNum() {
		return i;
	}
	public String getName() {
		return name;
	}
}

public class Oop {
	public static void main(String args[]) {
		/* Student s0 = new Student("Hafo"); */
		//s0.setAge(10);
		/* s0.printInfo(); */

		Son son = new Son();
		System.out.println(son.getMoney());
		son.printInfo2();
		son.study();

		C c = new C();
		System.out.println(c.getName() + c.getNum());
	}
}
