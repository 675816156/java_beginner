/*
 * javac Jni.java
 * javah -jni Jni
*/
public class Jni {

	/* export LD_LIBRARY_PATH=. */
	static {
		System.loadLibrary("jni"); /* need libjni.so */
	}

	public native static void jni_test();
	public static void main(String args[]) {
		System.out.println("Jni");
		jni_test();
	}
}
