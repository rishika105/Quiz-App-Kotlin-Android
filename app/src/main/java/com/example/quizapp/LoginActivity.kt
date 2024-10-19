package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private lateinit var databaseHelper: DatabaseHelper
    private val TAG = "LoginActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate: Starting LoginActivity")
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d(TAG, "onCreate: ContentView set")

        databaseHelper = DatabaseHelper(this)

        binding.loginButton.setOnClickListener {
            Log.d(TAG, "Login button clicked")
            val email = binding.loginEmail.text.toString()
            val password = binding.loginPassword.text.toString()

            if (email.isBlank() || password.isBlank()) {
                Toast.makeText(this, "All fields are mandatory", Toast.LENGTH_SHORT).show()
            } else {
                if (databaseHelper.checkEmailPassword(email, password)) {
                    Toast.makeText(this, "Login Successfully!", Toast.LENGTH_SHORT).show()
                    Log.d(TAG, "Login successful, starting MainActivity")
                    val intent = Intent(this, MainActivity::class.java)
                    intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                    startActivity(intent)
                    finish() // This will close the LoginActivity
                } else {
                    Toast.makeText(this, "Invalid Credentials", Toast.LENGTH_SHORT).show()
                    Log.d(TAG, "Login failed: Invalid credentials")
                }
            }
        }

        binding.signupRedirectText.setOnClickListener {
            Log.d(TAG, "Signup redirect clicked, starting SignupActivity")
            startActivity(Intent(this, SignupActivity::class.java))
        }
    }
}