package com.example.android.interfatamobilight;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button led1 = (Button) findViewById(R.id.led1);
        final TextView textTest = (TextView) findViewById(R.id.textTest);
        led1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textTest.setText("MUIE POP");
            }
        });

    }
}
