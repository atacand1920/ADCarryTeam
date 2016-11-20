package com.androidbelieve.drawerwithswipetabs;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import custom_font.MyTextView;


public class Login extends AppCompatActivity {
    TextView zoo;
    MyTextView create;
    MyTextView login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Typeface custom_fonts = Typeface.createFromAsset(getAssets(), "fonts/Swistblnk Duwhoers Brush.ttf");
        zoo = (TextView)findViewById(R.id.zoo);
        zoo.setTypeface(custom_fonts);
        login = (MyTextView) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view) {
                Intent it = new Intent(Login.this,MainActivity.class);
                startActivity(it);


            }
        });


        create = (MyTextView)findViewById(R.id.create);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Login.this,SignUp.class);
                startActivity(it);

            }
        });
    }
}
