package com.curtisrutland.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.curtisrutland.swoosh.Utilities.EXTRA_LEAGUE
import com.curtisrutland.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    private var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onNextClicked() {
        if(selectedLeague != "") {
            Log.i("LEAGUE", "next clicked")
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }
    }

    fun onMenClicked() {
        womensLeagueBtn.isChecked = false
        coedsBtn.isChecked = false
        selectedLeague = "men's"
    }

    fun onWomenClicked() {
        mensLeagueBtn.isChecked  = false
        coedsBtn.isChecked = false
        selectedLeague = "women's"
    }

    fun onCoedClicked() {
        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false
        selectedLeague = "co-ed"
    }
}
