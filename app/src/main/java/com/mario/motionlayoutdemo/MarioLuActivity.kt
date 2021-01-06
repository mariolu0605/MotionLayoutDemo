package com.mario.motionlayoutdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.constraintlayout.motion.widget.MotionLayout.DEBUG_SHOW_PATH

class MarioLuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mario_lu)
        findViewById<Button>(R.id.showDebug).setOnClickListener {
            findViewById<MotionLayout>(R.id.motionLayout).setDebugMode(DEBUG_SHOW_PATH)
        }
    }
}
