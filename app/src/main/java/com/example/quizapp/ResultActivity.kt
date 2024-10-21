package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val userName = intent.getStringExtra(Constants.USER_NAME)
        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val score = intent.getIntExtra(Constants.SCORE, 0)
        val quizType = intent.getStringExtra(Constants.QUIZ_TYPE)

        val congratulationsTv = findViewById<TextView>(R.id.congratulationsTv)
        val scoreTv = findViewById<TextView>(R.id.scoreTv)

        congratulationsTv.text = "Congratulations, $userName!"
        scoreTv.text = "Your score is $score out of $totalQuestions"

        val btnRestart = findViewById<Button>(R.id.btnRestart)
        btnRestart.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

        val btnGoToDashboard = findViewById<Button>(R.id.btnGoToDashboard)
        btnGoToDashboard.setOnClickListener {
            startActivity(Intent(this, QuizTypeActivity::class.java))
            finish()
        }
    }
}