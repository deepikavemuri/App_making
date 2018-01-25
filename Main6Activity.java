package com.example.anantharam.planmytrip;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main6Activity extends AppCompatActivity {


    public Button button13;

    public void start11() {
        button13 = (Button)findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main6Activity.this, Main3Activity.class);
                startActivity(i);
            }
        });
    }

    public Button button12;

    public void start12() {
        button12 = (Button)findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main6Activity.this, Main8Activity.class);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        start11();
        start12();
    }
}
