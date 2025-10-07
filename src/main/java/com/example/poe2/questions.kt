package com.example.assignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.poe2.R

class questions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        val questionsView=findViewById<TextView>(R.id.questionsView)
        val feedbackView=findViewById<TextView>(R.id.feedbackView)
        val falseButton=findViewById<Button>(R.id.falseButton)
        val trueButton=findViewById<Button>(R.id.trueButton)
        val questionsButton=findViewById<Button>(R.id.questionsButton)



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
            true,
            false,
            true,
            true,
            false,
            true,
            true,
           true,
            false,
            true
        )

        var currentquestionNum = 0
        var  scores = 0
        questionsView.text = questionsList[currentquestionNum]

        trueButton.setOnClickListener {
            if (answerList[currentquestionNum]== true){

                scores++
                feedbackView.text= "Congrats! You are correct!!"

            }
        }


        falseButton.setOnClickListener {
            if (answerList[currentquestionNum] == false){

                scores++
                feedbackView.text = "Congrats! Your Answer is correct"
            }else{
                feedbackView.text = "eish, please try again!!"
            }
        }

        questionsButton.setOnClickListener {

            currentquestionNum++
            if(currentquestionNum < questionsList.size){
                questionsView.text = questionsList[currentquestionNum]
            }

            else{
                val intent = Intent(this,Score::class.java)
                intent.putExtra("score", scores)
                intent.putExtra("total", 10)
                startActivity(intent)

            }
        }





    }
}