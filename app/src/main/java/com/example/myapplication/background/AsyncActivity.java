package com.example.myapplication.background;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.example.myapplication.R;
import com.example.myapplication.background.DownloadTask;

public class AsyncActivity extends AppCompatActivity {
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_async);
        progressBar = findViewById(R.id.progressBardownload);



    }

    public void taskClick(View view) {
        DownloadTask downloadTask = new DownloadTask(progressBar);
        downloadTask.execute("www.imageurltobedowloaded.com");
    }
}