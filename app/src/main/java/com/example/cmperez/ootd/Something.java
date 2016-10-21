package com.example.cmperez.ootd;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Something extends AppCompatActivity {

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

            public void onCheckboxClicked(View view) {
                boolean checked = ((CheckBox) view).isChecked();

                switch (view.getId()) {
                    case R.id.checkbox_one:
                        if (checked) ;

                        else

                            break;

                    case R.id.checkbox_two:
                        if (checked) ;

                        else

                            break;

                    case R.id.checkbox_check_three:
                        if (checked) ;

                        else

                            break;

                    case R.id.checkbox_check_four:
                        if (checked) ;

                        else

                            break;
                }
            }
        });
    }
}