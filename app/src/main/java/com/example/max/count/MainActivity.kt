package com.example.max.count

import android.app.Activity
import android.os.Bundle
import android.view.View
import com.example.max.count.R.string.count
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.system.exitProcess


class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun countMe (view: View) {
        // Get the text view

        // Get the value of the text view.
        val countString = displayCount.text.toString()

        // Convert value to a number and increment it
        var count: Int = Integer.parseInt(countString)
        count++

        // Display the new value in the text view.
        displayCount.text = count.toString();

    }

    fun reset (view: View) {
        //Get count value
        val countString = displayCount.text.toString()

        //reset to zero
        displayCount.text = "0";

    }

    fun closeApp (view: View) {
        //Close the app
        finish()
    }



}
