public class Sdtest {
	static {
		// load library: libsdtest.so
		try {
			System.loadLibrary("sdtest");
		} catch (Exception e) {
			System.out.println("WARNING: Could not load library!" + e.getMessage());
		}
	}

	public static native int sdtest();
	public static void main(String []args) {
		try {
			int ret = sdtest();
			System.out.println("sdtest = " + ret);
		} catch (Exception e) {
			System.out.println("sdtest function not found" + e.getMessage());
		}
		System.out.println("Hello\n");
		return;
	}
}
