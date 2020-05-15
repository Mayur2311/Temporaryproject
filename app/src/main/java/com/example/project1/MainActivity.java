package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv;
    EditText et;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.text1);
        et = findViewById(R.id.et1);
        btn = findViewById(R.id.btn1);

        btn.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.btn1:
                String input = et.getText().toString();
            tv.setText(input);
            break;
        }
    }
}
