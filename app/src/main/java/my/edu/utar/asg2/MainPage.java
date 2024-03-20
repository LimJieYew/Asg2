package my.edu.utar.asg2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.compareNumber);
        Button button2 = findViewById(R.id.combineNumber);
        Button button3 = findViewById(R.id.arrangeNumber);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent compareNum = new Intent(MainPage.this, compareNumber.class);
                startActivity(compareNum);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent combineNum = new Intent(MainPage.this, combineNumber.class);
                startActivity(combineNum);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent arrangeNum = new Intent(MainPage.this, arrangeNumber.class);
                startActivity(arrangeNum);
            }
        });

        Button exitButton = findViewById(R.id.exitButton);
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}