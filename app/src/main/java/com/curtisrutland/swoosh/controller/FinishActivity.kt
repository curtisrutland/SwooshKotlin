package com.curtisrutland.swoosh.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.curtisrutland.swoosh.R
import com.curtisrutland.swoosh.model.Player
import com.curtisrutland.swoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {
    //Looking for a co-ed beginner league near you...

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        val player: Player = intent.getParcelableExtra(EXTRA_PLAYER)
        Log.d("incoming player", player.toString())
        searchLeagueTxt.text = "Looking for a ${player.league} ${player.skill} league near you..."
    }
}
