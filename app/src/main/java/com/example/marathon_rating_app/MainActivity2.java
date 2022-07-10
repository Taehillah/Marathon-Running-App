package com.example.marathon_rating_app;
//43385508
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

public static final String Hora = "Hora";
public static final String Motsotso = "Motsotso";

    private EditText val1;
    private EditText val2;
    private Button button;
    private String hr;
    private int min;
    private int defaultValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Second Activity");

        Intent intent = getIntent();
        String simplestDiHours = intent.getStringExtra("SIMPLESTDIHOURS");
        String simplestDiMinutes = intent.getStringExtra("SIMPLESTDIMINUTES");

//textview fill
        TextView simplestResult1 = findViewById(R.id.hours);
        TextView simplestResult2 = findViewById(R.id.minutes);

        simplestResult1.setText("Name "+simplestDiHours);

    }
}