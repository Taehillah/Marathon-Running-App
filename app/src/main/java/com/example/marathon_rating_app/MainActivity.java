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

public class MainActivity extends AppCompatActivity {
    /*
    private EditText val1, val2;
    private Button button;
    private String hr;
    private int min;*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*        val1 = findViewById(R.id.hours);
        val2 = findViewById(R.id.minutes);
        button = findViewById(R.id.button);
*/
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("First Activity");

        //EditText
        EditText diHours = findViewById(R.id.hours);
        EditText diMinutes = findViewById(R.id.minutes);
        //Button
        Button buttone = findViewById(R.id.button);

        //Button click listener
        buttone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //data from Edit texts
                String simplestDiHours = diHours.getText().toString();
                String simplestDiMinutes = diMinutes.getText().toString();

                //Intents to move data over
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("SIMPLESTDIHOURS",simplestDiHours);
                intent.putExtra("SIMPLESTDIMINUTES",simplestDiMinutes);
                startActivity(intent);
            }
        });

    }
}
        

 /*           button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view)
        {
            sendData();
        }
    });
    }

public void sendData() {
    hr = val1.getText().toString().trim();
    min = Integer.parseInt(val2.getText().toString().trim());

    Intent i = new Intent(MainActivity.this, MainActivity2.class);

    i.putExtra(MainActivity2.Hora.hr);
    i.putExtra(MainActivity2.Motsotso.min);

    startActivity(i);
}
}



 //   private void startMainActivity2(){
 //       Intent i = new Intent(this, MainActivity2.class);
 //       i.putExtra("val1", 1);
 //       i.putExtra("val2", 1);
 //       startActivity(i);
 //   }

 //   public void openActivity_main2(){
 //       Intent intent = new Intent(this, MainActivity2.class);
//        startActivity(intent);
//    }

*/