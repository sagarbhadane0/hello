package com.example.dell_pc.assignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {

    Button btnnext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        btnnext=(Button)findViewById(R.id.btnnext4);
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main4Activity.this,Main5Activity.class);
                startActivity(intent);
            }
        });
    }
}
