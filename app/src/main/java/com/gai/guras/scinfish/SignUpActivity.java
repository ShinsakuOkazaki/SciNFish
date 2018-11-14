package com.gai.guras.scinfish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {
    private EditText usernameInput;
    private Button submitButton;
    private EditText passwordInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        usernameInput=findViewById(R.id.usernameInput);
        submitButton=findViewById(R.id.buttonSubmit);
        passwordInput = findViewById(R.id.passwordInput);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String username=usernameInput.getText().toString();
               String password=passwordInput.getText().toString();
               Toast.makeText(getApplicationContext(),"Username entered is: "+username,Toast.LENGTH_LONG).show();
            }
        });

    }
}
