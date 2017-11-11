package com.curtisrutland.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.curtisrutland.swoosh.R
import com.curtisrutland.swoosh.model.Player
import com.curtisrutland.swoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
        Log.d("incoming player", player.toString())
    }

    fun onBeginnerClick(view: View) {
        ballerBtn.isChecked = false
        player.skill = "beginner"
    }

    fun onBallerClick(view: View) {
        beginnerBtn.isChecked = false
        player.skill = "baller"
    }

    fun onFinishClick(view: View) {
        if(player.skill != "") {
            val activity = Intent(this, FinishActivity::class.java)
            activity.putExtra(EXTRA_PLAYER, player)
            startActivity(activity)
        } else {
            Toast.makeText(this, "Select a skill.", Toast.LENGTH_SHORT).show()
        }
    }
}
