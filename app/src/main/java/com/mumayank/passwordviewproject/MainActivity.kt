package com.mumayank.passwordviewproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.mumayank.passwordview.PasswordView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val emailET = PasswordView.initAndGetEmailET(this, emailLayout)
        val passwordET = PasswordView.initAndGetPasswordET(this, passwordLayout)
        button.setOnClickListener {
            Toast.makeText(this, emailET.text.toString() + "\n" + passwordET.text.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}
