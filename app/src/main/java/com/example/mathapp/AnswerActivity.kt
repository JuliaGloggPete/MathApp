package com.example.mathapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.indexOf
import android.util.Log
import android.view.animation.Animation
import android.view.animation.AnimationUtils
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
        Log.d("HHH", "R??tt $answeredCorrect")
        val question = intent.getStringExtra("questionInQuestion")
        val rightAnswer = intent.getStringExtra("correction")
        val firstnumber = intent.getIntExtra("firstN", 0)
        val secondnumber = intent.getIntExtra("secondN",0)
        val mathFunktion = intent.getIntExtra("mathfunktion",0)



        // if r??tt kan jag s??tta att button ??r bara back


        // image1.setBackgroundResource(R.drawable.tomatoe)
        if (answeredCorrect) {
            resultView.text = "R??????tt"
        } else {
            resultView.text = "Tyv??rr fel"
            rightAnswerView.text = "$question = $rightAnswer"
            if(mathFunktion==3){

                val intent = Intent(this, MultiplicationActivity::class.java)

            }

            if(mathFunktion == 1){
            var i = 0
           while ( i< firstnumber)   {

                        ImageArrayList.get(i).setBackgroundResource(R.drawable.tomatoe)
                      i++
                }
            var j = 0
            while ( j< secondnumber)   {

                        leftImageArrayList.get(j).setBackgroundResource(R.drawable.tomatoe)
                    j++
                }
            }

            if(mathFunktion == 2){
                var i = 0
                if (firstnumber>secondnumber){
                  val  result = firstnumber - secondnumber
                while ( i< result)   {
                ImageArrayList.get(i).setBackgroundResource(R.drawable.tomatoe)
                i++
            }
            var j = 0
            while ( j< secondnumber)   {

                leftImageArrayList.get(j).setBackgroundResource(R.drawable.notomato)
                j++
            }}
                else { var i = 0
                    val result = secondnumber-firstnumber

                        while ( i< result)   {
                            ImageArrayList.get(i).setBackgroundResource(R.drawable.tomatoe)
                            i++
                        }
                        var j = 0
                        while ( j< firstnumber)   {

                            leftImageArrayList.get(j).setBackgroundResource(R.drawable.notomato)
                            j++
                        }




                }


        }


        }

        //AnimationUtils.loadAnimation(applicationContext,R.anim.fade_in);

        /// + ??r l??st - minus - f??rst m??ste jag ??ndra till att det inte kan blir minus belopp,
        // sen antingen r??knar jag i hop och s??tta alla ??pple och stryka ??ver de som ska bort
        // det kan jag g??ra genom att byta ??pple bilden med ett ??verstrykit ??pple
        // hade varit kul om jag kunde fada out ??pplen - jag vill dock att alla ??pplen dvs tomater syns
        // samanh??ngande.... s?? egentligen vil ja ju sen backifr??n ta bort - eller egentligen funkar det framifr??n med
            // ....


    }

    private fun setFeatureDrawable(i: Int, tomatoe: Int) {

    }
    //fun indexOf(element: E):Int{}

    // launcher Activity betyder att den ??r den f??rsta - s?? det ska inte den vaera


}
