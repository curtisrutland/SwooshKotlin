package com.curtisrutland.swoosh.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.curtisrutland.swoosh.R
import com.curtisrutland.swoosh.Utilities.EXTRA_LEAGUE
import com.curtisrutland.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    var league = ""
    var skill = ""

    //Looking for a co-ed beginner league near you...

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeagueTxt.text = "Looking for a $league $skill league near you..."
    }
}
