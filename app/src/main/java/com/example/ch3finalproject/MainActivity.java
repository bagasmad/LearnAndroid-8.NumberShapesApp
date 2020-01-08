package com.example.ch3finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick(View view){
        EditText insertNumber = findViewById(R.id.insertNumber);
        Number checkedNumber = new Number();
        if (insertNumber.length()>0){
            checkedNumber.theNumber= Integer.parseInt(insertNumber.getText().toString());
            checkedNumber.check();
            if(checkedNumber.isTriangular||checkedNumber.isSquare)
            {
                if(!checkedNumber.isTriangular)
                {
                    Toast.makeText(this, checkedNumber.theNumber + " is Square", Toast.LENGTH_SHORT).show();
                    insertNumber.setText("");
                }
                else if (!checkedNumber.isSquare)
                {
                    Toast.makeText(this, checkedNumber.theNumber + " is Triangular", Toast.LENGTH_SHORT).show();
                    insertNumber.setText("");
                }
                else {
                    Toast.makeText(this, checkedNumber.theNumber + " is Triangular Square", Toast.LENGTH_SHORT).show();
                    insertNumber.setText("");

                }
            }
            else { Toast.makeText(this, checkedNumber.theNumber + " is neither Triangular nor Square", Toast.LENGTH_SHORT).show();
                insertNumber.setText("");
            }

        }
        else
            {
                Toast.makeText(this, "Please insert a number", Toast.LENGTH_SHORT).show();
            }


    }
}
