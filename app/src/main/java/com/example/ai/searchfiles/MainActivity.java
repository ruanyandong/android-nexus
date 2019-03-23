package com.example.ai.searchfiles;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ai.javalib.javaPlugin;
import com.example.mylibrary.A;
import com.example.mylibrary2.lib;
import com.example.mylibrary3.lib3;
import java.io.File;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        A.p();
        lib.lib();
        lib3.lib3();
        // javalib
        javaPlugin plugin = new javaPlugin("ai",20);
    }

    private String searchFile(String keyword){
        String result="";
        File[] files=new File(Environment.getExternalStorageDirectory()+"").listFiles();
        for(File file:files){
            if(file.getName().indexOf(keyword)>=0){
                result+=file.getPath()+"\n";
            }
        }
        if (result.equals("")){
            result="找不到文件";
        }
        return result;
    }
}
