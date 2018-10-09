package com.utad.helloworld;

import android.arch.lifecycle.Observer;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.autofill.AutofillValue;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;

import java.util.Date;

import static android.view.View.AUTOFILL_TYPE_DATE;

public class HomeActivity extends AppCompatActivity {
    public static  final String KEY_USER_NAME = "KEY_USER_NAME";
    @BindView(R.id.editTextPass)EditText et_password;
    @BindView(R.id.editTextEmail) EditText et_user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);




    }
    public void onCheckboxClicked(View view) {
        Toast toast = new Toast(this);
        toast.setGravity(5,6,6);
        toast.makeText(this, "funciona", Toast.LENGTH_SHORT).show();

    }
    public void onLoginAction(View view) {
       Toast toast = new Toast(this);
        toast.setGravity(5,6,6);


            toast.makeText(this, "logged", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(HomeActivity.this, FormActivity.class);
            intent.putExtra(KEY_USER_NAME, et_user.getText().toString());
            startActivity(intent);


    }
}
