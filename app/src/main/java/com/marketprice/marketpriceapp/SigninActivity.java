package com.marketprice.marketpriceapp;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class SigninActivity extends AppCompatActivity {

    ImageView sback;
    EditText usernm,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        sback = (ImageView)findViewById(R.id.sinb);
        usernm = (EditText)findViewById(R.id.usrusr);
        pass = (EditText)findViewById(R.id.pswrd);
        sback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(usernm.toString().equalsIgnoreCase("") || pass.toString().equalsIgnoreCase(""))
                {
                    Snackbar.make(v,"Silahkan isi terlebih dahulu",2000).show();
                }
                else if(usernm.toString().equalsIgnoreCase("admin") || pass.toString().equalsIgnoreCase("1234"))
                {
                    Intent i = new Intent(getApplicationContext(), HomeAdminActivity.class);
                    startActivity(i);
                    finish();
                }
                else if(usernm.toString().equalsIgnoreCase("sales") || pass.toString().equalsIgnoreCase("1234"))
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
    }
}
