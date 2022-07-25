package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven, buttonEight, buttonNine, buttonZero;
    Button buttonAdd, buttonMul, buttonSub, buttonDiv;
    Button buttonEqual, buttonDot, buttonClear;
    EditText textResults;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonOne = (Button)findViewById(R.id.buttonOne);
        buttonOne.setOnClickListener(this);
        buttonTwo = (Button)findViewById(R.id.buttonTwo);
        buttonTwo.setOnClickListener(this);
        buttonThree = (Button)findViewById(R.id.buttonThree);
        buttonThree.setOnClickListener(this);
        buttonFour = (Button)findViewById(R.id.buttonFour);
        buttonFour.setOnClickListener(this);
        buttonFive = (Button)findViewById(R.id.buttonFive);
        buttonFive.setOnClickListener(this);
        buttonSix = (Button)findViewById(R.id.buttonSix);
        buttonSix.setOnClickListener(this);
        buttonSeven = (Button)findViewById(R.id.buttonSeven);
        buttonSeven.setOnClickListener(this);
        buttonEight = (Button)findViewById(R.id.buttonEight);
        buttonEight.setOnClickListener(this);
        buttonNine = (Button)findViewById(R.id.buttonNine);
        buttonNine.setOnClickListener(this);
        buttonZero = (Button)findViewById(R.id.buttonZero);
        buttonZero.setOnClickListener(this);
        buttonAdd = (Button)findViewById(R.id.buttonAdd);
        buttonAdd.setOnClickListener(this);
        buttonSub = (Button)findViewById(R.id.buttonSub);
        buttonSub.setOnClickListener(this);
        buttonMul = (Button)findViewById(R.id.buttonMul);
        buttonMul.setOnClickListener(this);
        buttonDiv = (Button)findViewById(R.id.buttonDiv);
        buttonDiv.setOnClickListener(this);
        buttonEqual = (Button)findViewById(R.id.buttonEqual);
        buttonEqual.setOnClickListener(this);
        buttonDot = (Button)findViewById(R.id.buttonDot);
        buttonDot.setOnClickListener(this);
        buttonClear = (Button)findViewById(R.id.buttonClear);
        buttonClear.setOnClickListener(this);
        textResults = (EditText)findViewById(R.id.textResults);
        textResults.setText(" ");
    }
    @Override
    public void onClick(View v) {
        if (v.equals(buttonOne))
            textResults.append("1");
        if (v.equals(buttonTwo))
            textResults.append("2");
        if (v.equals(buttonThree))
            textResults.append("3");
        if (v.equals(buttonFour))
            textResults.append("4");
        if (v.equals(buttonFive))
            textResults.append("5");
        if (v.equals(buttonSix))
            textResults.append("6");
        if (v.equals(buttonSeven))
            textResults.append("7");
        if (v.equals(buttonEight))
            textResults.append("8");
        if (v.equals(buttonNine))
            textResults.append("9");
        if (v.equals(buttonZero))
            textResults.append("0");
        if (v.equals(buttonAdd))
            textResults.append("+");
        if (v.equals(buttonSub))
            textResults.append("-");
        if (v.equals(buttonMul))
            textResults.append("*");
        if (v.equals(buttonDiv))
            textResults.append("/");
        if (v.equals(buttonDot))
            textResults.append(".");
        if (v.equals(buttonClear))
            textResults.setText("");
        if (v.equals(buttonEqual)) {
            try {
                String data = textResults.getText().toString();
                if (data.contains("/")) {
                    divid(data);
                } else if (data.contains("*")) {
                    Multi(data);
                }
                if (data.contains("+")) {
                    Addi(data);
                } else if (data.contains("-")) {
                    subs(data);
                }
            } catch (Exception e) {
                displayInvalidMessage("Invalid Input");
            }
        }
    }
    private void subs(String data){
        String[] operands = data.split( "-");
        if(operands.length==2){
            double operand1 = Double.parseDouble(operands[0]);
            double operand2 = Double.parseDouble(operands[1]);
            double Result = operand1 - operand2;
            textResults.setText(String.valueOf(Result));
        }
        else{
            displayInvalidMessage("Invalid Input");
        }
    }
    private void Addi(String data){
        String[] operands = data.split(Pattern.quote("+"));
        if(operands.length==2){
            double operand1 = Double.parseDouble(operands[0]);
            double operand2 = Double.parseDouble(operands[1]);
            double Result = operand1 + operand2;
            textResults.setText(String.valueOf(Result));
        }
        else{
            displayInvalidMessage("Invalid Input");
        }
    }
    private void Multi(String data){
        String[] operands = data.split(Pattern.quote("*"));
        if(operands.length==2){
            double operand1 = Double.parseDouble(operands[0]);
            double operand2 = Double.parseDouble(operands[1]);
            double Result = operand1 * operand2;
            textResults.setText(String.valueOf(Result));
        }
        else{
            displayInvalidMessage("Invalid Input");
        }
    }
    private void divid(String data){
        String[] operands = data.split("/");
        if(operands.length==2){
            double operand1 = Double.parseDouble(operands[0]);
            double operand2 = Double.parseDouble(operands[1]);
            double Result = operand1 / operand2;
            textResults.setText(String.valueOf(Result));
        }
        else{
            displayInvalidMessage("Invalid Input");
        }
    }

    private void displayInvalidMessage(String invalid_input) {
    }
}