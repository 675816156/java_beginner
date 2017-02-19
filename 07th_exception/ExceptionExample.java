/* m / n = div(m, n) */
public class ExceptionExample {
	public static void main(String args[]) {
		int m = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
		int r = 0;

		System.out.println("start div");
		try {
			r = div(m, n);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("This is finally");
		}
		System.out.println("end div");
		System.out.println(m + "/" + n + "=" + r);
	}

	public static int div(int m, int n) throws Exception {
		int r = 0;

		/* try {
			r = m / n;
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("This is finally");
		} */

		try {
			r = m / n;
		} catch (ArithmeticException e) {
			System.out.println(e);
			throw new Exception("chen jun error");
		} finally {
			System.out.println("This is finally");
		}
		r = m / n;
		return r;
	}
}
