LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE := JNIFirst
LOCAL_SRC_FILES := com_ruanyandong_androidndk_HelloWorld_getHelloWorld.c
include $(BUILD_SHARED_LIBRARY)