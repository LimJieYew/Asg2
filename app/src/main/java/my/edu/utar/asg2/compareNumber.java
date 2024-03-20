package my.edu.utar.asg2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class compareNumber extends AppCompatActivity {

    private Button button1, button2, exitButton;
    private int number1, number2;
    private Set<Integer> generatedNumbers = new HashSet<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compare_number);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        exitButton = findViewById(R.id.exitButton);

        generateAndSetRandomNumbers();

        // Set click listeners for both buttons
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(number1, number2);
                generateAndSetRandomNumbers();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(number2, number1);
                generateAndSetRandomNumbers();
            }
        });

        //Exit Button
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    //Number Generator Method
    private void generateAndSetRandomNumbers() {
        number1 = generateRandomTwoDigitInt();
        generatedNumbers.add(number1);
        number2 = generateRandomTwoDigitInt();
        while (generatedNumbers.contains(number2)) {
            number2 = generateRandomTwoDigitInt();
        }
        generatedNumbers.add(number2);
        button1.setText(String.valueOf(number1));
        button2.setText(String.valueOf(number2));
    }

    private int generateRandomTwoDigitInt() {
        Random rand = new Random();
        return rand.nextInt(90) + 10; // Generates a random integer between 10 and 99
    }

    //Check Answer Method
    private void checkAnswer(int selectedNumber, int otherNumber) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Result");
        if (selectedNumber > otherNumber) {
            builder.setMessage("Yay! You choose the right one!");
        } else {
            builder.setMessage("Uh owh! Try again!");
        }
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
