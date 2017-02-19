public class Type {
	public static void main(String args[]) {
		System.out.println("Type size");
		System.out.println("Integer: " + Integer.SIZE/8);           // 4  
		System.out.println("Short: " + Short.SIZE/8);               // 2      
		System.out.println("Long: " + Long.SIZE/8);                 // 8  
		System.out.println("Byte: " + Byte.SIZE/8);                 // 1  
		System.out.println("Character: " + Character.SIZE/8);       // 2  
		System.out.println("Float: " + Float.SIZE/8);               // 4  
		System.out.println("Double: " + Double.SIZE/8);             // 8  
		//System.out.println("Boolean: " + Boolean);  
		System.out.println("数组:");
		int a[] = null;
		a = new int[10];

		/* int b[] = new int[10]; */

		int c[] = {1, 2, 3, 4, 5};
		System.out.println("类:");
		System.out.println("接口:");
		System.out.println("null");
		System.out.println("数据类型转换");
		System.out.println("注意：整数默认是int, 有小数时默认是double");
		
		//编译器会判断该值有无超过该变量的表示范围，如果超过就报错。
		byte  b= 1;
		short s0 = 1;
		short s1 = 1;
		short s2 = 1;

		// 出错，因为对于byte，short的运算，为了保证精度，会自动转换为int类型
		/* s1 = s1 + 1;  */

		s1 = (short)(s1 + 1);

		/* s0 = s1 + s2;  // 出错，理由同上 */
	}
}
