package com.example.avinash.threet;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import static android.graphics.Color.RED;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    public int playerCheck = 1;
    public int buttonOne =1,buttonTwo=1,buttonThree=1,buttonFour=1,buttonFive=1,buttonSix=1,buttonSeven=1,buttonEight=1,buttonNine=1;
    public int []player1={0,0,0,0,0,0,0,0,0,0};
    TextView topDisplay,bottomDisplay;

    Button one,two,three,four,five,six,seven,eight,nine;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         topDisplay = (TextView)findViewById(R.id.topDisplay);
         bottomDisplay = (TextView)findViewById(R.id.bottomDisplay);

         one = (Button)findViewById(R.id.one);
         two = (Button)findViewById(R.id.two);
         three = (Button)findViewById(R.id.three);
         four = (Button)findViewById(R.id.four);
         five = (Button)findViewById(R.id.five);
         six = (Button)findViewById(R.id.six);
         seven  = (Button)findViewById(R.id.seven);
         eight = (Button)findViewById(R.id.eight);
         nine = (Button)findViewById(R.id.nine);

        String font = "fonts/oj.ttf";
        Typeface buttonFont = Typeface.createFromAsset(getAssets(),font);
        one.setTypeface(buttonFont);
        two.setTypeface(buttonFont);
        three.setTypeface(buttonFont);
        four.setTypeface(buttonFont);
        five.setTypeface(buttonFont);
        six.setTypeface(buttonFont);
        seven.setTypeface(buttonFont);
        eight.setTypeface(buttonFont);
        nine.setTypeface(buttonFont);
        topDisplay.setTypeface(buttonFont);
        bottomDisplay.setTypeface(buttonFont);

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);

    }

    void compute(int []player1){
        TextView wonText = (TextView)findViewById(R.id.wonText);
        String font = "fonts/oj.ttf";
        Typeface buttonFont = Typeface.createFromAsset(getAssets(),font);
        wonText.setTypeface(buttonFont);

        if(player1[1]==1 && player1[2]==1 && player1[3]==1){
            one.setTextColor(Color.WHITE);
            two.setTextColor(Color.WHITE);
            three.setTextColor(Color.WHITE);
            wonText.setText("PLAYER-1 WIN");
            wonText.setHighlightColor(RED);
            blockButton();

        }
        else if(player1[4]==1 && player1[5]==1 && player1[6]==1){
            four.setTextColor(Color.WHITE);
            five.setTextColor(Color.WHITE);
            six.setTextColor(Color.WHITE);
            wonText.setText("PLAYER-1 WIN");
            wonText.setHighlightColor(RED);
            blockButton();


        }else if(player1[7]==1 && player1[8]==1 && player1[9]==1){
            seven.setTextColor(Color.WHITE);
            eight.setTextColor(Color.WHITE);
            nine.setTextColor(Color.WHITE);
            wonText.setText("PLAYER-1 WIN");
            wonText.setHighlightColor(RED);
            blockButton();


        }else if(player1[1]==1 && player1[4]==1 && player1[7]==1){
            one.setTextColor(Color.WHITE);
            four.setTextColor(Color.WHITE);
            seven.setTextColor(Color.WHITE);
            wonText.setText("PLAYER-1 WIN");
            wonText.setHighlightColor(RED);
            blockButton();

        }else if(player1[2]==1 && player1[5]==1 && player1[8]==1){
            two.setTextColor(Color.WHITE);
            five.setTextColor(Color.WHITE);
            eight.setTextColor(Color.WHITE);
            wonText.setText("PLAYER-1 WIN");
            wonText.setHighlightColor(RED);
            blockButton();

        }else if(player1[3]==1 && player1[6]==1 && player1[9]==1){
            three.setTextColor(Color.WHITE);
            six.setTextColor(Color.WHITE);
            nine.setTextColor(Color.WHITE);
            wonText.setText("PLAYER-1 WIN");
            wonText.setHighlightColor(RED);
            blockButton();

        }else if (player1[1]==1 &&player1[5]==1 && player1[9]==1){
            one.setTextColor(Color.WHITE);
            five.setTextColor(Color.WHITE);
            nine.setTextColor(Color.WHITE);
            wonText.setText("PLAYER-1 WIN");
            wonText.setHighlightColor(RED);
            blockButton();

        }else if(player1[3]==1 && player1[5]==1 && player1[7]==1){
            three.setTextColor(Color.WHITE);
            five.setTextColor(Color.WHITE);
            seven.setTextColor(Color.WHITE);
            wonText.setText("PLAYER-1 WIN");
            wonText.setHighlightColor(RED);
            blockButton();

        }else if(player1[1]==2 && player1[2]==2 && player1[3]==2){
            one.setTextColor(Color.WHITE);
            two.setTextColor(Color.WHITE);
            three.setTextColor(Color.WHITE);
            wonText.setText("PLAYER-2 WIN");
            wonText.setHighlightColor(RED);
            blockButton();

        }else if (player1[4]==2 && player1[5]==2 && player1[6]==2){
            four.setTextColor(Color.WHITE);
            five.setTextColor(Color.WHITE);
            six.setTextColor(Color.WHITE);
            wonText.setText("PLAYER-2 WIN");
            wonText.setHighlightColor(RED);
            blockButton();
        }else if (player1[7]==1 && player1[8]==1 && player1[9]==1){
            seven.setTextColor(Color.WHITE);
            eight.setTextColor(Color.WHITE);
            nine.setTextColor(Color.WHITE);
            wonText.setText("PLAYER-2 WIN");
            wonText.setHighlightColor(RED);
            blockButton();

        }else if (player1[1]==2 && player1[4]==2 && player1[7]==2){
            one.setTextColor(Color.WHITE);
            four.setTextColor(Color.WHITE);
            seven.setTextColor(Color.WHITE);
            wonText.setText("PLAYER-2 WIN");
            wonText.setHighlightColor(RED);
            blockButton();

        }else if (player1[2]==2 && player1[5]==2 && player1[8]==2){
            two.setTextColor(Color.WHITE);
            five.setTextColor(Color.WHITE);
            eight.setTextColor(Color.WHITE);
            wonText.setText("PLAYER-2 WIN");
            wonText.setHighlightColor(RED);
            blockButton();

        }else if (player1[3]==2 && player1[6]==2 && player1[9]==2){
            three.setTextColor(Color.WHITE);
            six.setTextColor(Color.WHITE);
            nine.setTextColor(Color.WHITE);
            wonText.setText("PLAYER-2 WIN");
            wonText.setHighlightColor(RED);
            blockButton();

        }else if (player1[1]==2 &&player1[5]==2 && player1[9]==2){
            one.setTextColor(Color.WHITE);
            five.setTextColor(Color.WHITE);
            nine.setTextColor(Color.WHITE);
            wonText.setText("PLAYER-2 WIN");
            wonText.setHighlightColor(RED);
            blockButton();

        }else if(player1[3]==2 && player1[5]==2 && player1[7]==2){
            three.setTextColor(Color.WHITE);
            five.setTextColor(Color.WHITE);
            seven.setTextColor(Color.WHITE);
            wonText.setText("PLAYER-2 WIN");
            wonText.setHighlightColor(RED);
            blockButton();

        }
    }

    void blockButton(){
        one.setEnabled(false);
        two.setEnabled(false);
        three.setEnabled(false);
        four.setEnabled(false);
        five.setEnabled(false);
        six.setEnabled(false);
        seven.setEnabled(false);
        eight.setEnabled(false);
        nine.setEnabled(false);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.one:
                if (buttonOne == 1) {
                    buttonOne = 0;
                    if (playerCheck == 1) {
                        one.setText("x");
                        topDisplay.setText("PLAYER-2");
                        bottomDisplay.setText("");
                        playerCheck = 0;
                        player1[1] = 1;
                        compute(player1);
                    } else {
                        one.setText("o");
                        playerCheck = 1;
                        bottomDisplay.setText("PLAYER-1");
                        topDisplay.setText("");
                        player1[1] = 2;
                        compute(player1);
                    }
                }
                break;

            case R.id.two:
                if (buttonTwo == 1) {
                    buttonTwo = 0;
                    if (playerCheck == 1) {
                        two.setText("x");
                        playerCheck = 0;
                        topDisplay.setText("PLAYER-2");
                        bottomDisplay.setText("");
                        player1[2] = 1;
                        compute(player1);
                    } else {
                        two.setText("o");
                        playerCheck = 1;
                        bottomDisplay.setText("PLAYER-1");
                        topDisplay.setText("");
                        player1[2] = 2;
                        compute(player1);
                    }
                }
                break;

            case R.id.three:

                if (buttonThree == 1) {
                    buttonThree = 0;
                    if (playerCheck == 1) {
                        three.setText("x");
                        playerCheck = 0;
                        topDisplay.setText("PLAYER-2");
                        bottomDisplay.setText("");
                        player1[3] = 1;
                        compute(player1);
                    } else {
                        three.setText("o");
                        playerCheck = 1;
                        bottomDisplay.setText("PLAYER-1");
                        topDisplay.setText("");
                        player1[3] = 2;
                        compute(player1);
                    }
                }
                break;

            case R.id.four:

                if (buttonFour == 1) {
                    buttonFour = 0;
                    if (playerCheck == 1) {
                        four.setText("x");
                        playerCheck = 0;
                        topDisplay.setText("PLAYER-2");
                        bottomDisplay.setText("");
                        player1[4] = 1;
                        compute(player1);
                    } else {
                        four.setText("o");
                        playerCheck = 1;
                        bottomDisplay.setText("PLAYER-1");
                        topDisplay.setText("");
                        player1[4] = 2;
                        compute(player1);
                    }
                }
                break;
            case R.id.five:
                if (buttonFive == 1) {
                    buttonFive = 0;
                    if (playerCheck == 1) {
                        five.setText("x");
                        playerCheck = 0;
                        topDisplay.setText("PLAYER-2");
                        bottomDisplay.setText("");
                        player1[5] = 1;
                        compute(player1);
                    } else {
                        five.setText("o");
                        playerCheck = 1;
                        bottomDisplay.setText("PLAYER-1");
                        topDisplay.setText("");
                        player1[5] = 2;
                        compute(player1);
                    }
                }

                break;

            case R.id.six:
                if (buttonSix == 1) {
                    buttonSix = 0;
                    if (playerCheck == 1) {
                        six.setText("x");
                        playerCheck = 0;
                        topDisplay.setText("PLAYER-2");
                        bottomDisplay.setText("");
                        player1[6] = 1;
                        compute(player1);
                    } else {
                        six.setText("o");
                        playerCheck = 1;
                        bottomDisplay.setText("PLAYER-1");
                        topDisplay.setText("");
                        player1[6] = 2;
                        compute(player1);
                    }
                }
                break;


            case R.id.seven:
                if (buttonSeven == 1) {
                    buttonSeven = 0;
                    if (playerCheck == 1) {
                        seven.setText("x");
                        playerCheck = 0;
                        topDisplay.setText("PLAYER-2");
                        bottomDisplay.setText("");
                        player1[7] = 1;
                        compute(player1);
                    } else {
                        seven.setText("o");
                        playerCheck = 1;
                        bottomDisplay.setText("PLAYER-1");
                        topDisplay.setText("");
                        player1[7] = 2;
                        compute(player1);
                    }
                }
                break;

            case R.id.eight:
                if (buttonEight == 1) {
                    buttonEight = 0;
                    if (playerCheck == 1) {
                        eight.setText("x");
                        playerCheck = 0;
                        topDisplay.setText("PLAYER-2");
                        bottomDisplay.setText("");
                        player1[8] = 1;
                        compute(player1);
                    } else {
                        eight.setText("o");
                        playerCheck = 1;
                        bottomDisplay.setText("PLAYER-1");
                        topDisplay.setText("");
                        player1[8] = 2;
                        compute(player1);
                    }
                }
                break;

            case R.id.nine:
                if (buttonNine == 1) {
                    buttonNine = 0;
                    if (playerCheck == 1) {
                        nine.setText("x");
                        playerCheck = 0;
                        topDisplay.setText("PLAYER-2");
                        bottomDisplay.setText("");
                        player1[9] = 1;
                        compute(player1);
                    } else {
                        nine.setText("o");
                        playerCheck = 1;
                        bottomDisplay.setText("PLAYER-1");
                        topDisplay.setText("");
                        player1[9] = 2;
                        compute(player1);
                    }
                }
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {

            Intent i = getBaseContext().getPackageManager()
                    .getLaunchIntentForPackage( getBaseContext().getPackageName() );
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
        }else if(id == R.id.bluetooth){

        }

        return super.onOptionsItemSelected(item);
    }
}
