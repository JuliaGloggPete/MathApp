package com.example.mathapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var questionTextView: TextView
    lateinit var answerView: EditText
    var firstNumber = 0
    var secondNumber = 0
    var thirdNumber = 0
    var wrongAnswerAddtion = 0
    var wrongAnswerMultiplication = 0
    var wrongAnswerDivision = 0
    var wrongAnswerSubstraction = 0

    var numberForMathfunktion = 0
    var correctAnswer = 0
    lateinit var roundWinCounter: TextView

    var question = ""

    var rounds = 0
    var rightAnswersCounter = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        roundWinCounter = findViewById(R.id.roundNWinstcounter)

        //intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)


        questionTextView = findViewById(R.id.textView)
        answerView = findViewById(R.id.answerEditText)
        val button = findViewById<Button>(R.id.button2)
        setNewQuestion()
        button.setOnClickListener {

            checkAnswerAndStartAnswerActivity()

        }

    }

    override fun onResume() {
        super.onResume()
        rounds++
     roundWinCounter.text = getString(R.string.RoundView,rounds.toString(),rightAnswersCounter.toString())
        answerView.setText("")
        setNewQuestion()

    }

    fun checkAnswerAndStartAnswerActivity() {
        val answerText = answerView.text.toString()
        val answer = answerText.toIntOrNull()

        when (numberForMathfunktion) {
            1 -> correctAnswer = firstNumber + secondNumber
            2 ->  if(firstNumber >= secondNumber){correctAnswer =firstNumber-secondNumber} else { correctAnswer = secondNumber - firstNumber}
            3 -> correctAnswer = firstNumber * secondNumber
            4 -> correctAnswer = thirdNumber / secondNumber
        }

        // om man svara fel 5 ggr på en funktion


        var answeredCorrect = false


        if (answer == correctAnswer) {
            answeredCorrect = true
          rightAnswersCounter++
        } else  {
            answeredCorrect = false
                when (numberForMathfunktion){
                    1-> wrongAnswerAddtion++
                    2-> wrongAnswerSubstraction++
                    3-> wrongAnswerMultiplication++
                    4-> wrongAnswerDivision++
                }
        }



        val intent = Intent(this, AnswerActivity::class.java)
        intent.putExtra("answeredCorrect", answeredCorrect)
        intent.putExtra("questionInQuestion", question)
        intent.putExtra("correction",correctAnswer.toString())
        intent.putExtra("firstN",firstNumber)
        intent.putExtra("secondN",secondNumber)
        intent.putExtra("mathfunktion",numberForMathfunktion)
        //intent.putExtra( "firstnumb", firstNumber)


        startActivity(intent)

        // det funka inte att göra en editable direkt till en Int
        // utan man måste göra det först till en sträng o sen till int
        // andra aktiviteten sak ska visa upp vad rätt svar var och flrer räkne sätt
        // kanske mer funktioner (kanske slumpa fram -
        //sks sen börjar om


        // sen kolla hur man får bort satt det synst

    }


    fun setNewQuestion(){
        firstNumber = (1..10).random()
        secondNumber = (1..10).random()
        thirdNumber = firstNumber * secondNumber
        numberForMathfunktion = (1..4).random()


        // if sats random tecken 1=+ 2= - 3= / och 4=*

        question = when (numberForMathfunktion) {

            1 -> "$firstNumber + $secondNumber"
            2 ->if(firstNumber >= secondNumber){"$firstNumber - $secondNumber"}
            else { "$secondNumber - $firstNumber"}

            3 -> "$firstNumber * $secondNumber"
            4 ->  "$thirdNumber / $secondNumber"
            else -> ""
        }

        questionTextView?.text = question



    }


}