package com.ray.calculate2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.go);
        name = findViewById(R.id.name);

    }

    public void Go(View view){
        Intent intent = new Intent(this,CalculatorActivity.class);
        intent.putExtra("GET_Name",name.getText().toString());
        startActivity(intent);
    }
}