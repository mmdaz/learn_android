package com.example.numbershape;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Number {

        int number;

        public boolean isSquare() {

            double squareRoot = Math.sqrt(number);

            if (squareRoot == Math.floor(squareRoot)) {

                return true;

            } else {

                return false;

            }

        }

        public boolean isTriangular() {

            int x = 1;

            int triangularNumber = 1;

            while (triangularNumber < number) {

                x++;

                triangularNumber = triangularNumber + x;

            }

            if (triangularNumber == number) {

                return true;

            } else {

                return false;

            }

        }


    }


    public void testNumber(View view){
        EditText users_number = (EditText) findViewById(R.id.usersNumber);
        Log.i("usersNumber", users_number.getText().toString());
        Number number = new Number();
        number.number = Integer.valueOf(users_number.getText().toString());
        if (number.isSquare()) {
            Toast.makeText(this, "is square ...", Toast.LENGTH_LONG).show();
        }
        else if (number.isTriangular()) {
            Toast.makeText(this, "is triangle ...", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this, "is normal ...", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
