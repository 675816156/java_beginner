all:
	export LD_LIBRARY_PATH=.
	javac Jni.java
	javah -jni Jni
	gcc -I/usr/lib/jvm/java-8-openjdk-amd64/include/ -I/usr/lib/jvm/java-8-openjdk-amd64/include/linux/ -fPIC --share jni_test.c -o libjni.so
	@echo "++++++running java test code..."
	@java Jni
	@echo "------java test code end."

.PHONY:clean
clean:
	rm -rf *.class *.so
