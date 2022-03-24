package com.example.animation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.animation.databinding.ActivityTwoBinding

class TwoActivity : AppCompatActivity() {
    private var binding: ActivityTwoBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_two)

        binding?.prev?.setOnClickListener(View.OnClickListener {
            val startActivity = Intent(this, MainActivity::class.java)
            startActivity(startActivity)

            overridePendingTransition(R.anim.slide_in, R.anim.slide_out)
        })


    }
}