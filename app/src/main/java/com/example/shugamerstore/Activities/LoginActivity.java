package com.example.shugamerstore.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.shugamerstore.R;

public class LoginActivity extends AppCompatActivity {
    private EditText userEdit,passEdit;
    private Button loginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();
    }

    private void initView() {
        userEdit=findViewById(R.id.editTextText);
        passEdit=findViewById(R.id.editTextTextPassWord);
        loginBtn=findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(v -> {
            if (userEdit.getText().toString().isEmpty() || passEdit.getText().toString().isEmpty()) {
                Toast.makeText(LoginActivity.this,"please fill your user and password",Toast.LENGTH_SHORT).show();
            } else if (userEdit.getText().toString().equals("test") && passEdit.getText().toString().equals("test")) {
                startActivity(new Intent(LoginActivity.this,MainActivity.class));
            }else{
                Toast.makeText(LoginActivity.this,"your user and password is not correct",Toast.LENGTH_SHORT).show();
            }
        });
    }
}