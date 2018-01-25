package com.example.anantharam.planmytrip;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main5Activity extends AppCompatActivity {


    public Button button11;

    public void start9() {
        button11 = (Button)findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main5Activity.this, Main3Activity.class);
                startActivity(i);
            }
        });
    }

    public Button button9;

    public void start11() {
        button9 = (Button)findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main5Activity.this, Main8Activity.class);
                startActivity(i);
            }
        });
    }

    public Button button19;

    public void start12() {
        button19 = (Button)findViewById(R.id.button19);
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main5Activity.this, Main8Activity.class);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        start9();
        start12();
        start11();
    }
}
