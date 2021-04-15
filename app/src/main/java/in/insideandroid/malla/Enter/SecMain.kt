package `in`.insideandroid.malla.Enter

import `in`.insideandroid.malla.Contacts.Contacts
import `in`.insideandroid.malla.R
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sec_main)

        findViewById<Button>(R.id.btn2).setOnClickListener({
            val intent: Intent = Intent (this,  TrMain::class.java)
            startActivity(intent)
        })
    }
}