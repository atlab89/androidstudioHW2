package com.example.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.*;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText name= findViewById(R.id.name);
        EditText address= findViewById(R.id.address);
        EditText phone= findViewById(R.id.phone);
        Button button= findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = name.getText().toString();
                String info2 = address.getText().toString();
                String info3 = phone.getText().toString();
                Toast.makeText(MainActivity.this,info+" "+info2+" "+info3,Toast.LENGTH_SHORT).show();
            }
        });
    }
}