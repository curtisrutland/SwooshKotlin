package com.curtisrutland.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.curtisrutland.swoosh.Utilities.EXTRA_LEAGUE
import com.curtisrutland.swoosh.R
import com.curtisrutland.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        Log.d("incoming league", league)
    }

    fun onBeginnerClick(view: View) {
        ballerBtn.isChecked = false
        skill = "beginner"
    }

    fun onBallerClick(view: View) {
        beginnerBtn.isChecked = false
        skill = "baller"
    }

    fun onFinishClick(view: View) {
        if(skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_SKILL, skill)
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Select a skill.", Toast.LENGTH_SHORT).show()
        }
    }
}
