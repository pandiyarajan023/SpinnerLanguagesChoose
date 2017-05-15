package com.example.pandi.spinnerlanguageschoose;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    Spinner spinnerctrl;
    Button btn;
    Locale myLocale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerctrl=(Spinner)findViewById(R.id.spinner);
        spinnerctrl.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 1) {
                    Toast.makeText(adapterView.getContext(),
                            "You have selected English", Toast.LENGTH_SHORT)
                            .show();
                    setLocale("en");
                } else if (i == 2) {
                    Toast.makeText(adapterView.getContext(),
                            "You have selected Hindi", Toast.LENGTH_SHORT)
                            .show();
                    setLocale("hi");
                } else if (i == 3) {
                    Toast.makeText(adapterView.getContext(),
                            "You have selected Tamil", Toast.LENGTH_SHORT)
                            .show();
                    setLocale("ta");
                } else if (i == 4) {
                    Toast.makeText(adapterView.getContext(),
                            "You have selected Chinese", Toast.LENGTH_SHORT)
                            .show();
                    setLocale("zh-rCN");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

            public void setLocale(String lang)
            {
                myLocale = new Locale(lang);
                Resources res = getResources();
                DisplayMetrics dm = res.getDisplayMetrics();
                Configuration conf = res.getConfiguration();
                conf.locale = myLocale;
                res.updateConfiguration(conf, dm);
            }

        }

