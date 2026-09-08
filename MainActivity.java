package com.fastradio.lite;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle state) {
        super.onCreate(state);
        TextView t = new TextView(this);
        t.setText("Fast Radio");
        t.setTextSize(26);
        t.setTextColor(Color.BLACK);
        t.setGravity(Gravity.CENTER);
        setContentView(t);
    }
}
