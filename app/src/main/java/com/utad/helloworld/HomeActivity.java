package com.utad.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    private EditText m_et_email;
    private EditText m_et_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        m_et_email = findViewById(R.id.editTextEmail);
        m_et_password = findViewById(R.id.editTextPass);
        String str_email = m_et_email.getText().toString();
        String str_password = m_et_password.getText().toString();



    }
    public void onCheckboxClicked(View view) {
        Toast toast = new Toast(this);
        toast.setGravity(5,6,6);
        Toast.makeText(this, "funciona", Toast.LENGTH_SHORT).show();

    }
    public void onLoginAction(View view) {
       Toast toast = new Toast(this);
        toast.setGravity(5,6,6);
        Toast.makeText(this, "funciona", Toast.LENGTH_SHORT).show();

    }
}
