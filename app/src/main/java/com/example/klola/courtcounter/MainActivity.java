package com.example.klola.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int quantity_a = 0 ;
    int quantity_b = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//fungsi untuk display Team A

    public void aTigaPoint (View view) {
        display_a (quantity_a + 3);
    }

    public void aDuaPoint (View view) {
        display_a (quantity_a + 2);
    }

    public void aFreePoint (View view) {
        display_a (quantity_a + 1);
    }
//fungsi untuk display Team B
    public void bTigaPoint (View view) {
        display_b (quantity_b + 3);
    }

    public void bDuaPoint (View view) {
        display_b (quantity_b + 2);
    }

    public void bFreePoint (View view) {
        display_b (quantity_b + 1);
    }

    public void aResetPoint (View view) {
        display_a (quantity_a * 0);
        display_b (quantity_b * 0);
    }


    public void display_a(int i) {
        TextView quantityTextView = (TextView) findViewById(R.id.display_a);
        quantityTextView.setText("" + i);
    }

    public void display_b(int j) {
        TextView quantityTextView = (TextView) findViewById(R.id.display_b);
        quantityTextView.setText("" + j);
    }


}
