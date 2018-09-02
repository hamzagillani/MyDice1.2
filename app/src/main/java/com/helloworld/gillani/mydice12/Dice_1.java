package com.helloworld.gillani.mydice12;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class Dice_1 extends AppCompatActivity {
    final int[] diceArray={
            R.drawable.dice1,
            R.drawable.dice2,
            R.drawable.dice3,
            R.drawable.dice4,
            R.drawable.dice5,
            R.drawable.dice6,};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dice_1);

        Button rollButton=(Button)findViewById(R.id.rollbutton);

        final ImageView single_dice=(ImageView) findViewById(R.id.single_dice);


        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this,"Ze Button has been pressed",Toast.LENGTH_SHORT).show();
                //Log.d("Dicee","Ze Button has ben pressed!");
                Random random=new Random();
                int number=random.nextInt(6);
                //Toast.makeText(MainActivity.this,"The Random number is:"+number,Toast.LENGTH_SHORT).show();

                single_dice.setImageResource(diceArray[number]);


            }
        });
    }
}