package `in`.insideandroid.malla.Enter

import `in`.insideandroid.malla.R
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TrMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tr_main)

        findViewById<Button>(R.id.btn3).setOnClickListener({
            val intent: Intent = Intent (this,  CuaMain::class.java)
            startActivity(intent)
        })


    }
}