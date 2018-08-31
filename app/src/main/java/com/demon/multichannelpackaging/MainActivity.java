package com.demon.multichannelpackaging;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvPackage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvPackage = findViewById(R.id.tv_package);
        tvPackage.setText("当前包名:" + getPackageName());

    }
}
