package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.input);
        display.setShowSoftInputOnFocus(false);
        display.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (getString(R.string.display).equals(display.getText().toString())){
                    display.setText("");
                }
            }
        });

    }

    private void updateText(String stringToAdd){
        String oldString = display.getText().toString();
        int cursorPosition = display.getSelectionStart();
        String leftString = oldString.substring(0, cursorPosition);
        String rightString = oldString.substring(cursorPosition);
        if (getString(R.string.display).equals(display.getText().toString())){
            display.setText(stringToAdd);
            display.setSelection(cursorPosition + 1);
        }
        else {
            display.setText(String.format("%s%s%s", leftString, stringToAdd, rightString));
            display.setSelection(cursorPosition + 1);
        }
    }

    public void zeroButton(View view){
        updateText("0");
    }

    public void oneButton(View view){
        updateText("1");
    }

    public void twoButton(View view){
        updateText("2");
    }

    public void threeButton(View view){
        updateText("3");
    }

    public void fourButton(View view){
        updateText("4");
    }

    public void fiveButton(View view){
        updateText("5");
    }

    public void sixButton(View view){
        updateText("6");
    }

    public void sevenButton(View view){
        updateText("7");
    }

    public void eightButton(View view){
        updateText("8");
    }

    public void nineButton(View view){
        updateText("9");
    }

    public void clearButton(View view){
        display.setText("");
    }

    public void exponentButton(View view){

    }

    public void parenthesesButton(View view){

    }

    public void divideButton(View view){

    }

    public void multiplyButton(View view){

    }

    public void plusButton(View view){

    }

    public void minusButton(View view){

    }

    public void dotButton(View view){
        updateText(".");
    }

    public void equalButton(View view){

    }

    public void backspaceButton(View view){

    }

    public void displayButton(View view){

    }
}