package com.ruanyandong.androidndk;

public class HelloWorld {
    static{
        System.loadLibrary("JNIFirst");
    }

    public native String getHelloWorld();
}
