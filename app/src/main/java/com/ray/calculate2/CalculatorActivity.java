package com.ray.calculate2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {


    private TextView number;
    int num=0 ;
    int temp;
    float current;
    private int oper;
    private int count;
    private TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        Intent intent = getIntent();
        String getname = intent.getStringExtra("GET_Name");
        name = findViewById(R.id.get_text);
        name.setText("Welcome  "+""+getname+"!!!");
        number = findViewById(R.id.textView_number);
        oper = 0;
    }

    public void plus(View view){
        if (number.getText().toString().length()>0){
            count=0;
            oper=1;
            current = Float.parseFloat(number.getText().toString());
        }
    }

    public void subtract(View view){
        if (number.getText().toString().length()>0){
            count=0;
            oper=2;
            current = Float.parseFloat((number.getText().toString()));
        }
    }

    public  void multiply(View view){
        if (number.getText().toString().length()>0){
            count=0;
            oper=3;
            current = Float.parseFloat((number.getText().toString()));
        }
    }

    public void div(View view){
        if (number.getText().toString().length()>0){
            count=0;
            oper=4;
            current = Float.parseFloat((number.getText().toString()));
        }
    }


    public void factorial(View view){
        if (number.getText().toString().length()>0){
            current = Float.parseFloat(number.getText().toString());
            if (current<0){
                number.setText("Error");
            }else{
                int result = 1;
                for(int i = 1;i<=current;i++){
                    result*=i;
                }
                number.setText(""+result);
            }

        }
    }

    public void one(View view){
        num = 1;
        calcutate();
    }

    public void two(View view){
        num = 2;
        calcutate();
    }

    public void three(View view){
        num = 3;
        calcutate();
    }

    public void four(View view){
        num = 4;
        calcutate();
    }

    public void five(View view){
        num = 5;
        calcutate();
    }

    public void six(View view){
        num = 6;
        calcutate();
    }
    public void seven(View view){
        num = 7;
        calcutate();
    }

    public void eight(View view){
        num = 8;
        calcutate();
    }

    public void nine(View view){
        num = 9;
        calcutate();
    }

    public void zero(View view){
        num = 0;
        calcutate();
    }

    public void calcutate(){
        if (count==0){
            number.setText(""+num);
            count++;
        }else if(count!=0){
            number.setText(number.getText()+""+num);
        }
        temp = Integer.parseInt(number.getText().toString());
    }


    public void equal(View view){
        switch (oper){
            case 0:
                current= Float.parseFloat((number.getText().toString()));
                number.setText(""+current);
                break;
            case 1:
                float result = temp + current;
                oper = 0;
                number.setText("" + result);
                break;
            case 2:
                float result1 = current - temp;
                oper=0;
                number.setText(""+result1);
                break;
            case 3:
                float result2 = current*temp;
                oper=0;
                number.setText(""+result2);
                break;
            case 4:
                float result3 = current/temp;
                oper=0;
                number.setText(""+result3);
                break;
        }
    }

    public  void  reset(View view){
        number.setText("0");
        temp =0;
        current = 0;
        oper = 0;
        count=0;
    }
}
