package com.example.animation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import com.example.animation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding?.next?.setOnClickListener(View.OnClickListener {
            val startActivityTwo = Intent(this, TwoActivity::class.java)
            startActivity(startActivityTwo)

            overridePendingTransition(R.anim.slide_up_in, R.anim.slide_up_out)
        })

        YoYo.with(Techniques.Tada)
            .duration(700)
            .repeat(5)
            .playOn(binding?.buttonOne)

        YoYo.with(Techniques.Wobble)
            .duration(700)
            .repeat(5)
            .playOn(binding?.buttonTwo)

        YoYo.with(Techniques.Pulse)
            .duration(700)
            .repeat(5)
            .playOn(binding?.buttonThree)

        YoYo.with(Techniques.RubberBand)
            .duration(700)
            .repeat(5)
            .playOn(binding?.buttonFour)

        YoYo.with(Techniques.Swing)
            .duration(700)
            .repeat(5)
            .playOn(binding?.buttonFive)
    }
}