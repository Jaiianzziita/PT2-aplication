package `in`.insideandroid.malla

import `in`.insideandroid.malla.Contacts.Contacts
import `in`.insideandroid.malla.Profile.Profile
import android.content.ClipData
import android.content.Intent
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Button
import com.google.android.material.appbar.MaterialToolbar
import insideandroid.malla.ui.main.SectionsPagerAdapter


class TabsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tabs)
        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = findViewById(R.id.view_pager)
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = findViewById(R.id.tabs)
        tabs.setupWithViewPager(viewPager)
        val fab: FloatingActionButton = findViewById(R.id.fab)
        val topAppBar: MaterialToolbar = findViewById(R.id.topAppBar)




        fab.setOnClickListener({view ->

           val intent: Intent = Intent (this,  Contacts::class.java)
            startActivity(intent)

            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        })

            topAppBar.setNavigationOnClickListener({view ->

                val intent: Intent = Intent (this, Profile::class.java)
                startActivity(intent)

                Snackbar.make(view, "mandar a perfil", Snackbar.LENGTH_SHORT )
                    .show()
            })
    }
}