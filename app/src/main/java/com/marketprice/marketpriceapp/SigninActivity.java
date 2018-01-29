package com.marketprice.marketpriceapp;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.marketprice.marketpriceapp.Admin.HomeAdminActivity;
import com.marketprice.marketpriceapp.Sales.HomeSalesActivity;
import com.marketprice.marketpriceapp.domain.Account;

import java.util.ArrayList;
import java.util.List;

public class SigninActivity extends AppCompatActivity {

    List<Account> accounts = new ArrayList<>();
    ImageView sback;
    EditText usernm, pass;
    TextView singin;
    int idacc = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        makeadmin();
        makesales();
        adduser();
        setContentView(R.layout.activity_signin);

        sback = (ImageView) findViewById(R.id.sinb);
        singin = (TextView) findViewById(R.id.signin);
        usernm = (EditText) findViewById(R.id.usrusr);
        pass = (EditText) findViewById(R.id.pswrd);
        singin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (usernm.getText().toString().isEmpty() || pass.getText().toString().isEmpty()) {
                    Snackbar.make(v, "Silahkan isi terlebih dahulu", 2000).show();
                } else if (login(usernm.getText().toString(), pass.getText().toString()).equalsIgnoreCase("kosong")) {
                    Toast.makeText(SigninActivity.this, "Username tersebut tidak ada", Toast.LENGTH_SHORT).show();
                } else if (login(usernm.getText().toString(), pass.getText().toString()).equalsIgnoreCase("salah")) {
                    Toast.makeText(SigninActivity.this, "Password salah", Toast.LENGTH_SHORT).show();
                } else if (login(usernm.getText().toString(), pass.getText().toString()).equalsIgnoreCase("admin")) {
                    Intent i = new Intent(SigninActivity.this, HomeAdminActivity.class);
                    startActivity(i);
                    finish();
                } else if (login(usernm.getText().toString(), pass.getText().toString()).equalsIgnoreCase("sales")) {
                    Intent i = new Intent(SigninActivity.this, HomeSalesActivity.class);
                    startActivity(i);
                    finish();
                } else if (login(usernm.getText().toString(), pass.getText().toString()).equalsIgnoreCase("User")) {
                    Intent i = new Intent(SigninActivity.this, MenuActivity.class);
                    startActivity(i);
                    finish();
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

    private void makeadmin() {
        if (idacc == 0) {
            idacc = 1;
        }
        Account newacc = new Account();
        newacc.setId_acc(Long.valueOf(idacc));
        newacc.setEmail("admin@admin.com");
        newacc.setUsername("admin");
        newacc.setPassword("1111");
        newacc.setRole("admin");
        fillDataUser(newacc);
        idacc++;
    }

    private void makesales() {
        if (idacc == 0) {
            idacc = 1;
        }
        Account newacc = new Account();
        newacc.setId_acc(Long.valueOf(idacc));
        newacc.setEmail("sales@admin.com");
        newacc.setUsername("sales");
        newacc.setPassword("1234");
        newacc.setRole("sales");
        fillDataUser(newacc);
        idacc++;
    }

    private void adduser() {
        Bundle extras = getIntent().getExtras();
        if (idacc == 0) {
            idacc = 1;
        }
        if (extras == null) {
            Log.v("datakosong", "Data tidak ada");
        } else {
            Account newacc = new Account();
            newacc.setId_acc(Long.valueOf(idacc));
            newacc.setEmail(extras.getString("email"));
            newacc.setUsername(extras.getString("username"));
            newacc.setPassword(extras.getString("password"));
            newacc.setRole(extras.getString("role"));
            fillDataUser(newacc);
            idacc++;
        }
    }

    private void fillDataUser(Account account) {
        accounts.add(account);
    }

    private String login(String username, String password) {
        String role;
        Long getId = iduser(username);
        if (getId == null) {
            role = "kosong";
        } else {
            if (password.equalsIgnoreCase(getPassword(getId))) {
                role = getRole(getId);
            } else {
                role = "salah";
            }
        }
        return role;
    }

    private Long iduser(String username) {
        Long id = null;
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getUsername().equalsIgnoreCase(username)) {
                id = accounts.get(i).getId_acc();
                break;
            } else {
                id = null;
            }
        }
        return id;
    }

    private String getPassword(Long id) {
        String password = null;
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getId_acc() == id) {
                password = accounts.get(i).getPassword();
            }
        }
        return password;
    }

    private String getRole(Long id) {
        String role = null;
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getId_acc() == id) {
                role = accounts.get(i).getRole();
            }
        }
        return role;
    }

}
