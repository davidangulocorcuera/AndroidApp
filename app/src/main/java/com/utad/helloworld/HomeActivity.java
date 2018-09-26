package com.utad.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class HomeActivity extends AppCompatActivity {
    private EditText m_et_email;
    private EditText m_et_password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        m_et_email = findViewById(R.id.editTextEmail);
        m_et_password = findViewById(R.id.editTextPass);
        String email = m_et_email.getText().toString();
        String password = m_et_password.getText().toString();
    }
}
