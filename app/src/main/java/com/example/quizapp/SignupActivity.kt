package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapp.databinding.ActivitySignupBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class SignupActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignupBinding
    private lateinit var databaseHelper: DatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        databaseHelper = DatabaseHelper(this)

        binding.signupButton.setOnClickListener {
            performSignUp()
        }

        binding.loginRedirectText.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }

    private fun performSignUp() {
        val email = binding.signupEmail.text.toString().trim()
        val password = binding.signupPassword.text.toString().trim()
        val confirmPassword = binding.signupConfirm.text.toString().trim()

        if (email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            Toast.makeText(this, "All fields are mandatory", Toast.LENGTH_SHORT).show()
        } else {
            if (password == confirmPassword) {
                CoroutineScope(Dispatchers.IO).launch {
                    val checkUserEmail = databaseHelper.checkEmail(email)
                    if (!checkUserEmail) {
                        val insert = databaseHelper.insertData(email, password)
                        withContext(Dispatchers.Main) {
                            if (insert) {
                                Toast.makeText(this@SignupActivity, "Signup Successful", Toast.LENGTH_SHORT).show()
                                val intent = Intent(this@SignupActivity, LoginActivity::class.java)
                                startActivity(intent)
                                finish()
                            } else {
                                Toast.makeText(this@SignupActivity, "Signup Failed!", Toast.LENGTH_SHORT).show()
                            }
                        }
                    } else {
                        withContext(Dispatchers.Main) {
                            Toast.makeText(this@SignupActivity, "User already exists! Please login", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            } else {
                Toast.makeText(this, "Passwords do not match!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}