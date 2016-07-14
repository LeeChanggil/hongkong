package com.example.my;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.text.NumberFormat;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    int a = 0;
    int b = 0;
    TextView count1;
    TextView count2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        count1 = (TextView) findViewById(R.id.i_v1);
        count2 = (TextView) findViewById(R.id.i_v2);

        final Button button1 = (Button) findViewById(R.id.but1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               a += 1;
                count1.setText(""+a);
            }
        });
        final Button button2 = (Button) findViewById(R.id.but2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                a -= 1;
                count1.setText(""+a);
            }
        });
        final Button button3 = (Button) findViewById(R.id.but3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                b += 1;
                count2.setText(""+b);
            }
        });
        final Button button4 = (Button) findViewById(R.id.but4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                b -= 1;
                count2.setText(""+b);
            }
        });

    }
}
