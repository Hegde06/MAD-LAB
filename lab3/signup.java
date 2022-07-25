package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    EditText username, password;
    Button submit;
    //Minimum eight characters, at least one uppercase letter, one lowercase letter, one number and one special character:
    String regularExp = "^(?=.*[0-9])"
            +"(?=.*[a-z])(?=.*[A-Z])"
            +"(?=.*[@$!%*?&])"
            +"(?=\\S+$).{8,20}$";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.usernamein);
        password = findViewById(R.id.passwordin);
        submit = findViewById(R.id.submitin);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uname=username.getText().toString();
                String pwd=password.getText().toString();
                if(ValidatePassword(pwd)){
                    Intent intent = new Intent(MainActivity.this,signin.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("username",uname);
                    bundle.putString("password",pwd);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this,"Invalid password",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    public boolean ValidatePassword(String pwd){
        Pattern pattern = Pattern.compile(regularExp);
        Matcher matcher = pattern.matcher(pwd);
        return  matcher.matches();
    }
}