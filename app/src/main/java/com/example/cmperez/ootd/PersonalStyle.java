package com.example.cmperez.ootd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class PersonalStyle extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personalstyle);


        CheckBox casual = (CheckBox) findViewById(R.id.casual);
        casual.setOnClickListener(onClickListener);

        CheckBox comfy = (CheckBox)findViewById(R.id.comfylazy);
        comfy.setOnClickListener(onClickListener);

        CheckBox professional = (CheckBox)findViewById(R.id.professional);
        professional.setOnClickListener(onClickListener);

        CheckBox elegant = (CheckBox)findViewById(R.id.elegantclassy);
        elegant.setOnClickListener(onClickListener);



}
    public View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.casual:
                    CheckBox casual = (CheckBox)findViewById(R.id.casual);
                    break;
                case R.id.comfylazy:
                    CheckBox comfy = (CheckBox)findViewById(R.id.comfylazy);
                    break;
                case R.id.professional:
                    CheckBox professional = (CheckBox)findViewById(R.id.professional);
                    break;
                case R.id.elegantclassy:
                    CheckBox elegant = (CheckBox)findViewById(R.id.elegantclassy);
                    break;
            }
        }
    };

    }

