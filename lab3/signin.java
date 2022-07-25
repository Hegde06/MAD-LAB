package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signin extends AppCompatActivity {
    EditText usernamein, passwordin;
    Button submitin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        usernamein = findViewById(R.id.usernamein);
        passwordin = findViewById(R.id.passwordin);
        submitin = findViewById(R.id.submitin);
        Bundle bundle = getIntent().getExtras();
        String uname = bundle.getString("username");
        String pwd = bundle.getString("password");
        submitin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = usernamein.getText().toString();
                String pass = passwordin.getText().toString();
                if (user.equals(uname) && pass.equals(pwd)) {
                    Toast.makeText(signin.this, "success", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(signin.this, "failed", Toast.LENGTH_SHORT).show();
                }
            }

        });
    }
}