package com.example.feedfood_client

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SignupActivity : AppCompatActivity() {
    private fun isValidSIgnUp( email: String, password: String): Boolean {
        return  email.isNotEmpty() && password.isNotEmpty()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val emailEditText = findViewById<EditText>(R.id.up_email)
        val passwordEditText = findViewById<EditText>(R.id.up_email)
        val btDaftarButton = findViewById<Button>(R.id.bt_sign)

        btDaftarButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (isValidSIgnUp(email, password)) {
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            }
        }

    }
}