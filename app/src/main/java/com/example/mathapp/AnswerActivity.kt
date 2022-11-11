package com.example.mathapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.indexOf
import android.util.Log
import android.widget.ImageView
import android.widget.TextView

class AnswerActivity : AppCompatActivity() {

    lateinit var resultView: TextView
    lateinit var rightAnswerView: TextView
    lateinit var image1: ImageView
    lateinit var image2: ImageView
    lateinit var image3: ImageView
    lateinit var image4: ImageView
    lateinit var image5: ImageView
    lateinit var image6: ImageView
    lateinit var image7: ImageView
    lateinit var image8: ImageView
    lateinit var image9: ImageView
    lateinit var image10: ImageView
    lateinit var image11: ImageView
    lateinit var image12: ImageView
    lateinit var image13: ImageView
    lateinit var image14: ImageView
    lateinit var image15: ImageView
    lateinit var image16: ImageView
    lateinit var image17: ImageView
    lateinit var image18: ImageView
    lateinit var image19: ImageView
    lateinit var image20: ImageView





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer)

        resultView = findViewById(R.id.AnswerView)
        rightAnswerView = findViewById(R.id.rightAnswer)
        image1 = findViewById<ImageView>(R.id.left1)
        image2 = findViewById<ImageView>(R.id.left2)
        image3 = findViewById<ImageView>(R.id.left3)
        image4 = findViewById<ImageView>(R.id.left4)
        image5 = findViewById<ImageView>(R.id.left5)
        image6 = findViewById<ImageView>(R.id.left6)
        image7 = findViewById<ImageView>(R.id.left7)
        image8 = findViewById<ImageView>(R.id.left8)
        image9 = findViewById<ImageView>(R.id.left9)
        image10 = findViewById<ImageView>(R.id.left10)
        image11 = findViewById<ImageView>(R.id.right1)
        image12 = findViewById<ImageView>(R.id.right2)
        image13 = findViewById<ImageView>(R.id.right3)
        image14 = findViewById<ImageView>(R.id.right4)
        image15 = findViewById<ImageView>(R.id.right5)
        image16 = findViewById<ImageView>(R.id.right6)
        image17 = findViewById<ImageView>(R.id.right7)
        image18 = findViewById<ImageView>(R.id.right8)
        image19 = findViewById<ImageView>(R.id.right9)
        image20 = findViewById<ImageView>(R.id.right10)

        val ImageArrayList: ArrayList<ImageView> = ArrayList<ImageView>(10)
        ImageArrayList.add(0,image1)
        ImageArrayList.add(1,image2)
        ImageArrayList.add(2,image3)
        ImageArrayList.add(3,image4)
        ImageArrayList.add(4,image5)
        ImageArrayList.add(5,image6)
        ImageArrayList.add(6,image7)
        ImageArrayList.add(7,image8)
        ImageArrayList.add(8,image9)
        ImageArrayList.add(9,image10)
        val leftImageArrayList: ArrayList<ImageView> = ArrayList<ImageView>(10)
        leftImageArrayList.add(0,image11)
        leftImageArrayList.add(1,image12)
        leftImageArrayList.add(2,image13)
        leftImageArrayList.add(3,image14)
        leftImageArrayList.add(4,image15)
        leftImageArrayList.add(5,image16)
        leftImageArrayList.add(6,image17)
        leftImageArrayList.add(7,image18)
        leftImageArrayList.add(8,image19)
        leftImageArrayList.add(9,image20)


        val answeredCorrect = intent.getBooleanExtra("answeredCorrect", false)
        Log.d("HHH", "Rätt $answeredCorrect")
        val question = intent.getStringExtra("questionInQuestion")
        val rightAnswer = intent.getStringExtra("correction")
        val firstnumber = intent.getIntExtra("firstN", 0)
        val secondnumber = intent.getIntExtra("secondN",0)
        // image1.setBackgroundResource(R.drawable.tomatoe)
        if (answeredCorrect) {
            resultView.text = "Rääätt"
        } else {
            resultView.text = "Tyvärr fel"
            rightAnswerView.text = "$question = $rightAnswer"
            var i = 0
            var j = 0
           while ( i< firstnumber)   {
       if( i < firstnumber)
                        ImageArrayList.get(i).setBackgroundResource(R.drawable.tomatoe)
                      i++
                }


            /*while ( j< secondnumber)   {


                    if( j < secondnumber)
                        ImageArrayList.get(j).setBackgroundResource(R.drawable.tomatoe)
                    i++
                } */



            // eller for (item in arrayList){ if (index =< firstnumber-1}




           /* if (firstnumber == 1) {
                image1.setBackgroundResource(R.drawable.tomatoe)
            }
            if (firstnumber == 2) {
                image1.setBackgroundResource(R.drawable.tomatoe)
                image2.setBackgroundResource(R.drawable.tomatoe)
            }
            if (firstnumber == 3) {
                image1.setBackgroundResource(R.drawable.tomatoe)
                image2.setBackgroundResource(R.drawable.tomatoe)
                image3.setBackgroundResource(R.drawable.tomatoe)
            }
            if (firstnumber == 4) {
                image1.setBackgroundResource(R.drawable.tomatoe)
                image2.setBackgroundResource(R.drawable.tomatoe)
                image3.setBackgroundResource(R.drawable.tomatoe)
                image4.setBackgroundResource(R.drawable.tomatoe)
            }
            if (firstnumber == 5) {
                image1.setBackgroundResource(R.drawable.tomatoe)
                image2.setBackgroundResource(R.drawable.tomatoe)
                image3.setBackgroundResource(R.drawable.tomatoe)
                image5.setBackgroundResource(R.drawable.tomatoe)
                image4.setBackgroundResource(R.drawable.tomatoe)
            }
            if (firstnumber == 6) {
                image1.setBackgroundResource(R.drawable.tomatoe)
                image2.setBackgroundResource(R.drawable.tomatoe)
                image3.setBackgroundResource(R.drawable.tomatoe)
                image5.setBackgroundResource(R.drawable.tomatoe)
                image4.setBackgroundResource(R.drawable.tomatoe)
                image6.setBackgroundResource(R.drawable.tomatoe)
            }
            if (firstnumber == 7) {
                image1.setBackgroundResource(R.drawable.tomatoe)
                image2.setBackgroundResource(R.drawable.tomatoe)
                image3.setBackgroundResource(R.drawable.tomatoe)
                image5.setBackgroundResource(R.drawable.tomatoe)
                image4.setBackgroundResource(R.drawable.tomatoe)
                image6.setBackgroundResource(R.drawable.tomatoe)
                image7.setBackgroundResource(R.drawable.tomatoe)

            }
            if (firstnumber == 8) {
                image1.setBackgroundResource(R.drawable.tomatoe)
                image2.setBackgroundResource(R.drawable.tomatoe)
                image3.setBackgroundResource(R.drawable.tomatoe)
                image5.setBackgroundResource(R.drawable.tomatoe)
                image4.setBackgroundResource(R.drawable.tomatoe)
                image6.setBackgroundResource(R.drawable.tomatoe)
                image7.setBackgroundResource(R.drawable.tomatoe)
                image8.setBackgroundResource(R.drawable.tomatoe)
            }
            if (firstnumber == 9) {
                image1.setBackgroundResource(R.drawable.tomatoe)
                image2.setBackgroundResource(R.drawable.tomatoe)
                image3.setBackgroundResource(R.drawable.tomatoe)
                image5.setBackgroundResource(R.drawable.tomatoe)
                image4.setBackgroundResource(R.drawable.tomatoe)
                image6.setBackgroundResource(R.drawable.tomatoe)
                image7.setBackgroundResource(R.drawable.tomatoe)
                image8.setBackgroundResource(R.drawable.tomatoe)
                image9.setBackgroundResource(R.drawable.tomatoe)
            }
            if (firstnumber == 10) {
                image1.setBackgroundResource(R.drawable.tomatoe)
                image2.setBackgroundResource(R.drawable.tomatoe)
                image3.setBackgroundResource(R.drawable.tomatoe)
                image5.setBackgroundResource(R.drawable.tomatoe)
                image4.setBackgroundResource(R.drawable.tomatoe)
                image6.setBackgroundResource(R.drawable.tomatoe)
                image7.setBackgroundResource(R.drawable.tomatoe)
                image8.setBackgroundResource(R.drawable.tomatoe)
                image9.setBackgroundResource(R.drawable.tomatoe)
                image10.setBackgroundResource(R.drawable.tomatoe)
            }
            if (secondnumber == 10) {


                image11.setBackgroundResource(R.drawable.tomatoe)
                image12.setBackgroundResource(R.drawable.tomatoe)
                image13.setBackgroundResource(R.drawable.tomatoe)
                image14.setBackgroundResource(R.drawable.tomatoe)
                image15.setBackgroundResource(R.drawable.tomatoe)
                image16.setBackgroundResource(R.drawable.tomatoe)
                image17.setBackgroundResource(R.drawable.tomatoe)
                image18.setBackgroundResource(R.drawable.tomatoe)
                image19.setBackgroundResource(R.drawable.tomatoe)
                image20.setBackgroundResource(R.drawable.tomatoe)


            }
            if (secondnumber == 9) {
                image11.setBackgroundResource(R.drawable.tomatoe)
                image12.setBackgroundResource(R.drawable.tomatoe)
                image13.setBackgroundResource(R.drawable.tomatoe)
                image14.setBackgroundResource(R.drawable.tomatoe)
                image15.setBackgroundResource(R.drawable.tomatoe)
                image16.setBackgroundResource(R.drawable.tomatoe)
                image17.setBackgroundResource(R.drawable.tomatoe)
                image18.setBackgroundResource(R.drawable.tomatoe)
                image19.setBackgroundResource(R.drawable.tomatoe)

            }
           if (secondnumber == 8) {
                image11.setBackgroundResource(R.drawable.tomatoe)
                image12.setBackgroundResource(R.drawable.tomatoe)
                image13.setBackgroundResource(R.drawable.tomatoe)
                image14.setBackgroundResource(R.drawable.tomatoe)
                image15.setBackgroundResource(R.drawable.tomatoe)
                image16.setBackgroundResource(R.drawable.tomatoe)
                image17.setBackgroundResource(R.drawable.tomatoe)
                image18.setBackgroundResource(R.drawable.tomatoe)

            }
            if (secondnumber == 7) {
                image11.setBackgroundResource(R.drawable.tomatoe)
                image12.setBackgroundResource(R.drawable.tomatoe)
                image13.setBackgroundResource(R.drawable.tomatoe)
                image14.setBackgroundResource(R.drawable.tomatoe)
                image15.setBackgroundResource(R.drawable.tomatoe)
                image16.setBackgroundResource(R.drawable.tomatoe)
                image17.setBackgroundResource(R.drawable.tomatoe)

            }
            if (secondnumber == 6) {
                image11.setBackgroundResource(R.drawable.tomatoe)
                image12.setBackgroundResource(R.drawable.tomatoe)
                image13.setBackgroundResource(R.drawable.tomatoe)
                image14.setBackgroundResource(R.drawable.tomatoe)
                image15.setBackgroundResource(R.drawable.tomatoe)
                image16.setBackgroundResource(R.drawable.tomatoe)
            }
            if (secondnumber == 5) {
                image11.setBackgroundResource(R.drawable.tomatoe)
                image12.setBackgroundResource(R.drawable.tomatoe)
                image13.setBackgroundResource(R.drawable.tomatoe)
                image14.setBackgroundResource(R.drawable.tomatoe)
                image15.setBackgroundResource(R.drawable.tomatoe)
            }
            if (secondnumber == 4) {
                image11.setBackgroundResource(R.drawable.tomatoe)
                image12.setBackgroundResource(R.drawable.tomatoe)
                image13.setBackgroundResource(R.drawable.tomatoe)
                image14.setBackgroundResource(R.drawable.tomatoe)
            }
            if (secondnumber == 3) {
                image11.setBackgroundResource(R.drawable.tomatoe)
                image12.setBackgroundResource(R.drawable.tomatoe)
                image13.setBackgroundResource(R.drawable.tomatoe)

            }
               if (secondnumber == 2) {
                image11.setBackgroundResource(R.drawable.tomatoe)
                image12.setBackgroundResource(R.drawable.tomatoe)
            }
                  if (secondnumber == 1) {
                image11.setBackgroundResource(R.drawable.tomatoe)

            }*/




        }}

    private fun setFeatureDrawable(i: Int, tomatoe: Int) {

    }
    //fun indexOf(element: E):Int{}

    // launcher Activity betyder att den är den första - sä det ska inte den vaera


}
