package com.example.dell_pc.assignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    Button btnnext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btnnext=(Button)findViewById(R.id.btnnext3);
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Main3Activity.this,Main4Activity.class);
                startActivity(i);
            }
        });
    }
}
