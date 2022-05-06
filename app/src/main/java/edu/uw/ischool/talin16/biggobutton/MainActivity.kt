package edu.uw.ischool.talin16.biggobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pushMeButton = findViewById<Button>(R.id.pushMeButton)

        var counter = 0;
        val string1: String = getString(R.string.button_name_with_counter)
        val timeString:String=getString(R.string.time)
        val timesString:String=getString(R.string.times)

        pushMeButton.setOnClickListener {
            counter++;
            if (counter == 1) {
                pushMeButton.text = "$string1 $counter $timeString"
            } else {
                pushMeButton.text = "$string1 $counter $timesString"
            }
        }
    }
}