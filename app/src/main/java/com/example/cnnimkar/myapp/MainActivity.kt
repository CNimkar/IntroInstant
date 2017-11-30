package com.example.cnnimkar.myapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var imageView = findViewById<ImageView>(R.id.myPicture)
        var androidifyView = findViewById<ImageView>(R.id.androidify)

        GlideApp
                .with(this)
                .load("http://nimkar.io/chai.jpg")
                .circleCrop()
                .frame(10)
                .into(imageView)

        GlideApp
                .with(this)
                .load("http://nimkar.io/chaidroid.gif")
                .centerCrop()
                .into(androidifyView)
        //I haven't added any of placeholder, error, fallback since I do not know whether it should be part of instant app


    }


}
