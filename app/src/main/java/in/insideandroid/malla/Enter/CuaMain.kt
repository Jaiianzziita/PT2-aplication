package `in`.insideandroid.malla.Enter

import `in`.insideandroid.malla.LoginActivity
import `in`.insideandroid.malla.R
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CuaMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cua_main)

        findViewById<Button>(R.id.btn4).setOnClickListener({
            val intent: Intent = Intent (this,  LoginActivity::class.java)
            startActivity(intent)
        })
    }
}