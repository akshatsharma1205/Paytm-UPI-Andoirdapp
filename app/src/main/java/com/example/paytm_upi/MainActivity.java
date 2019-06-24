package com.example.paytm_upi;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);

        String upi = "upi://pay?pa=paytm-delvvt@paytm&pn=%s&tr=dlvvt0098706&mc=5641&am=%s";

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://paytm-trans.appspot.com/redirect"));
                startActivity(browserIntent);
            }
        });
    }





}
