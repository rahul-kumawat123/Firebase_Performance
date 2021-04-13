package com.example.firebase

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class DemoService : FirebaseMessagingService() {
    override fun onMessageReceived(p0: RemoteMessage) {
        super.onMessageReceived(p0)

        Log.d("OnMessageReceived","${p0.messageId}")
    }

    override fun onNewToken(p0: String) {
        super.onNewToken(p0)

        Log.d("onNewToke","${p0}")
        print(p0)
    }
}