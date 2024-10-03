package com.example.quizapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class QuizTypeActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_type)

        val userName = intent.getStringExtra(Constants.USER_NAME)

        val btnFlags = findViewById<Button>(R.id.btnFlags)
        val btnGeneralKnowledge = findViewById<Button>(R.id.btnGeneralKnowledge)
        val btnVerbal = findViewById<Button>(R.id.btnVerbal)
        val btnReasoning = findViewById<Button>(R.id.btnReasoning)

        btnFlags.setOnClickListener {
            val intent = Intent(this, QuizQuestionsActivity::class.java)
            intent.putExtra(Constants.USER_NAME, userName)
            intent.putExtra(Constants.QUIZ_TYPE, Constants.QuizType.FLAGS.toString())
            startActivity(intent)
            finish()
        }

        btnGeneralKnowledge.setOnClickListener {
            val intent = Intent(this, QuizQuestionsActivity::class.java)
            intent.putExtra(Constants.USER_NAME, userName)
            intent.putExtra(Constants.QUIZ_TYPE, Constants.QuizType.GENERAL_KNOWLEDGE.toString())
            startActivity(intent)
            finish()
        }

        btnVerbal.setOnClickListener {
            val intent = Intent(this, QuizQuestionsActivity::class.java)
            intent.putExtra(Constants.USER_NAME, userName)
            intent.putExtra(Constants.QUIZ_TYPE, Constants.QuizType.VERBAL.toString())
            startActivity(intent)
            finish()
        }

        btnReasoning.setOnClickListener {
            val intent = Intent(this, QuizQuestionsActivity::class.java)
            intent.putExtra(Constants.USER_NAME, userName)
            intent.putExtra(Constants.QUIZ_TYPE, Constants.QuizType.REASONING.toString())
            startActivity(intent)
            finish()
        }
    }
}