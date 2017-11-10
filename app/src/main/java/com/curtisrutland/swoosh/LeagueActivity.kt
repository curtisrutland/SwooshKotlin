package com.curtisrutland.swoosh

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onNextClicked(view: View) {
        if(selectedLeague != "") {
            Log.i("LEAGUE", "next clicked")
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }
    }

    fun onMenClicked(view: View) {
        womensLeagueBtn.isChecked = false
        coedsBtn.isChecked = false
        selectedLeague = "mens"
    }

    fun onWomenClicked(view: View) {
        mensLeagueBtn.isChecked  = false
        coedsBtn.isChecked = false
        selectedLeague = "womens"
    }

    fun onCoedClicked(view: View) {
        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false
        selectedLeague = "coed"
    }
}
