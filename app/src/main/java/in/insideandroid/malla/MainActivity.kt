package `in`.insideandroid.malla

import `in`.insideandroid.malla.Enter.SecMain
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import com.bridgefy.sdk.client.Bridgefy
import com.bridgefy.sdk.client.RegistrationListener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn1).setOnClickListener({
            val intent: Intent = Intent (this,  SecMain::class.java)
            startActivity(intent)
        })

    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)

        Bridgefy.initialize(applicationContext, )
    }




}