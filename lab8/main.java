package com.example.dailing; 
import androidx.appcompat.app.AppCompatActivity; 
import android.content.Intent; 
import android.net.Uri; 
import android.os.Bundle; 
import android.provider.ContactsContract; 
import android.view.View; 
import android.widget.Button; 
import android.widget.EditText; 
public class MainActivity extends AppCompatActivity { 
 Button b2,b3; 
 Button ba1,ba2,ba3,ba4,ba5,ba6,ba7,ba8,ba9; 
 EditText e1; 
 @Override 
 protected void onCreate(Bundle savedInstanceState) { 
 super.onCreate(savedInstanceState); 
 setContentView(R.layout.activity_main); 
 b2 = (Button) findViewById(R.id.bt2); 
 b3 = (Button) findViewById(R.id.bt3); 
 ba1 = (Button) findViewById(R.id.b1a); 
 ba2 = (Button) findViewById(R.id.b2a); 
 ba3 = (Button) findViewById(R.id.b3a); 
 ba4 = (Button) findViewById(R.id.b4a); 
 ba5 = (Button) findViewById(R.id.b5a); 
 ba6 = (Button) findViewById(R.id.b6a); 
 ba7 = (Button) findViewById(R.id.b7a); 
 ba8 = (Button) findViewById(R.id.b8a); 
 ba9 = (Button) findViewById(R.id.b9a); 
 e1 = (EditText) findViewById(R.id.ed1); 
 ba1.setOnClickListener(new View.OnClickListener() { 
 @Override 
 public void onClick(View view) { 
 e1.setText(e1.getText()+"1"); 
 } 
 }); 
 ba2.setOnClickListener(new View.OnClickListener() { 
 @Override 
 public void onClick(View view) { 
 e1.setText(e1.getText()+"2"); 
 } 
 }); 
 ba3.setOnClickListener(new View.OnClickListener() { 
 @Override 
 public void onClick(View view) { 
 e1.setText(e1.getText()+"3"); 
 } 
 }); 
 ba4.setOnClickListener(new View.OnClickListener() { 
 @Override 
 public void onClick(View view) { 
 e1.setText(e1.getText()+"4"); 
 } 
 }); 
 ba5.setOnClickListener(new View.OnClickListener() { 
 @Override 
 public void onClick(View view) { 
 e1.setText(e1.getText()+"5"); 
 } 
 }); 
 ba6.setOnClickListener(new View.OnClickListener() { 
 @Override 
 public void onClick(View view) { 
 e1.setText(e1.getText()+"6"); 
 } 
 }); 
 ba7.setOnClickListener(new View.OnClickListener() { 
 @Override 
 public void onClick(View view) { 
 e1.setText(e1.getText()+"7"); 
 } 
 }); 
 ba8.setOnClickListener(new View.OnClickListener() { 
 @Override 
 public void onClick(View view) { 
 e1.setText(e1.getText()+"8"); 
 } 
 }); 
 ba9.setOnClickListener(new View.OnClickListener() { 
 @Override 
 public void onClick(View view) { 
 e1.setText(e1.getText()+"9"); 
 } 
 }); 
 b2.setOnClickListener(new View.OnClickListener() { 
 @Override 
 public void onClick(View view) { 
 Intent call_intent = new Intent(Intent.ACTION_DIAL); 
 call_intent.setData(Uri.parse("tel:"+e1.getText())); 
 startActivity(call_intent); 
 } 
 }); 
 b3.setOnClickListener(new View.OnClickListener() { 
 @Override 
 public void onClick(View view) { 
 Intent intent = new Intent(Intent.ACTION_INSERT); 
 intent.setType(ContactsContract.Contacts.CONTENT_TYPE); 
 intent.putExtra(ContactsContract.Intents.Insert.PHONE,e1.getText()); 
 startActivity(intent); 
 } 
 }); 
 } 
 public void entered_number(View v) 
 { 
 Button button = (Button) v; 
 String digit = button.getText().toString(); 
 String phone = e1.getText().toString(); 
 e1.setText(phone +digit); 
 } 
}