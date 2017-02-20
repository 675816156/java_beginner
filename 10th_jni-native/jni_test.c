#include "Jni.h"
#include <stdio.h>
#include <stdlib.h>

/* gcc -I/usr/lib/jvm/java-8-openjdk-amd64/include/ -I/usr/lib/jvm/java-8-openjdk-amd64/include/linux/ -fPIC --share jni_test.c -o libjni.so */

JNIEXPORT void JNICALL Java_Jni_jni_1test (JNIEnv * env, jclass cls)
{
	printf("chenjun debug jni test\n");
	return;
}
