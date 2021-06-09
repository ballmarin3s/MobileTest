package com.example.random;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txtRandom;
    Button btnRandom;
    EditText edt1;
    EditText edt2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();



        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chuoi1 = edt1.getText().toString();
                String chuoi2 = edt2.getText().toString();

                if (chuoi1.isEmpty() || chuoi2.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Mời nhập số!",Toast.LENGTH_SHORT).show();
                } else {
                    int min = Integer.parseInt(chuoi1);
                    int max = Integer.parseInt(chuoi2);

                    if (min > max){
                        Toast.makeText(MainActivity.this, " Số bé phải bé hơn số lớn!", Toast.LENGTH_SHORT).show();
                    } else {
                        Random random = new Random();
                        int number = random.nextInt(max - min + 1) + min;
                        txtRandom.setText(String.valueOf(number)); // number + ""
                    }
                }
            }
        });
    }

    private void AnhXa()
    {
        txtRandom = (TextView)findViewById(R.id.Random);
        btnRandom = (Button)findViewById(R.id.buttonRandom);
        edt1 = (EditText)findViewById(R.id.editText1);
        edt2 = (EditText)findViewById(R.id.editText2);
    }
}