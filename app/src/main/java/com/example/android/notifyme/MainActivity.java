package com.example.android.notifyme;

import android.app.Notification;
import android.app.NotificationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;

import static com.example.android.notifyme.R.styleable.View;

public class MainActivity extends AppCompatActivity {


    private Button mNotifyButton;
    private Button mUpdateButton;
    private Button mCancelButton;
    private NotificationManager mNotifyManager;
    private static final int NOTIFICATION_ID = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNotifyManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        mNotifyButton = (Button) findViewById(R.id.notify);
        mNotifyButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                sendNotification();

            }
        });
    }

    public void sendNotification(){


        android.support.v4.app.NotificationCompat.Builder notifyBuilder = new NotificationCompat.Builder(this)
                .setContentTitle("Test Notification!")
                .setContentTitle("Hallo ini Notification Pertama Saya.")
                .setSmallIcon(R.drawable.ic_android);
        Notification myNotification = notifyBuilder.build();
        mNotifyManager.notify(NOTIFICATION_ID, myNotification);
    }

    public void updateNotification(){

    }

    public void cancelNotification(){

    }
}
