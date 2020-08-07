package com.example.excelsecondv3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner DivisionSp, UpozellaSP, ServiceSP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DivisionSp = findViewById(R.id.divisionSP);
        UpozellaSP = findViewById(R.id.upozellaSP);
        ServiceSP = findViewById(R.id.serviceSP);

        final String division[] = {"Dhaka", "Borishal", "Kishoreganj", "Shylet"};

        final String Dhaka1[] = {"lalbag", "shahbag", "Bongsal"};
        final String Dhaka2[] = {"lalbag2", "shahbag2", "Bongsal2"};
        final String Dhaka3[] = {"lalbag3", "shahbag3", "Bongsal3"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,division);
        DivisionSp.setAdapter(adapter);

        DivisionSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String itemSelect = division[position];
                if (position == 0){
                    ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, Dhaka1);
                    UpozellaSP.setAdapter(adapter1);
                }
                if (position == 1){
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, Dhaka2);
                    UpozellaSP.setAdapter(adapter2);
                }
                if (position == 2){
                    ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, Dhaka3);
                    UpozellaSP.setAdapter(adapter3);
                }
//                Toast.makeText(MainActivity.this, "Select item: " + itemSelect, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
