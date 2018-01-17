package com.marketprice.marketpriceapp;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class SigninActivity extends AppCompatActivity {

    ImageView sback;
    EditText usernm,pass;
    TextView singin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        sback = (ImageView) findViewById(R.id.sinb);
        singin = (TextView)findViewById(R.id.signin);
        usernm = (EditText)findViewById(R.id.usrusr);
        pass = (EditText)findViewById(R.id.pswrd);
        singin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(usernm.getText().toString().isEmpty() || pass.getText().toString().isEmpty())
                {
                    Snackbar.make(v,"Silahkan isi terlebih dahulu",2000).show();
                }
                else if(usernm.getText().toString().equalsIgnoreCase("admin") &&
                        pass.getText().toString().equalsIgnoreCase("1234"))
                {
                    Intent i = new Intent(getApplicationContext(), HomeAdminActivity.class);
                    startActivity(i);
                    finish();
                }
                else if(usernm.getText().toString().equalsIgnoreCase("sales") &&
                        pass.getText().toString().equalsIgnoreCase("1234"))
                {
                    Intent i = new Intent(getApplicationContext(), HomeSalesActivity.class);
                    startActivity(i);
                    finish();
                }
                else
                {
                    Snackbar.make(v,"Username atau Password salah",2000).show();
                }

            }
        });

        sback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SigninActivity.this, LoginActivity.class);
                startActivity(i);
            }
        });
    }
}
