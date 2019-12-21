package com.example.helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    private var image: ImageView? = null
    private var text: TextView? = null
    private var counter:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image = findViewById<ImageView>(R.id.myImageView)
        text = findViewById<TextView>(R.id.myTextView)

        image?.setOnClickListener(View.OnClickListener {
             counter++
             text?.setText(counter.toString())
        })

    }


}
