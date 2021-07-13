package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText name,age;
    TextView set_name;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.edit_name);
        age=findViewById(R.id.edit_age);
        btn=findViewById(R.id.btn_submit);
        set_name=findViewById(R.id.text_name);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str_name=name.getText().toString();
                set_name.setText(str_name);
            }
        });
    }
}