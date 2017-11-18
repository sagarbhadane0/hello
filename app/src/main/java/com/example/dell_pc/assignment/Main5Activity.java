package com.example.dell_pc.assignment;

import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class Main5Activity extends AppCompatActivity {

    AssetManager assetManager;
    InputStream inputStream;
    BufferedReader bufferedReader;
    HashSet<String> hashSet;
    ListView listView;
    Button btnanswer;
    String ls;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        listView=(ListView)findViewById(R.id.ddlCity);
        btnanswer=(Button)findViewById(R.id.btnNextnext1);
        btnanswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Main5Activity.this,Main6Activity.class);
                String stringInted;
                i.putExtra("Hello",ls);
                startActivity(i);

            }
        });
        assetManager=getAssets();
        try {

            inputStream =assetManager.open("words.txt");
            bufferedReader= new BufferedReader(new InputStreamReader(inputStream));
            String s=null;
            hashSet=new HashSet<String>();
            int i=0;
            while ((s=bufferedReader.readLine())!=null)
            {
                String word = s.trim();
                hashSet.add(word);
                i++;


            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("HashSet:"+hashSet);
        ArrayList<String> list=new ArrayList<String>(hashSet);
        Random r=new Random();
        Collections.shuffle(list);
        int randome=r.nextInt(list.size());
        ls=list.get(randome);
        int i=0;
        for(String as: list)
        {
            if(i%9==0)
            {
                list.set(i,i+" "+ls);
            }
            else
            {
                list.set(i,i+" "+list.get(i));

            }
            i++;
        }
        System.out.println(list);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);



    }
}
