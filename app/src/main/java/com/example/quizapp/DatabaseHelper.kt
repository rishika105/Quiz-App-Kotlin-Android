package com.example.quizapp

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        const val DATABASE_NAME = "SignLog.db"
        const val DATABASE_VERSION = 2  // Increased to match the current version
        const val TABLE_NAME = "users"
        const val COLUMN_ID = "id"
        const val COLUMN_EMAIL = "email"
        const val COLUMN_PASSWORD = "password"
    }

    override fun onCreate(db: SQLiteDatabase) {
        val createTable = """
            CREATE TABLE $TABLE_NAME (
                $COLUMN_ID INTEGER PRIMARY KEY AUTOINCREMENT,
                $COLUMN_EMAIL TEXT NOT NULL,
                $COLUMN_PASSWORD TEXT NOT NULL
            )
        """.trimIndent()
        db.execSQL(createTable)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        // Handle database upgrades here
        if (oldVersion < 2) {
            // Add any necessary migrations for version 2
            // For example, if you added a new column in version 2:
            // db.execSQL("ALTER TABLE $TABLE_NAME ADD COLUMN new_column TEXT")
        }
        // Add more conditions for future versions if needed
    }

    // Function to insert a new user into the database
    fun insertData(email: String, password: String): Boolean {
        val db = writableDatabase
        val contentValues = ContentValues().apply {
            put(COLUMN_EMAIL, email)
            put(COLUMN_PASSWORD, password)
        }
        val result = db.insert(TABLE_NAME, null, contentValues)
        db.close()
        return result != -1L
    }

    // Function to check if an email already exists in the database
    fun checkEmail(email: String): Boolean {
        val db = readableDatabase
        val cursor = db.rawQuery("SELECT $COLUMN_EMAIL FROM $TABLE_NAME WHERE $COLUMN_EMAIL = ?", arrayOf(email))
        val exists = cursor.count > 0
        cursor.close()
        db.close()
        return exists
    }

    // Function to check if email and password match
    fun checkEmailPassword(email: String, password: String): Boolean {
        val db = readableDatabase
        val cursor = db.rawQuery(
            "SELECT $COLUMN_EMAIL FROM $TABLE_NAME WHERE $COLUMN_EMAIL = ? AND $COLUMN_PASSWORD = ?",
            arrayOf(email, password)
        )
        val exists = cursor.count > 0
        cursor.close()
        db.close()
        return exists
    }
}