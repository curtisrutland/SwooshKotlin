package com.curtisrutland.swoosh

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View

class LeagueActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun nextClicked(view: View) {
        Log.i("LEAGUE", "next clicked")
        startActivity(Intent(this, SkillActivity::class.java))
    }
}
