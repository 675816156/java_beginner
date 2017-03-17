/*
 * =====================================================================================
 *
 *       Filename:  sdtest.c
 *
 *    Description:
 *
 *        Version:  1.0
 *        Created:  03/17/2017 09:08:55 AM
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         Author:  YOUR NAME (),
 *   Organization:
 *
 * =====================================================================================
 */
#include <stdlib.h>
#include <jni.h>
#include <stdio.h>

#define JNIREG_CLASS "Sdtest"

int sdtest(void)
{
	printf("chenjun %s %d\n", __func__, __LINE__);
	return 0;
}

static JNINativeMethod gMethods[] = {
	{ "sdtest", "()I", (void*)sdtest },
};

/*
* Register native methods for all classes we know about.
*/
static int registerNatives(JNIEnv* env)
{
	jclass clazz;
	int numMethods;

	clazz = (*env)->FindClass(env, JNIREG_CLASS);
	numMethods = sizeof(gMethods) / sizeof(gMethods[0]);

	if (clazz == NULL) {
		return JNI_FALSE;
	}

	if ((*env)->RegisterNatives(env, clazz, gMethods, numMethods) < 0) {
		return JNI_FALSE;
	}

	return JNI_TRUE;
}

JNIEXPORT jint JNICALL JNI_OnLoad(JavaVM* vm, void* reserved)
{
	JNIEnv* env = NULL;
	jint result = -1;

	if ((*vm)->GetEnv(vm, (void**) &env, JNI_VERSION_1_4) != JNI_OK) {
		return -1;
	}

	if (!registerNatives(env)) {
		return -1;
	}
	/* success -- return valid version number */
	result = JNI_VERSION_1_4;

	return result;
}
