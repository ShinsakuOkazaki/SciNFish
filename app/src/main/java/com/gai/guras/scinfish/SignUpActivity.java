package com.gai.guras.scinfish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {
    private EditText usernameInput;
    private Button submitButton;
    private EditText passwordInput;
    private EditText password2Input;
    private Spinner securityQ1Selection;
    private Spinner securityQ2Selection;
    private ArrayAdapter<CharSequence> adapter ;
    private EditText answer1Input;
    private EditText answer2Input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        usernameInput = findViewById(R.id.usernameInput);
        submitButton = findViewById(R.id.buttonSubmit);
        passwordInput = findViewById(R.id.passwordInput);
        password2Input = findViewById(R.id.password2Input);
        securityQ1Selection = findViewById(R.id.securityQ1Selection);
        securityQ2Selection = findViewById(R.id.securityQ2Selection);
        adapter = ArrayAdapter.createFromResource(this,
                R.array.security_question, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        securityQ1Selection.setAdapter(adapter);
        securityQ2Selection.setAdapter(adapter);
        answer1Input = findViewById(R.id.answer1Input);
        answer2Input = findViewById(R.id.answer2Input);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String username=usernameInput.getText().toString();
               String password=passwordInput.getText().toString();
               Toast.makeText(getApplicationContext(),"Username entered is: "+ username,Toast.LENGTH_LONG).show();
               Toast.makeText(getApplicationContext(),"Username entered is: "+ password,Toast.LENGTH_LONG).show();
            }
        });

    }
}
