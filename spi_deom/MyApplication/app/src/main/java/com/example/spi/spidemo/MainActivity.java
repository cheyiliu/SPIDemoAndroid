package com.example.spi.spidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.spi.iAdd;

import java.util.ServiceLoader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_spi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleSpiCall();
            }
        });
    }

    private void handleSpiCall() {
        ServiceLoader<iAdd> addLoader = ServiceLoader.load(iAdd.class, getClassLoader());
        if (addLoader != null) {
            iAdd add = addLoader.iterator().next();
            if (add != null) {
                Log.i("test123", "123+567=" + add.add(123, 567));
            }
        }
    }
}
