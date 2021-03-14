package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.calculadora.paquete_Calculadora.CalculatorOperation;


public class Calculadora extends AppCompatActivity {

    CalculatorOperation c = new CalculatorOperation();
    double number = 0;
    Boolean show = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        final TextView txt_numberCalculatorView = findViewById(R.id.txt_numberCalculatorView);
        final TextView numCalculator = findViewById(R.id.numberCalculator);
        final Button BCE = findViewById(R.id.btn_CE);
        BCE.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                numCalculator.setText("");
            }
        });

        final Button BC = findViewById(R.id.btn_C);
        BC.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                numCalculator.setText("");
                number = 0;
                txt_numberCalculatorView.setText("");
            }
        });
        final Button BAB = findViewById(R.id.btn_arrowBack);
        BAB.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                numCalculator.setText((numCalculator.length() > 0) ? numCalculator.getText().subSequence(0, numCalculator.length() - 1) : "");
            }
        });
        final Button B1 = findViewById(R.id.btn_1);
        B1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String n = "1";
                numCalculator.setText((numCalculator.getText().toString().length() > 0 && (numCalculator.getText().toString().equals("0") || show)) ? n : numCalculator.getText() + n);
                if (show) show = false;
            }
        });
        final Button B2 = findViewById(R.id.btn_2);
        B2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String n = "2";
                numCalculator.setText((numCalculator.getText().toString().length() > 0 && (numCalculator.getText().toString().equals("0") || show)) ? n : numCalculator.getText() + n);
                if (show) show = false;
            }
        });
        final Button B3 = findViewById(R.id.btn_3);
        B3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String n = "3";
                numCalculator.setText((numCalculator.getText().toString().length() > 0 && (numCalculator.getText().toString().equals("0") || show)) ? n : numCalculator.getText() + n);
                if (show) show = false;
            }
        });
        final Button B4 = findViewById(R.id.btn_4);
        B4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String n = "4";
                numCalculator.setText((numCalculator.getText().toString().length() > 0 && (numCalculator.getText().toString().equals("0") || show)) ? n : numCalculator.getText() + n);
                if (show) show = false;
            }
        });
        final Button B5 = findViewById(R.id.btn_5);
        B5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String n = "5";
                numCalculator.setText((numCalculator.getText().toString().length() > 0 && (numCalculator.getText().toString().equals("0") || show)) ? n : numCalculator.getText() + n);
                if (show) show = false;
            }
        });
        final Button B6 = findViewById(R.id.btn_6);
        B6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String n = "6";
                numCalculator.setText((numCalculator.getText().toString().length() > 0 && (numCalculator.getText().toString().equals("0") || show)) ? n : numCalculator.getText() + n);
                if (show) show = false;
            }
        });
        final Button B7 = findViewById(R.id.btn_7);
        B7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String n = "7";
                numCalculator.setText((numCalculator.getText().toString().length() > 0 && (numCalculator.getText().toString().equals("0") || show)) ? n : numCalculator.getText() + n);
                if (show) show = false;
            }
        });
        final Button B8 = findViewById(R.id.btn_8);
        B8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String n = "8";
                numCalculator.setText((numCalculator.getText().toString().length() > 0 && (numCalculator.getText().toString().equals("0") || show)) ? n : numCalculator.getText() + n);
                if (show) show = false;
            }
        });
        final Button B9 = findViewById(R.id.btn_9);
        B9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String n = "9";
                numCalculator.setText((numCalculator.getText().toString().length() > 0 && (numCalculator.getText().toString().equals("0") || show)) ? n : numCalculator.getText() + n);
                if (show) show = false;
            }
        });
        final Button B0 = findViewById(R.id.btn_0);
        B0.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String n = "0";
                if(!numCalculator.getText().toString().equals("0.0")){
                    numCalculator.setText((numCalculator.getText().toString().length() > 0 && (numCalculator.getText().toString().equals("0") || show)) ? n : numCalculator.getText() + n);
                    if (show) show = false;
                }
            }
        });
        final Button BP = findViewById(R.id.btn_point);
        BP.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String n = ".";
                if(numCalculator.getText().toString().indexOf('.') == -1){
                    numCalculator.setText((numCalculator.length() > 0) ? numCalculator.getText().toString() + n : numCalculator.getText().toString());
                }
            }
        });
        final Button BS = findViewById(R.id.btn_sum);
        BS.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String s = "+";
                if((!numCalculator.getText().toString().equals("0")  || !numCalculator.getText().toString().equals("0.0")) && (txt_numberCalculatorView.getText().toString().length() > 0 || (numCalculator.getText().toString().length() > 0 && txt_numberCalculatorView.getText().toString().length() == 0))){
                    txt_numberCalculatorView.setText(numCalculator.getText().toString() + " " + s);
                    if (show) numCalculator.setText("");
                    number = c.suma(number, ((numCalculator.getText().toString().length() > 0) ? Integer.parseInt(numCalculator.getText().toString()) : 0));
                    numCalculator.setText("" + number);
                    show = true;
                }
            }
        });
        final Button BSB = findViewById(R.id.btn_subtraction);
        BSB.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String s = "-";
                if((!numCalculator.getText().toString().equals("0")  || !numCalculator.getText().toString().equals("0.0")) && numCalculator.getText().toString().length() > 0){
                    if (show) numCalculator.setText("");
                    number = c.resta(number, ((numCalculator.getText().toString().length() > 0) ? Integer.parseInt(numCalculator.getText().toString()) : 0));
                    if (txt_numberCalculatorView.getText().toString().length() == 0) number = Math.abs(number);
                    String aux = numCalculator.getText().toString();
                    numCalculator.setText("" + number);
                    txt_numberCalculatorView.setText(numCalculator.getText().toString() + " " + s);
                    show = true;
                }
            }
        });

        final Button BM = findViewById(R.id.btn_multiplication);
        BM.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String s = "x";
                if((!numCalculator.getText().toString().equals("0")  || !numCalculator.getText().toString().equals("0.0")) && numCalculator.getText().toString().length() > 0){
                    if (show) numCalculator.setText("");

                    number = c.multi(((number != 0) ? number : 1), ((numCalculator.getText().toString().length() > 0) ? Integer.parseInt(numCalculator.getText().toString()) : 0));
                    if (txt_numberCalculatorView.getText().toString().length() == 0) number = Math.abs(number);
                    String aux = numCalculator.getText().toString();
                    numCalculator.setText("" + number);
                    txt_numberCalculatorView.setText(numCalculator.getText().toString() + " " + s);
                    show = true;
                }
            }
        });

        final Button BD = findViewById(R.id.btn_division);
        BD.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String s = "÷";
                if((!numCalculator.getText().toString().equals("0")  || !numCalculator.getText().toString().equals("0.0")) && numCalculator.getText().toString().length() > 0){
                    if (show) numCalculator.setText("");
                    number = c.division(((number != 0) ? number : 1), ((numCalculator.getText().toString().length() > 0) ? Integer.parseInt(numCalculator.getText().toString()) : 0));
                    if (txt_numberCalculatorView.getText().toString().length() == 0) number = Math.abs(number);
                    String aux = numCalculator.getText().toString();
                    numCalculator.setText("" + number);
                    txt_numberCalculatorView.setText(numCalculator.getText().toString() + " " + s);
                    show = true;
                }
            }
        });


    }
}