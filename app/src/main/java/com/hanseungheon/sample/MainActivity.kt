package com.hanseungheon.sample

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val TAG="myapplicationTAG"
        var a=3
        var b="아무거나"

         a=5
        Log.d(TAG,textview1.text.toString())
        textview1.typeface= Typeface.createFromAsset(assets,"BMJUA_ttf.ttf")



    }
}