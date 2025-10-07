package com.example.assignment2

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import com.example.poe2.R
import kotlin.text.StringBuilder

class Score : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        val scoreView = findViewById<TextView>(R.id.scoreView)
        val msgtextView = findViewById<TextView>(R.id.msgtextView)
        val reviewView = findViewById<TextView>(R.id.reviewView)
        val reviewButton = findViewById<Button>(R.id.reviewButton)
        val exitButton = findViewById<Button>(R.id.exitButton)
        val retryButton = findViewById<Button>(R.id.retryButton)
        val score = intent.getIntExtra("score", 0)
        val totalquestions = intent.getIntExtra("Total-Questions", 10)

        scoreView.text = " Your score is: ${score} out of ${totalquestions}"

        if ( score >= 7){
            msgtextView.text = "That was a great performance!!"
        } else{

            msgtextView.text = "You will get it next time."
        }

        val questionsList = listOf(
            "The Great Fire of London occurred in 1666.",
            "The ancient city of Pompeii was destroyed by a tsunami. ",
            "The Pyramids of Giza were built as tombs for the pharaohs of Ancient Egypt.",
            "The Roman Empire was founded by Julius Caesar." ,
            "The Treaty of Versailles was signed in 1918.",
            "The ancient city of Troy was a mythical place.",
            "The Great Depression began in 1929.",
            "The Rosetta Stone was discovered by Napoleon's soldiers.",
            " The Battle of Hastings took place in 1065.",
            "The Indus Valley Civilization was located in modern-day China."


        )

        val answerList = listOf(
            true, // The Great Fire of London occurred in 1666.
            false, // The ancient city of Pompeii was destroyed by a tsunami.
            true, //The Pyramids of Giza were built as tombs for the pharaohs of Ancient Egypt.
            true, //The Roman Empire was founded by Julius Caesar.
            false, ///The Treaty of Versailles was signed in 1918
            true, //The ancient city of Troy was a mythical place.
            true, //The Great Depression began in 1929.
            true, //The Rosetta Stone was discovered by Napoleon's soldiers
            false, //The Battle of Hastings took place in 1065.
            true //The Indus Valley Civilization was located in modern-day China.
        )

        reviewButton.setOnClickListener {

            val reviewtextview = StringBuilder()
            for (i in questionsList.indices){
                reviewtextview.append("Question ${i + 1}: ${questionsList[i]}\n")
                reviewtextview.append("Correct answer: ${if (answerList[i]) "True" else "False"}\n")
                reviewView.text = reviewtextview.toString()
            }


        }

        retryButton.setOnClickListener {
            val intent = Intent( this,MainActivity::class.java)
            startActivity(intent)
        }

        exitButton.setOnClickListener {
            finishAffinity()
        }

    }
}