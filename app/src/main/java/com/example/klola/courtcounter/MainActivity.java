package com.example.klola.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int quantity_a;
    int quantity_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//fungsi untuk display Team A

    public void aTigaPoint (View view) {
        quantity_a =  quantity_a + 3;
        display_a (quantity_a);
    }

    public void aDuaPoint (View view) {
        quantity_a =  quantity_a + 2;
        display_a (quantity_a);
    }

    public void aFreePoint (View view) {
        quantity_a =  quantity_a + 1;
        display_a (quantity_a);
    }
//fungsi untuk display Team B
    public void bTigaPoint (View view) {
        quantity_b = quantity_b + 3;
        display_b (quantity_b);
    }

    public void bDuaPoint (View view) {
        quantity_b = quantity_b + 2;
        display_b (quantity_b);
    }

    public void bFreePoint (View view) {
        quantity_b = quantity_b + 1;
        display_b (quantity_b);
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
