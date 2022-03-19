package com.example.lab4codingchallange;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE =
            "com.example.android.lab4codingchallange.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchTextActivity(View view) {
        Button btn = (Button) (view);
        String text = btn.getText().toString();
        Intent intent = new Intent(this, textActivity.class);
        String message = "";
        if (text == getString(R.string.label_text_one)) {
            message = getString(R.string.text_one);
        } else if (text == getString(R.string.label_text_two))
            message = getString(R.string.text_two);
        else if (text == getString(R.string.label_text_three))
            message = getString(R.string.text_three);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

}