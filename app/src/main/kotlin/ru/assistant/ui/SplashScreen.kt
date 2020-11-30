package ru.assistant.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.assistant.MainActivity
import ru.student.assistant.R
import java.util.concurrent.TimeUnit

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.AppTheme)
        setContentView(SplashView(this))

        val intent = Intent(this, MainActivity::class.java)

        Thread {
            TimeUnit.MILLISECONDS.sleep(2000)
            startActivity(intent)
            finish()
        }.start()
    }

}