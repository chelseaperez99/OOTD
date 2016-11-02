package com.example.cmperez.ootd;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class Something extends AppCompatActivity {

    private static String firstName;
    private static String lastName;
    private static String eMail;
    private static String userName;
    private static String passWord;
    private static boolean male = false, female = false;
    private static boolean location = false, sync = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.createlogin);

        Button button = (Button) findViewById(R.id.buttonNext);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Something.this, PersonalStyle.class);
                startActivity(i);
            }
        });

        final EditText lastname = (EditText) findViewById(R.id.lastname);
        lastname.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                lastName = lastname.getText().toString();
            }
        });
        final EditText firstname = (EditText) findViewById(R.id.firstname);
        firstname.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                firstName = firstname.getText().toString();
            }
        });
        final EditText email = (EditText) findViewById(R.id.email);
        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                eMail = email.getText().toString();
            }
        });
        final EditText username = (EditText) findViewById(R.id.username);
        username.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                userName = username.getText().toString();
            }
        });
        final EditText password = (EditText) findViewById(R.id.password);
        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                passWord = password.getText().toString();
            }
        });

        CheckBox checkbox_one = (CheckBox) findViewById(R.id.checkbox_one);
        checkbox_one.setOnClickListener(onClickListener);

        CheckBox checkbox_two = (CheckBox) findViewById(R.id.checkbox_two);
        checkbox_two.setOnClickListener(onClickListener);

        CheckBox checkbox_three = (CheckBox) findViewById(R.id.checkbox_check_three);
        checkbox_three.setOnClickListener(onClickListener);

        CheckBox checkbox_four = (CheckBox) findViewById(R.id.checkbox_check_four);
        checkbox_four.setOnClickListener(onClickListener);

    }

    public View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.checkbox_one:
                    CheckBox one = (CheckBox)findViewById(R.id.checkbox_one);

                    if(one.isChecked()){
                        female = true;
                    }else{
                        female = false;
                    }

                    break;
                case R.id.checkbox_two:
                    CheckBox two = (CheckBox)findViewById(R.id.checkbox_two);
                    if(two.isChecked()){
                        male = true;
                    }else{
                        male = false;
                    }
                    break;
                case R.id.checkbox_check_three:
                    CheckBox three = (CheckBox)findViewById(R.id.checkbox_check_three);
                    if (three.isChecked()) {
                        location = true;
                    }else{
                        location = false;
                    }
                    break;
                case R.id.checkbox_check_four:
                    CheckBox four = (CheckBox)findViewById(R.id.checkbox_check_four);
                    if (four.isChecked()){
                        sync = true;
                    }else{
                        sync = false;
                    }
                    break;
            }
        }
    };

    private void saveData(){
        SharedPreferences sharedPreferences = getSharedPreferences("Account", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString("lastname", lastName);
        editor.putString("firstname", firstName);
        editor.putString("email", eMail);
        editor.putString("username", userName);
        editor.putString("password", passWord);

        editor.putBoolean("male", male);
        editor.putBoolean("female", female);
        editor.putBoolean("location", location);
        editor.putBoolean("sync", sync);
        editor.apply();
    }
}