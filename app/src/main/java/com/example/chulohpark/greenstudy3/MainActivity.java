package com.example.chulohpark.greenstudy3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn2,btn3,btn4; // Object (객체) 선언

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn2 = (Button) findViewById(R.id.btn2); //연결
        btn3 = (Button) findViewById(R.id.btn3); //연결
        btn4 = (Button) findViewById(R.id.btn4); //연결

        btn2.setOnClickListener(new View.OnClickListener() {  // 이벤트 구현

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Button 2 클릭", Toast.LENGTH_SHORT).show();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {  // 이벤트 구현

            @Override
            public void onClick(View v) {
               // Toast.makeText(getApplicationContext(), "Button 3 클릭", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext (), SubActivity.class);
                startActivity(intent);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {  // 이벤트 구현

            @Override
            public void onClick(View v) {
                // Toast.makeText(getApplicationContext(), "Button 3 클릭", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext (), Sub2Activity.class);
                startActivity(intent);
            }
        });




    }
    public void onButton1ClickFn(View v){

        Toast.makeText(getApplicationContext(),"BUTTON1 클릭",Toast.LENGTH_SHORT).show();

    }
}
