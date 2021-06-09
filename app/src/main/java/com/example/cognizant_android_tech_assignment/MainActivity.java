package com.example.cognizant_android_tech_assignment;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.material.textfield.TextInputEditText;


public class MainActivity extends AppCompatActivity {
    Button loginBtn;
    TextInputEditText usernameField;
    EditText passwordField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        loginBtn = findViewById(R.id.login_button);
        usernameField = findViewById(R.id.username_field);
        passwordField = findViewById(R.id.password_field);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onLogin();
            }
        });
    }


    private void onLogin() {
        if (validate()) {
            onLoginSuccess();
            startActivity(new Intent(MainActivity.this, HomeActivity.class));
        }
        else {
            onLoginFailed();
        }
    }

    private boolean validate() {
        boolean isValidated = true;

        String username = usernameField.getText().toString();
        String password = passwordField.getText().toString();

        if (username.isEmpty()) {
            usernameField.setError("Username cannot be empty");
            isValidated = false;
        }
        else {
            usernameField.setError(null);
        }

        if (password.isEmpty()) {
            passwordField.setError("Password cannot be empty");
            isValidated = false;
        }
        else {
            passwordField.setError(null);
        }

        return isValidated;
    }

    private void onLoginFailed() {
        Toast.makeText(getBaseContext(), "Login failed", Toast.LENGTH_LONG).show();
    }

    private void onLoginSuccess() {
        Toast.makeText(getBaseContext(), "Login successful", Toast.LENGTH_LONG).show();
    }
}