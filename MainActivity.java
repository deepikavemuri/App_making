package com.example.anantharam.planmytrip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    Button btn= (Button) findViewById(R.id.button);
    btn.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick(View v){
        Intent i = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(i);
    }
    });

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
