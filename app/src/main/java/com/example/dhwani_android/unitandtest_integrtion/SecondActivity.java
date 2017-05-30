package com.example.dhwani_android.unitandtest_integrtion;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

/**
 * Created by DHWANI-ANDROID on 08-05-17.
 */

public class SecondActivity extends Activity {
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String result = getIntent().getStringExtra("result");
        tvResult = (TextView) findViewById(R.id.tvResult);
        tvResult.setText(result);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.second, menu);
        return true;
    }
}
