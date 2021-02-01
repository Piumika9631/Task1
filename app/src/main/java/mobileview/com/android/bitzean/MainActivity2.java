package mobileview.com.android.bitzean;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String passedString = intent.getStringExtra(String.valueOf(R.string.passing_string_name));

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Toast.makeText(MainActivity2.this,
                        passedString,
                        Toast.LENGTH_LONG).show();
            }
        }, 1000);
    }
}