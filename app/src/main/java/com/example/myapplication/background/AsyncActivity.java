//package com.example.myapplication.background;
//
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//import android.view.View;
//import android.widget.ProgressBar;
//import android.content.Intent;
//
//import com.example.myapplication.MusicService;
//import com.example.myapplication.R;
//
//public class AsyncActivity extends AppCompatActivity {
//    ProgressBar progressBar;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_async);
//        progressBar = findViewById(R.id.progressBardownload);
//
//
//
//    }
//
//    public void taskClick(View view) {
//
//        Intent serviceIntent = new Intent(AsyncActivity.this, MusicService.class);
//
//        switch (view.getId()){
//            case R.id.buttonTask:
//                DownloadTask downloadTask = new DownloadTask(progressBar,this);
//                downloadTask.execute("www.imageurltobedowloaded.com");
//                break;
//            case R.id.buttonstart:
//                startService(serviceIntent);
//                break;
//            case R.id.buttonstop:
//                stopService(serviceIntent);
//                break;
//        }
//    }
//}