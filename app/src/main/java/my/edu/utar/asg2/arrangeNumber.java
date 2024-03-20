package my.edu.utar.asg2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class arrangeNumber extends AppCompatActivity {

    public Button button1, button2, button3, button4, button5, exitButton, submitButton;
    public int number1, number2, number3, number4, number5;
    public TextView tv1, tv2, tv3, tv4, tv5;
    int[] submitted=new int[5];
    int[] declaredInt = new int[5];
    int checkCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arrange_number);

        tv1 = findViewById(R.id.textView1);
        tv2 = findViewById(R.id.textView2);
        tv3 = findViewById(R.id.textView3);
        tv4 = findViewById(R.id.textView4);
        tv5 = findViewById(R.id.textView5);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        exitButton = findViewById(R.id.exitButton);
        submitButton = findViewById(R.id.submitButton);


        generateQuestion();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkCount++;
                calCheckCount(checkCount, 1, declaredInt, submitted);
                button1.setEnabled(false);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkCount++;
                calCheckCount(checkCount, 2, declaredInt, submitted);
                button2.setEnabled(false);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkCount++;
                calCheckCount(checkCount, 3, declaredInt, submitted);
                button3.setEnabled(false);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkCount++;
                calCheckCount(checkCount, 4, declaredInt, submitted);
                button4.setEnabled(false);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkCount++;
                calCheckCount(checkCount, 5, declaredInt, submitted);
                button5.setEnabled(false);
            }
        });

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(submitted);
                checkCount = 0;
                generateQuestion();
            }
        });

        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
    public static Set<Integer> generateRandomNumber(){
        Set<Integer> uniqueNumbers = new HashSet<>();
        Random random = new Random();

        while (uniqueNumbers.size() < 5) {
            uniqueNumbers.add(random.nextInt(9 + 1) + 1);
        }

        return uniqueNumbers;
    }

    public void generateQuestion(){
        Set<Integer> randomNumbers = generateRandomNumber();
        Object[] numberArray = randomNumbers.toArray();
        number1 = (int) numberArray[0];
        number2 = (int) numberArray[1];
        number3 = (int) numberArray[2];
        number4 = (int) numberArray[3];
        number5 = (int) numberArray[4];

        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);


        button1.setText(Integer.toString(number1));
        button2.setText(Integer.toString(number2));
        button3.setText(Integer.toString(number3));
        button4.setText(Integer.toString(number4));
        button5.setText(Integer.toString(number5));

        tv1.setText("");
        tv2.setText("");
        tv3.setText("");
        tv4.setText("");
        tv5.setText("");

        declaredInt[0] = number1;
        declaredInt[1] = number2;
        declaredInt[2] = number3;
        declaredInt[3] = number4;
        declaredInt[4] = number5;


    }
    public void calCheckCount(int checkCount, int i, int[] declaredInt, int[] submitted){
        if(checkCount==1){
            submitted[0] = (int)declaredInt[i-1];
            TextView tv = findViewById(R.id.textView1);
            tv.setText(Integer.toString(submitted[0]));
        } else if (checkCount==2) {
            submitted[1] = (int)declaredInt[i-1];
            TextView tv = findViewById(R.id.textView2);
            tv.setText(Integer.toString(submitted[1]));
        }
        else if (checkCount==3) {
            submitted[2] = (int) declaredInt[i-1];
            TextView tv = findViewById(R.id.textView3);
            tv.setText(Integer.toString(submitted[2]));
        }
        else if (checkCount==4) {
            submitted[3] = (int) declaredInt[i-1];
            TextView tv = findViewById(R.id.textView4);
            tv.setText(Integer.toString(submitted[3]));
        }
        else{
            submitted[4] = (int) declaredInt[i-1];
            TextView tv = findViewById(R.id.textView5);
            tv.setText(Integer.toString(submitted[4]));
        }
    }

    public static boolean isAscendingOrder(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private void checkAnswer(int[] submitted) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Result");
        if (isAscendingOrder(submitted)) {
            builder.setMessage("Yay! You arranged it correctly!");

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