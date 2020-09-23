package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    EditText personname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "mainactivity_created");

        personname = findViewById(R.id.editTextTextPersonName);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "mainactivity started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "mainactivity resumed");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "mainactivity paused");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "mainactivity stoped");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "mainactivity destroyed");

    }

    public void onclicklistner(View view) {
        Log.e(TAG, "button_clicked");
        switch (view.getId()){
            case R.id.buttonLogin:
                startHomeActivity();
                break;
            case R.id.buttonCancel:
                dialPhone();
                break;
        }

    }

    private void dialPhone() {
        Log.v(TAG, "dialPhone_number");
        Intent dIntent = new Intent();
        dIntent.setAction(Intent.ACTION_DIAL);
        dIntent.setData(Uri.parse("tel:8197948749"));
        startActivity(dIntent);
    }

    private void startHomeActivity() {
        String name= personname.getText().toString();
        Toast.makeText(this, "Welcome " +name+" to android", Toast.LENGTH_SHORT).show();
        Intent hIntent = new Intent(MainActivity.this, HomeActivity.class);
        hIntent.putExtra("studentName",name);
        startActivity(hIntent);
    }

    public void clickListener(View view) {
    }
}