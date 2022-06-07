package com.example.schoolerp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    EditText accountEditText;
    EditText passwordEditText;
    AppCompatButton loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        accountEditText = findViewById(R.id.et_login_account);
        passwordEditText = findViewById(R.id.et_login_password);
        loginButton = findViewById(R.id.button_sign_in);

        loginButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button_sign_in) {
            String account = accountEditText.getText().toString();
            String password = passwordEditText.getText().toString();
            if (verifyAccount(account,password)) {
                startActivity(new Intent(this, DashboardActivity.class));
            }

        }
    }

    private boolean verifyAccount(String account, String password) {
        return account.equals("admin") && password.equals("admin");
    }
}