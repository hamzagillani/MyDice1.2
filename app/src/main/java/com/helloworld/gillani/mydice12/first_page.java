package com.helloworld.gillani.mydice12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class first_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);

        ImageView dice1=(ImageView) findViewById(R.id.dice1);
        ImageView dice2=(ImageView) findViewById(R.id.dice2);
        ImageView dice3=(ImageView) findViewById(R.id.dice3);

        dice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(first_page.this,Dice_1.class);
                startActivity(intent);

            }
        });

        dice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(first_page.this,MainActivity.class);
                startActivity(intent);

            }
        });

        dice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(first_page.this,Dice_3.class);
                startActivity(intent);

            }
        });
    }
}
