package com.fastradio.lite;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView text = new TextView(this);
        text.setText("Fast Radio");
        text.setTextSize(28);
        text.setTextColor(Color.BLACK);
        text.setGravity(Gravity.CENTER);
        text.setBackgroundColor(Color.WHITE);

        setContentView(text);
    }
}
