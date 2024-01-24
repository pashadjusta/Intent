package com.example.intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.inten.R

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var btnDialPhone: Button
    lateinit var btnActivity: activity_move_with_data
    lateinit var btnMoveActivity: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDialPhone = findViewById(R.id.btn_move_activity)
        btnMoveActivity = findViewById(R.id.btn_move_activity)
        btnMoveActivity = findViewById(R.id.btn_move_activity)

        btnDialPhone.setOnClickListener(this)
        btnMoveActivity.setOnClickListener(this)
        btnMoveActivity.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_move_activity -> {
                val moveIntent = Intent(
                    this@MainActivity,
                    activity_move_with_data::class.java
                )
                startActivity(moveIntent)
            }

            R.id.btn_move_activity -> {
                val moveWithDataIntent = Intent(
                    this@MainActivity,
                    activity_move_with_data::class.java
                )
                moveWithDataIntent.putExtra(activity_move_with_data.EXTRA_NAME, "DicodingAcademyBoy")
                startActivity(moveWithDataIntent)
            }

            R.id.btn_move_activity -> {
                val phoneNumber = "0812213457"
                val dialPhoneIntent = Intent(
                    Intent.ACTION_DIAL,
                    Uri.parse("tel:$phoneNumber")
                )
                startActivity(dialPhoneIntent)
            }
        }
    }
}