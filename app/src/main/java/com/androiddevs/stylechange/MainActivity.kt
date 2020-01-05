package com.androiddevs.stylechange

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme((application as MyApplication).themeId)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvTheme.text = (application as MyApplication).themeName

        btnBlueTheme.setOnClickListener {
            changeTheme(R.style.BlueTheme, "BLUE THEME")
        }

        btnPurpleTheme.setOnClickListener {
            changeTheme(R.style.PurpleTheme, "PURPLE THEME")
        }

        btnLimeTheme.setOnClickListener {
            changeTheme(R.style.LimeTheme, "LIME THEME")
        }

        btnOrangeTheme.setOnClickListener {
            changeTheme(R.style.OrangeTheme, "ORANGE THEME")
        }

    }

    fun changeTheme(themeId: Int, name: String) {
        (application as MyApplication).themeId = themeId
        (application as MyApplication).themeName = name
        recreate()
    }
}
