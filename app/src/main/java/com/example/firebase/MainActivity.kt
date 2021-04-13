package com.example.firebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.ktx.Firebase
import com.google.firebase.perf.FirebasePerformance
import com.google.firebase.perf.metrics.AddTrace
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    val myTrace = FirebasePerformance.getInstance().newTrace("testTrace")

    //private lateinit var firebaseAnalytics: FirebaseAnalytics

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * Firebase Performance using traces
         */
        myFunction()

        //Log.d("OnCreate","${intent.extras?.getString("my_data")}")

        //firebaseAnalytics = Firebase.analytics

       /* crashBtn.text = "Crash!"
        crashBtn.setOnClickListener {
            throw RuntimeException("Test Crash")
            setUserId()
            setUpUserProperty()
            setDefaultParameters()

            // custom event
            val eventName2 = "share_image"
            val bundle = Bundle().apply {
                putString("image_name", "some_name")
                putString("image_description", "some_text")
            }
            firebaseAnalytics.logEvent(eventName2, bundle)
        }*/
    }

    @AddTrace(name = "onStartTrace")
    override fun onStart() {
        super.onStart()
    }

    private fun myFunction() {
        myTrace.start()
        myTrace.incrementMetric("hit",1)


        myTrace.stop()
    }
   /* private fun setDefaultParameters() {
        val parameters = Bundle().apply {
            putString(FirebaseAnalytics.Param.LOCATION, "INDIA")
            putString(FirebaseAnalytics.Param.CURRENCY, "INR")
        }

        firebaseAnalytics.setDefaultEventParameters(parameters)
    }*/


    /*private fun setUpUserProperty() {
        firebaseAnalytics.setUserProperty("location", "INDIA")
        firebaseAnalytics.setUserProperty("currency", "INR")
        firebaseAnalytics.setUserProperty("is_subscribe", "false")
    }

    private fun setUserId(){
        firebaseAnalytics.setUserId("69696")
    }*/


}