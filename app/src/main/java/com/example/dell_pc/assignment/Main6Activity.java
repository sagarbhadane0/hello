package com.example.dell_pc.assignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main6Activity extends AppCompatActivity {

    TextView textView;

    Button btnrestart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Bundle bld=getIntent().getExtras();
        String srs=bld.getString("Hello");
        textView=(TextView)findViewById(R.id.txtmyanswer);
        btnrestart=(Button)findViewById(R.id.btnRestart);
        btnrestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main6Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        System.out.println("Result********************************"+srs);
        textView.setText(srs);

    }
}
