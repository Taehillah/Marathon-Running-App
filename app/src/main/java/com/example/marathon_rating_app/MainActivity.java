package com.example.marathon_rating_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);

            button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            openActivity_main2();
        }
    });
    }

    public void openActivity_main2(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

}