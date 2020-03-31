package com.saad102.shongbidhan;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
public class MessagingService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {
        showNotification(remoteMessage.getNotification().getTitle(),
                remoteMessage.getNotification().getBody());

    }

    public void showNotification(String title,String message){
       // PendingIntent pi = PendingIntent.getActivity(this,0, new Intent(this,NobomVag.class),0);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this,"My Notification")
                .setContentTitle(title)
                .setSmallIcon(R.drawable.ic_stat_name)
                .setAutoCancel(true)
                .setContentText(message);
        NotificationManagerCompat manager = NotificationManagerCompat.from(this);
        manager.notify(999,builder.build());

    }
}
