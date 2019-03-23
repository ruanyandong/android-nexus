package com.example.ai.searchfiles;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.mylibrary.A;
import com.example.mylibrary2.lib;
import com.example.mylibrary3.lib3;
import java.io.File;

public class MainActivity extends AppCompatActivity {
    private EditText mSearchEdit;
    private Button mSearchButton;
    private TextView mSearchResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSearchEdit=findViewById(R.id.edit_search);
        mSearchButton=findViewById(R.id.search_btn);
        mSearchResult=findViewById(R.id.search_result);

        mSearchButton.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                String keyword=mSearchEdit.getText().toString();
                if (keyword.equals("")){
                    mSearchResult.setText("关键字不能为空！");
                }else{
                    mSearchResult.setText(searchFile(keyword));
                }
            }
        });

        A.p();
        lib.lib();
        lib3.lib3();
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
