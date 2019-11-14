package com.skunk.business

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.skunk.library.logic.TestModule

class BusinessActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_business)

        val test = TestModule().testMe()
        Log.e("i", test)
    }
}
