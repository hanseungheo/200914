package com.hanseungheon.sample

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.graphics.Typeface
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.app.NotificationCompat
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var channelid="아무거나"
        val nm=getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        val channel=NotificationChannel(channelid,"아무거나", NotificationManager.IMPORTANCE_HIGH)
        nm.createNotificationChannel(channel)

        val builder=NotificationCompat.Builder(this,channelid)
        builder.setContentTitle("로그캣")
            .setContentText("알림이 도착했습니다")
            .setSmallIcon(R.drawable.ic_audiotrack)
            .setColor(ContextCompat.getColor(this, R.color.colorPrimary))

        button.setOnClickListener {
            nm.notify(512, builder.build())
        }




    }
}