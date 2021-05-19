package com.example.dinhthanhnam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText ed_Name, ed_Email, ed_Review;
    Spinner spinner;
    Button btFeedback;
    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        ed_Name = findViewById(R.id.ed_Name);
        ed_Email = findViewById(R.id.ed_Email);
        ed_Review = findViewById(R.id.ed_Review);
        checkBox = findViewById(R.id.cb_1);
        btFeedback = findViewById(R.id.bt_feedback);
        btFeedback.setOnClickListener(this);

        String[] developers = {"Gripe", "Elon Musk", "Mark Zuckerberg"};
        spinner = findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, developers);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        if (ed_Name.getText().toString().isEmpty()){
            Toast.makeText(this, "Please enter name!", Toast.LENGTH_LONG).show();
            return;
        }
        if (ed_Email.getText().toString().isEmpty()){
            Toast.makeText(this, "Please enter mail!", Toast.LENGTH_LONG).show();
            return;
        }
        if (ed_Review.getText().toString().isEmpty()){
            Toast.makeText(this, "Please enter feedback!", Toast.LENGTH_LONG).show();
            return;
        }

    }
}