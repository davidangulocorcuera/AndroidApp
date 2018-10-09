package com.utad.helloworld;

import android.arch.lifecycle.Observer;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;

import java.util.Date;

public class FormActivity extends AppCompatActivity {
    private DatePickerFragment datePickerFragment;
    @BindView(R.id.editText_name)  EditText m_et_name;
    @BindView(R.id.editText_firstSurname)  EditText m_et_firstUsername;
    @BindView(R.id.editText_SecondSurname)EditText m_et_secondUsername;
    @BindView(R.id.editText_phone) EditText m_et_phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        ButterKnife.bind(this);
        Intent intent= getIntent();
        if(intent != null){
            intent.getStringExtra(HomeActivity.KEY_USER_NAME);
            Toast toast = new Toast(this);
            toast.setGravity(5,6,6);
            toast.makeText(this, intent.getStringExtra(HomeActivity.KEY_USER_NAME),Toast.LENGTH_SHORT).show();
        }

        Spinner spinner = (Spinner) findViewById(R.id.planets_spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planets_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        datePickerFragment = new DatePickerFragment();
        datePickerFragment.selectedDate.observe(this, new Observer<Date>() {
            @Override
            public void onChanged(@Nullable Date date) {
                if(date != null){
                     Toast toast = new Toast(FormActivity.this);
                           toast.setGravity(5,6,6);
                            toast.makeText(FormActivity.this,date.toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });




    }
    public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }
    public void test(View view) {
        Toast toast = new Toast(this);
        toast.setGravity(5,6,6);
        toast.makeText(this,m_et_name.getText().toString(), Toast.LENGTH_SHORT).show();

    }
}
