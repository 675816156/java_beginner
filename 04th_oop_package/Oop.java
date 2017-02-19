/*
面向对象
封装:
	把属性/方法封装包成一个整体，限制访问权限
	private 本类可以访问
	default 本包可以访问
	protected 本包、其他包的子类可访问
	public 所有都可访问
使用方法类访问属性: setter、getter
继承:
多态:

 */

class Person {
	private int age;

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
};

public class Oop {
	public static void main(String args[]) {
		Person p1 = new Person();
		//p1.age = 1;
		p1.setAge(-1);
		System.out.println(p1.getAge());
	}
}
