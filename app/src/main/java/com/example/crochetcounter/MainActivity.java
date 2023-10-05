package com.example.crochetcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int s = 0;
    static int rNumber = 1;
    public TextView rowNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rowNumber = findViewById(R.id.rowNumber);
        rowNumber.setText(String.valueOf(rNumber));
    }

    public void addStiches (View v) {
        TextView stiches = findViewById(R.id.numberStitches);
        s++;
        stiches.setText(String.valueOf(s));
    }

    public void subStiches (View v) {
        TextView stiches = findViewById(R.id.numberStitches);
        if (s > 0) {
            s--;
            stiches.setText(String.valueOf(s));
        }
    }

    private void updateRowNumber() {
        rowNumber = findViewById(R.id.rowNumber);
        rowNumber.setText(String.valueOf(rNumber));
    }

    public void newRow (View v) {

        LinearLayout rowList = findViewById(R.id.rowList);
        TextView row = new TextView(this);
        row.setText(s + " stiches");
        row.setTextSize(20);
        row.setTypeface(row.getTypeface(), Typeface.BOLD);
        rowList.addView(row);

        LinearLayout rowListNumber = findViewById(R.id.rowListNumber);
        TextView rowNumber = new TextView(this);
        rowNumber.setText(String.valueOf(rNumber));
        rowNumber.setTextSize(20);
        rowNumber.setTypeface(rowNumber.getTypeface(), Typeface.BOLD);
        rowNumber.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        rowListNumber.addView(rowNumber);

        TextView stiches = findViewById(R.id.numberStitches);
        s = 0;
        stiches.setText(String.valueOf(s));

        rNumber++;
        updateRowNumber();
    }


    public void savePattern (View v) {

    }

    public void loadPattern (View v) {

    }
}