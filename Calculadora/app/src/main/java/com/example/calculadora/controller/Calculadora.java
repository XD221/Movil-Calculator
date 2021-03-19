package com.example.calculadora.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.calculadora.R;
import com.example.calculadora.model.CalculatorOperation;


public class Calculadora extends AppCompatActivity {

    private CalculatorOperation c = new CalculatorOperation();
    private Boolean show = false;
    private short sign = -1;



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
                c.clear();;
                sign = -1;
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
                    numCalculator.setText((numCalculator.length() > 0 && !show) ? numCalculator.getText().toString() + n : numCalculator.getText().toString());
                }
            }
        });
        final Button BS = findViewById(R.id.btn_sum);
        BS.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (show) {numCalculator.setText(""); show = false;}
                if (numCalculator.getText().toString().length() == 0) return;
                String s = "+";
                if((!numCalculator.getText().toString().equals("0")  || !numCalculator.getText().toString().equals("0.0")) && (txt_numberCalculatorView.getText().toString().length() > 0 || (numCalculator.getText().toString().length() > 0 && txt_numberCalculatorView.getText().toString().length() == 0))){
                    Double number = c.calculate(Double.parseDouble(numCalculator.getText().toString()), 's');
                    String[] aux = Double.toString(number).replace(".",",").split(",");
                    String aux2 = ((Long.parseLong(aux[1]) > 0) ? Double.toString(number) : (aux[0]));
                    numCalculator.setText("" + aux2);
                    txt_numberCalculatorView.setText(aux2 + " " + s);
                    sign = 0;
                    show = true;
                }
            }
        });
        final Button BSB = findViewById(R.id.btn_subtraction);
        BSB.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (show) {numCalculator.setText(""); show = false;}
                if (numCalculator.getText().toString().length() == 0) return;
                String s = "-";
                if((!numCalculator.getText().toString().equals("0")  || !numCalculator.getText().toString().equals("0.0")) && (txt_numberCalculatorView.getText().toString().length() > 0 || (numCalculator.getText().toString().length() > 0 && txt_numberCalculatorView.getText().toString().length() == 0))){
                    Double number = c.calculate(Double.parseDouble(numCalculator.getText().toString()), 'r');
                    String[] aux = Double.toString(number).replace(".",",").split(",");
                    String aux2 = ((Long.parseLong(aux[1]) > 0) ? Double.toString(number) : (aux[0]));
                    numCalculator.setText("" + aux2);
                    txt_numberCalculatorView.setText(aux2 + " " + s);
                    sign = 1;
                    show = true;
                }
            }
        });

        final Button BM = findViewById(R.id.btn_multiplication);
        BM.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (show) {numCalculator.setText(""); show = false;}
                if (numCalculator.getText().toString().length() == 0) return;
                String s = "x";
                if((!numCalculator.getText().toString().equals("0")  || !numCalculator.getText().toString().equals("0.0")) && (txt_numberCalculatorView.getText().toString().length() > 0 || (numCalculator.getText().toString().length() > 0 && txt_numberCalculatorView.getText().toString().length() == 0))){
                    Double number = c.calculate(Double.parseDouble(numCalculator.getText().toString()), 'm');
                    String[] aux = Double.toString(number).replace(".",",").split(",");
                    String aux2 = ((Long.parseLong(aux[1]) > 0) ? Double.toString(number) : (aux[0]));
                    numCalculator.setText("" + aux2);
                    txt_numberCalculatorView.setText(aux2 + " " + s);
                    sign = 2;
                    show = true;
                }
            }
        });

        final Button BD = findViewById(R.id.btn_division);
        BD.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (show) {numCalculator.setText(""); show = false;}
                if (numCalculator.getText().toString().length() == 0) return;
                String s = "÷";
                if((!numCalculator.getText().toString().equals("0")  || !numCalculator.getText().toString().equals("0.0")) && (txt_numberCalculatorView.getText().toString().length() > 0 || (numCalculator.getText().toString().length() > 0 && txt_numberCalculatorView.getText().toString().length() == 0))){
                    Double number = c.calculate(Double.parseDouble(numCalculator.getText().toString()), 'd');
                    String[] aux = Double.toString(number).replace(".",",").split(",");
                    String aux2 = ((Long.parseLong(aux[1]) > 0) ? Double.toString(number) : (aux[0]));
                    numCalculator.setText("" + aux2);
                    txt_numberCalculatorView.setText(aux2 + " " + s);
                    sign = 3;
                    show = true;
                }
            }
        });

        final Button BE = findViewById(R.id.btn_equal);
        BE.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                char[] symbols = new char[]{'+','-', 'x', '÷'};
                char a = (sign > -1) ? symbols[sign] : ' ';

                String aux = (numCalculator.getText().toString().length() > 0) ? numCalculator.getText().toString() : "0";
                if(a == symbols[0]){
                    Double number = c.calculate(Double.parseDouble(aux), 's');
                    String[] aux2 = Double.toString(number).replace(".",",").split(",");
                    String aux3 = ((Long.parseLong(aux2[1]) > 0) ? Double.toString(number) : (aux2[0]));
                    txt_numberCalculatorView.setText(aux3 + " " + a + " " + aux + " =");
                    numCalculator.setText(aux3);
                }else if(a == symbols[1]){
                    Double number = c.calculate(Double.parseDouble(aux), 'r');
                    String[] aux2 = Double.toString(number).replace(".",",").split(",");
                    String aux3 = ((Long.parseLong(aux2[1]) > 0) ? Double.toString(number) : (aux2[0]));
                    txt_numberCalculatorView.setText(aux3 + " " + a + " " + aux + " =");
                    numCalculator.setText(aux3);
                }else if(a == symbols[2]){
                    Double number = c.calculate(Double.parseDouble(aux), 'm');
                    String[] aux2 = Double.toString(number).replace(".",",").split(",");
                    String aux3 = ((Long.parseLong(aux2[1]) > 0) ? Double.toString(number) : (aux2[0]));
                    txt_numberCalculatorView.setText(aux3 + " " + a + " " + aux + " =");
                    numCalculator.setText(aux3);
                }else if(a == symbols[3]){
                    Double number = c.calculate(Double.parseDouble(aux), 'd');
                    String[] aux2 = Double.toString(number).replace(".",",").split(",");
                    String aux3 = ((Long.parseLong(aux2[1]) > 0) ? Double.toString(number) : (aux2[0]));
                    txt_numberCalculatorView.setText(aux3 + " " + a + " " + aux + " =");
                    numCalculator.setText(aux3);
                }else{
                    txt_numberCalculatorView.setText(aux + " =");
                    numCalculator.setText(aux);
                }
                show = true;
            }
        });

    }
}