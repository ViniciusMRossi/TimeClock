package com.viniciusrossi.timeclock

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.viniciusrossi.login.LoginActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startActivity(Intent(this, LoginActivity::class.java))
    }
}
