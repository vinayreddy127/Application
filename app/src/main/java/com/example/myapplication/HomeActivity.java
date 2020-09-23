package com.example.myapplication;


import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class HomeActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName() ;
    public static final String SHAREDPREFS = "sharedprefs";
    public static final String KEYNAME = "keyname";
    public static final String KEYPWD = "keypwd";
    EditText nameEditText, pwdEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"mainactivity created");

        nameEditText = findViewById(R.id.editTextTextPersonName);
        pwdEditText = findViewById(R.id.editTextTextPassword);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"mainactivity onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"mainactivity onResume");
        restoreData();

    }

    private void restoreData() {

        SharedPreferences preferences = getSharedPreferences(SHAREDPREFS,MODE_PRIVATE);


        String name = preferences.getString(KEYNAME,"");
        String pwd = preferences.getString(KEYPWD,"");

        nameEditText.setText(name);
        pwdEditText.setText(pwd);
    }

    @Override
    protected void onPause() { //saving data
        super.onPause();
        Log.i(TAG,"mainactivity onPause");
        saveData();

    }

    private void saveData() {///test case --onpause --if data is saved successfully then i should be able to open the file and see the data stored in that file

        String name = nameEditText.getText().toString();
        String pwd = pwdEditText.getText().toString();

        SharedPreferences preferences = getSharedPreferences(SHAREDPREFS,MODE_PRIVATE);

        SharedPreferences.Editor editor = preferences.edit();

        editor.putString(KEYNAME,name);
        editor.putString(KEYPWD,pwd);

        editor.commit();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"mainactivity onStop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"mainactivity onDestroy");
    }
    public void clickListener(View view) {
        Log.e(TAG,"button Clicked");
        switch (view.getId()){
            case R.id.buttonClick:
                String name = nameEditText.getText().toString();
                TextView testTextView = findViewById(R.id.textViewtest);
                testTextView.setText(name);
                break;
            case R.id.buttonLogin:
                int a = add(10,20);
                startHomeActivity();
                break;
            case R.id.buttonCancel:
                dialPhone();
//                Student student = new Student();
//                student.name = "abdul";
                // Student.COLLEGE_NAME;
                break;
        }
    }
    private int add(int i, int i1) {
        return  i+i1;
    }
    private void dialPhone() {
        Log.v(TAG,"dialing phone no");
        Intent dIntent = new Intent();
        dIntent.setAction(Intent.ACTION_DIAL);// implicit intent
        dIntent.setData( Uri.parse("tel:98765432"));
        startActivity(dIntent);
    }
    private void startHomeActivity() {
        Log.w(TAG,"starting home activity");
        String name = nameEditText.getText().toString();
        Toast.makeText(this, "welcome "+name +" to android", Toast.LENGTH_SHORT).show();
//        Intent hIntent = new Intent(().this, main.class); //explicit intent
//        hIntent.putExtra("studentname",name);
//        startActivity(hIntent);
    }
}