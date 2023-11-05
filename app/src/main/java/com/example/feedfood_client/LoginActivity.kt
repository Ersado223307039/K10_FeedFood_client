package com.example.feedfood_client

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
    val Login = findViewById<Button>(R.id.bt_Login)
    val daftar = findViewById<TextView>(R.id.tv_daftar)
    val emailEditText = findViewById<EditText>(R.id.add_email)
    val passwordEditText = findViewById<EditText>(R.id.add_pwd)
}