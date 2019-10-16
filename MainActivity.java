package com.example.happybirthday;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MotionEventCompat;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("onCreate", "hola");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("onStart", "hola");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("onRestart", "hola");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("onResume", "hola");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("onPause", "hola");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("onStop", "hola");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("onDestroy", "hola");
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        int action = MotionEventCompat.getActionMasked(event);

        switch (action) {
            case (MotionEvent.ACTION_DOWN):
                Log.i("MotionEvent", "Action was DOWN");
                return true;
            case (MotionEvent.ACTION_MOVE):
                Log.i("MotionEvent", "Action was MOVE");
                return true;
            case (MotionEvent.ACTION_UP):
                Log.i("MotionEvent", "Action was UP");
                return true;
            case (MotionEvent.ACTION_CANCEL):
                Log.i("MotionEvent", "Action was CANCEL");
                return true;
            case (MotionEvent.ACTION_OUTSIDE):
                Log.i("MotionEvent", "Movement occurred outside bounds " +
                        "of current screen element");
                return true;
            default:
                return super.onTouchEvent(event);
        }
    }
}
