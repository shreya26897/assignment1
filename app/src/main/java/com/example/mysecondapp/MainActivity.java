package com.example.mysecondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


 private EditText mfield1;
 private EditText mfield2;
 private TextView mfield3;
 private Button mfield4;
 private Button mfield5;
 private int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mfield1= findViewById(R.id.field1);
        mfield2=findViewById(R.id.field2);
        mfield4=findViewById(R.id.button1);
        mfield5=findViewById(R.id.button2);
        mfield3=findViewById(R.id.resultshow);


    }
    public void onCalculate(View view)
    {
        int i,j;
        double k;
        i= Integer.parseInt( mfield1.getText().toString());//getText returns an object which is converted to a string
        j=Integer.parseInt(mfield2.getText().toString());
        if(count%4==0)
            k=i+j;
        else if(count%4==1)
            k=i-j;
        else if(count%4==2)
            k=i*j;
        else{
            if(j!=0)
            {
                k=(double)i/j;}
            else
            {mfield3.setText("/ by 0");
                return;}
        }
        mfield3.setText(Double.toString(k));
    }
    public void onMode(View view)
    {
        int i,j;
        count+=1;
        if(count%4==0)
        {
            mfield4.setText("Mode Addition");

        }
        else if(count%4==1)
        {
            mfield4.setText("Mode Subtraction");
        }
        else if(count%4==2)
        {
            mfield4.setText("Mode Multiplication");
        }
        else {
            mfield4.setText("Mode Division"); }
    }
}