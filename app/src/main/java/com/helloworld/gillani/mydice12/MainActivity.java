package com.helloworld.gillani.mydice12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    final int[] diceArray={
            R.drawable.dice1,
            R.drawable.dice2,
            R.drawable.dice3,
            R.drawable.dice4,
            R.drawable.dice5,
            R.drawable.dice6,};
    Button rollButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rollButton=(Button)findViewById(R.id.rollbutton);

        final ImageView leftDice=(ImageView) findViewById(R.id.left_dice);
        final ImageView rightDice=(ImageView) findViewById(R.id.right_dice);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this,"Ze Button has been pressed",Toast.LENGTH_SHORT).show();
                //Log.d("Dicee","Ze Button has ben pressed!");
                Random random=new Random();
                int number=random.nextInt(6);
                //Toast.makeText(MainActivity.this,"The Random number is:"+number,Toast.LENGTH_SHORT).show();

                leftDice.setImageResource(diceArray[number]);

                number=random.nextInt(6);
                rightDice.setImageResource(diceArray[number]);
            }
        });


    }
}
