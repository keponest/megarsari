package com.marketprice.marketpriceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.marketprice.marketpriceapp.domain.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignupActivity extends AppCompatActivity {

    List<Account> accounts = new ArrayList<>();
    Account data = new Account();
    ImageView sback;
    EditText username;
    EditText password;
    EditText namalengkap;
    EditText email;
    TextView register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        register = (TextView) findViewById(R.id.register);
        sback = (ImageView) findViewById(R.id.sback);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        email = (EditText) findViewById(R.id.email);

        sback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(SignupActivity.this, LoginActivity.class);
                startActivity(it);
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SignupActivity.this, SigninActivity.class);
                if(createAccount()==true)
                {
                    i.putExtra("username", data.getUsername());
                    i.putExtra("password", data.getPassword());
                    i.putExtra("email", data.getEmail());
                    i.putExtra("role", data.getRole());
                    Toast.makeText(SignupActivity.this, "Identitas anda berhasil dibuat!", Toast.LENGTH_SHORT).show();
                    startActivity(i);
                    SignupActivity.this.finish();
                }
                else {
                    //Toast.makeText(SignupActivity.this, "Cek kembali data yang anda masukkan", Toast.LENGTH_SHORT).show();
                    Log.v("Gagal","Balikan create False");
                }
            }
        });
    }

    private boolean createAccount() {
        boolean correctformat = false;
        data.setId_acc(Long.valueOf(1));
        data.setUsername(username.getText().toString());
        data.setPassword(password.getText().toString());
        data.setEmail(email.getText().toString());
        data.setRole("User");
        data.setToken("");

        if (username.getText().toString().isEmpty() == true) {
            Toast.makeText(this, "Username tidak boleh kosong", Toast.LENGTH_SHORT).show();
        } else if (password.getText().toString().isEmpty() == true) {
            Toast.makeText(this, "Password tidak boleh kosong", Toast.LENGTH_SHORT).show();
        } else if (password.getText().length() < 4) {
            Toast.makeText(this, "Password minimal 4 huruf/angka", Toast.LENGTH_SHORT).show();
        } else if (isEmailValid(email.getText().toString()) == false) {
            Toast.makeText(this, "Format email salah", Toast.LENGTH_SHORT).show();
        } else {
            accounts.add(data);
            correctformat = true;
        }
        return correctformat;
    }

    public static boolean isEmailValid(String email) {
        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }


}
