package com.curtisrutland.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.curtisrutland.swoosh.R
import com.curtisrutland.swoosh.model.Player
import com.curtisrutland.swoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    private var player = Player("", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMenClicked(view: View) {
        womensLeagueBtn.isChecked = false
        coedsBtn.isChecked = false
        player.league = "men's"
    }

    fun onWomenClicked(view: View) {
        mensLeagueBtn.isChecked  = false
        coedsBtn.isChecked = false
        player.league = "women's"
    }

    fun onCoedClicked(view: View) {
        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false
        player.league = "co-ed"
    }

    fun onNextClicked(view: View) {
        if(player.league != "") {
            Log.i("LEAGUE", "next clicked")
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }
    }
}
