package com.bignerdranch.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText mEditTextNumber1,mEditTextNumber2;
    Button mButtonAdd,mButtonSub,mButtonMul,mButtonDiv;
    TextView mTextViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditTextNumber1 = findViewById(R.id.EditNumber1);
        mEditTextNumber2 = findViewById(R.id.EditNumber2);
        mButtonAdd = findViewById(R.id.add);
        mButtonSub= findViewById(R.id.sub);
        mButtonMul = findViewById(R.id.mul);
        mButtonDiv = findViewById(R.id.div);
        mTextViewResult = findViewById(R.id.textViewResult);

        // add button listener
        mButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1,num2,res;
                num1 = Integer.parseInt(mEditTextNumber1.getText().toString());
                num2 = Integer.parseInt(mEditTextNumber2.getText().toString());
                res = num1 + num2 ;
                mTextViewResult.setText("Result "+res);
            }
        });

        mButtonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1,num2,res;
                num1 = Integer.parseInt(mEditTextNumber1.getText().toString());
                num2 = Integer.parseInt(mEditTextNumber2.getText().toString());
                res = num1 - num2 ;
                mTextViewResult.setText("Result "+res);
            }
        });

        mButtonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1,num2,res;
                num1 = Integer.parseInt(mEditTextNumber1.getText().toString());
                num2 = Integer.parseInt(mEditTextNumber2.getText().toString());
                res = num1 * num2 ;
                mTextViewResult.setText("Result "+res);
            }
        });

        mButtonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1,num2,res;
                num1 = Integer.parseInt(mEditTextNumber1.getText().toString());
                num2 = Integer.parseInt(mEditTextNumber2.getText().toString());
                res = num1 / num2 ;
                mTextViewResult.setText("Result "+res);
            }
        });
    }

}