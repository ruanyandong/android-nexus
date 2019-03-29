//
// Created by AI on 2019/3/29.
//
#include "com_ruanyandong_androidndk_HelloWorld.h"

JNIEXPORT jstring JNICALL Java_com_ruanyandong_androidndk_HelloWorld_getHelloWorld
  (JNIEnv *env, jobject obj){
  return (*env)->NewStringUTF(env,"Hello,<<Android Gradle>>");
  }

