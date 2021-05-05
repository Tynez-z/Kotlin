package com.example.workwithkotlin
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_show_inform.*

class ShowInformActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_inform)
        val userEmail = intent.getStringExtra(USER_EMAIL)
        val userPassword = intent.getStringExtra(USER_PASSWORD)
        textView.text = "Email: $userEmail\nPassword: $userPassword"
    }
}