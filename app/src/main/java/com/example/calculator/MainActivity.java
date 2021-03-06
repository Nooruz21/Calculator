package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvResult;
    private Integer first,second;
    private Boolean isOperationClick;
    private  String operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult = findViewById(R.id.tv_result);
    }

    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.bnt_one:
                if (tvResult.getText().toString().equals(0)){
                    tvResult.setText("1");
                }else  if (isOperationClick){
                    tvResult.setText("1");
                } else {
                    tvResult.append("1");
                }
                isOperationClick = false;
                break;
            case R.id.btn_two:
                if (tvResult.getText().toString().equals(0)){
                    tvResult.setText("2");
                }else if(isOperationClick) {
                    tvResult.setText("2");
                }else {
                    tvResult.append("2");
                }
                isOperationClick = false;
                break;
            case R.id.btn_three:
                if (tvResult.getText().toString().equals(0)){
                    tvResult.setText("3");
                }else if(isOperationClick) {
                    tvResult.setText("3");
                }else {
                    tvResult.append("3");
                }
                isOperationClick = false;
                break;
            case R.id.btn_four:
                if (tvResult.getText().toString().equals(0)){
                    tvResult.setText("4");
                }else if(isOperationClick) {
                    tvResult.setText("4");
                }else {
                    tvResult.append("4");
                }
                isOperationClick = false;
                break;
            case R.id.btn_five:
                if (tvResult.getText().toString().equals(0)){
                    tvResult.setText("5");
                }else if(isOperationClick) {
                    tvResult.setText("5");
                }else {
                    tvResult.append("5");
                }
                isOperationClick = false;
                break;
            case R.id.btn_six:
                if (tvResult.getText().toString().equals(0)){
                    tvResult.setText("6");
                }else if(isOperationClick) {
                    tvResult.setText("6");
                }else {
                    tvResult.append("6");
                }
                isOperationClick = false;
                break;
            case R.id.btn_seven:
                if (tvResult.getText().toString().equals(0)){
                    tvResult.setText("7");
                }else if(isOperationClick) {
                    tvResult.setText("7");
                }else {
                    tvResult.append("7");
                }
                isOperationClick = false;
                break;
            case R.id.btn_eight:
                if (tvResult.getText().toString().equals(0)){
                    tvResult.setText("8");
                }else if(isOperationClick) {
                    tvResult.setText("8");
                }else {
                    tvResult.append("8");
                }
                isOperationClick = false;
                break;
            case R.id.btn_nine:
                if (tvResult.getText().toString().equals(0)){
                    tvResult.setText("9");
                }else if(isOperationClick) {
                    tvResult.setText("9");
                }else {
                    tvResult.append("9");
                }
                isOperationClick = false;
                break;
            case R.id.btn_null:
                if (tvResult.getText().toString().equals(0)){
                    tvResult.setText("0");
                }else if(isOperationClick) {
                    tvResult.setText("0");
                }else {
                    tvResult.append("0");
                }
                isOperationClick = false;
                break;
            case R.id.btn_clear:
                tvResult.setText("0");
                first=0;
                second =0;
                break;
            case R.id.btn_double:
               tvResult.setText(".");
                tvResult.setText(R.id.tv_result + ".");
                break;
        }
    }

    public void onOperationClick(View view) {
        switch (view.getId()){
            case R.id.btn_plus:
                first=Integer.parseInt(tvResult.getText().toString());
                isOperationClick = true;
                operation="+";

                break;
            case R.id.btn_equals:
                second=Integer.parseInt(tvResult.getText().toString());
                Integer result = first+ second;
                tvResult.setText(result.toString());
                isOperationClick=true;
                operation="=";
                break;
            case R.id.btn_percent:
                result = (first / 100);
                tvResult.setText(result.toString());
                isOperationClick=true;
                operation="%";
                break;
            case R.id.btn_multiplication:
                result = first*second;
                tvResult.setText(result.toString());
                isOperationClick=true;
                operation="x";
                break;
            case R.id.btn_division:
                result=first/second;
                tvResult.setText(result.toString());
                isOperationClick=true;
                operation="??";
                break;
            case R.id.btn_minus:
                result = first-second;
                tvResult.setText(result.toString());
                isOperationClick=true;
                operation="-";
                break;
        }
    }
}