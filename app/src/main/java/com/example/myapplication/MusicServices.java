package com.example.myapplication;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MusicService extends Service {
    public static String TAG = MusicService.class.getSimpleName();
    public MusicService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG,"service created");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"service destroyed");

    }

    @Override
    public IBinder onBind(Intent intent) {

        throw new UnsupportedOperationException("Not yet implemented");
    }
}