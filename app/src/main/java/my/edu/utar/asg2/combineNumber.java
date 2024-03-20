package my.edu.utar.asg2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class combineNumber extends AppCompatActivity {

    TextView numberDisplay;
    int num1, num2, number;
    int checkedCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combine_number);

        CheckBox checkBox1 = findViewById(R.id.checkBox1);
        CheckBox checkBox2 = findViewById(R.id.checkBox2);
        CheckBox checkBox3 = findViewById(R.id.checkBox3);
        CheckBox checkBox4 = findViewById(R.id.checkBox4);
        CheckBox checkBox5 = findViewById(R.id.checkBox5);
        CheckBox checkBox6 = findViewById(R.id.checkBox6);
        CheckBox checkBox7 = findViewById(R.id.checkBox7);
        CheckBox checkBox8 = findViewById(R.id.checkBox8);
        CheckBox checkBox9 = findViewById(R.id.checkBox9);
        Button checkButton = findViewById(R.id.checkButton);
        Button exitButton = findViewById(R.id.exitButton);

        numberDisplay = findViewById(R.id.displayContainer);


        number = generatedAndSetNumber();



        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    checkedCount++;

                    if (checkedCount > 2) {
                        checkBox1.setChecked(false); // Prevent further checkboxes from being checked
                        checkedCount--;
                    }
                    else if(checkedCount == 1){
                        num1=1;
                    }
                    else{
                        num2=1;
                    }
                } else {
                    checkedCount--;
                }
            }
        });
        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    checkedCount++;
                    if (checkedCount > 2) {
                        checkBox2.setChecked(false); // Prevent further checkboxes from being checked
                        checkedCount--;
                    }
                    else if(checkedCount == 1){
                        num1=2;
                    }
                    else{
                        num2=2;
                    }
                } else {
                    checkedCount--;
                }
            }

        });
        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    checkedCount++;

                    if (checkedCount > 2) {
                        checkBox3.setChecked(false); // Prevent further checkboxes from being checked
                        checkedCount--;
                    }
                    else if(checkedCount == 1){
                        num1=3;
                    }
                    else{
                        num2=3;
                    }
                } else {
                    checkedCount--;
                }
            }
        });
        checkBox4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    checkedCount++;

                    if (checkedCount > 2) {
                        checkBox4.setChecked(false); // Prevent further checkboxes from being checked
                        checkedCount--;
                    }
                    else if(checkedCount == 1){
                        num1=4;
                    }
                    else{
                        num2=4;
                    }
                } else {
                    checkedCount--;
                }
            }
        });
        checkBox5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    checkedCount++;
                    if (checkedCount > 2) {
                        checkBox5.setChecked(false); // Prevent further checkboxes from being checked
                        checkedCount--;
                    }
                    else if(checkedCount == 1){
                        num1=5;
                    }
                    else{
                        num2=5;
                    }
                } else {
                    checkedCount--;
                }
            }
        });
        checkBox6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    checkedCount++;

                    if (checkedCount > 2) {
                        checkBox6.setChecked(false); // Prevent further checkboxes from being checked
                        checkedCount--;
                    }
                    else if(checkedCount == 1){
                        num1=6;
                    }
                    else{
                        num2=6;
                    }
                } else {
                    checkedCount--;
                }
            }
        });
        checkBox7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    checkedCount++;

                    if (checkedCount > 2) {
                        checkBox7.setChecked(false); // Prevent further checkboxes from being checked
                        checkedCount--;
                    }
                    else if(checkedCount == 1){
                        num1=7;
                    }
                    else{
                        num2=7;
                    }
                } else {
                    checkedCount--;
                }
            }
        });
        checkBox8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    checkedCount++;

                    if (checkedCount > 2) {
                        checkBox8.setChecked(false); // Prevent further checkboxes from being checked
                        checkedCount--;
                    }
                    else if(checkedCount == 1){
                        num1=8;
                    }
                    else{
                        num2=8;
                    }
                } else {
                    checkedCount--;
                }
            }
        });
        checkBox9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    checkedCount++;

                    if (checkedCount > 2) {
                        checkBox9.setChecked(false); // Prevent further checkboxes from being checked
                        checkedCount--;
                    }
                    else if(checkedCount == 1){
                        num1=9;
                    }
                    else{
                        num2=9;
                    }
                } else {
                    checkedCount--;
                }
            }
        });

        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(num1, num2, number);
                if(number<9) {
                    int enableCheckID = getResources().getIdentifier("checkBox" + number, "id", getPackageName());
                    CheckBox enableCheck = findViewById(enableCheckID);
                    enableCheck.setEnabled(true);
                }

                for (int i = 1; i <= 9; i++) {
                    int checkBoxId = getResources().getIdentifier("checkBox" + i, "id", getPackageName());
                    CheckBox checkBox = findViewById(checkBoxId);
                    checkBox.setChecked(false);
                }
                generatedAndSetNumber();
            }
        });

        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    private void checkAnswer(int num1, int num2, int generatedNumber) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Result");
        if ((num1+num2) == generatedNumber) {
            builder.setMessage("Yay! You got it right!");
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
    public int generateRandomDigit() {
        Random rand = new Random();
        return rand.nextInt(15) + 3; // Generates a random number between 1 and 9
    }

    public int generatedAndSetNumber(){
        number = generateRandomDigit();
        numberDisplay.setText(Integer.toString(number));
        if(number < 9) {
            int disableCheckID = getResources().getIdentifier("checkBox" + number, "id", getPackageName());
            CheckBox disableCheck = findViewById(disableCheckID);
            disableCheck.setEnabled(false);
        }
        return number;
    }
}