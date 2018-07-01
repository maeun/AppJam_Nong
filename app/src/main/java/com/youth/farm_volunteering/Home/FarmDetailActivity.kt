package com.youth.farm_volunteering

import android.graphics.PorterDuff
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_farm_detail.*

class FarmDetailActivity : AppCompatActivity() {

    var toolbar : android.support.v7.widget.Toolbar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_farm_detail)

        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        toolbar!!.setTitleTextColor(0xFF000000.toInt())
        toolbar!!.title = " "

        toolbarImage.setImageResource(intent.getIntExtra("farm_img",0))
        detail_farmLocation.setText(intent.getStringExtra("farm_location"))
        detail_farmName.setText(intent.getStringExtra("farm_name"))
        detail_farmPrice.setText(intent.getStringExtra("farm_price"))
        detail_farmDays.setText(intent.getStringExtra("farm_days"))
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        var menuInflater = getMenuInflater()
        menuInflater!!.inflate(R.menu.menu_farmdetail, menu)

        var bookmark : Drawable = menu!!.getItem(0).icon
        bookmark.setColorFilter(0xFFFFFFFF.toInt(), PorterDuff.Mode.MULTIPLY)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item!!.itemId){
            R.id.menu_detail_bookmark -> {
//                val intent = Intent(applicationContext, FarmDetailActivity::class.java)
//                startActivity(intent)
            }
        }

        return false
    }
}
