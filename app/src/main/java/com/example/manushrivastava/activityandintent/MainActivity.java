package com.example.manushrivastava.activityandintent;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static com.example.manushrivastava.activityandintent.R.styleable.View;

public class MainActivity extends Activity {
    String msg = "Android : ";

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "on Create", Toast.LENGTH_LONG).show();

    }

    /** Called when the activity is about to become visible. */
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "on Start", Toast.LENGTH_LONG).show();

    }

    /** Called when the activity has become visible. */
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "on resume", Toast.LENGTH_LONG).show();

    }

    /** Called when another activity is taking focus. */
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "on pause", Toast.LENGTH_LONG).show();

    }

    /** Called when the activity is no longer visible. */
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "on Stop", Toast.LENGTH_LONG).show();

    }

    /** Called just before the activity is destroyed. */
    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "on Destroy", Toast.LENGTH_LONG).show();

    }
    public void intenttesting(android.view.View v)
    {
        Intent i=new Intent(this,activity2.class);
        i.putExtra("value1","first value");
        i.putExtra("value2",10);
        startActivity(i);
    }
}