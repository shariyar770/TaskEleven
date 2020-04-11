package com.example.task11

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.ScrollView
import androidx.core.view.marginEnd
import androidx.core.view.marginStart
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var myScroll= ScrollView(this)
        val linearLayout : LinearLayout = LinearLayout(this)
        linearLayout.orientation=LinearLayout.VERTICAL
        setContentView(linearLayout)
        linearLayout.setBackgroundResource(R.color.color1)
       val layout1=LinearLayout(this)
       layout1.orientation=LinearLayout.HORIZONTAL
       val layout2=LinearLayout(this)
        layout2.orientation=LinearLayout.VERTICAL
        layout2.weightSum= 3F
       val layout3=LinearLayout(this)
        layout3.orientation=LinearLayout.VERTICAL
        layout3.weightSum=3F
        val button1 = Button(this)
        button1.text="Left"
        val button2 = Button(this)
        button2.text="Center"
        val button3 = Button(this)
        button3.text="Right"
        val button4 = Button(this)
        button4.text="Delete"


        val buttonLP1=LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)
        val buttonLP2=LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)
        val buttonLP3=LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)
        val buttonLP4=LinearLayout.LayoutParams(toInt(250), toInt(60))
        buttonLP1.gravity=Gravity.START
        buttonLP2.gravity=Gravity.CENTER_HORIZONTAL
        buttonLP3.gravity=Gravity.END
        buttonLP4.gravity=Gravity.CENTER
        buttonLP1.weight=1F
        buttonLP2.weight=1F
        buttonLP3.weight=1F
        buttonLP1.setMargins(10,10,10,10)
        buttonLP2.setMargins(10,10,10,10)
        buttonLP3.setMargins(10,10,10,10)
        buttonLP4.setMargins(10,10,10,10)

        button1.layoutParams=buttonLP1
        button2.layoutParams=buttonLP2
        button3.layoutParams=buttonLP3
        button4.layoutParams=buttonLP4

        button1.setBackgroundResource(R.drawable.button_style)
        button2.setBackgroundResource(R.drawable.button_style)
        button3.setBackgroundResource(R.drawable.button_style)
        button4.setBackgroundResource(R.drawable.button_style)


        button1.setOnClickListener{
            var buttonLeft=Button(this)
            buttonLeft.layoutParams=buttonLP1
            var a= Random.nextInt(5)
            when(a){
                1-> buttonLeft.setBackgroundResource(R.color.color3)
                2-> buttonLeft.setBackgroundResource(R.color.color4)
                3-> buttonLeft.setBackgroundResource(R.color.color5)
                else -> buttonLeft.setBackgroundResource(R.color.color6)
            }
            layout3.addView(buttonLeft)
                myScroll.scrollBy(0, +1000);

        }

        button2.setOnClickListener{
            var buttonCenter=Button(this)
            buttonCenter.layoutParams=buttonLP2

            var a= Random.nextInt(5)
            when(a){
                1-> buttonCenter.setBackgroundResource(R.color.color3)
                2-> buttonCenter.setBackgroundResource(R.color.color4)
                3-> buttonCenter.setBackgroundResource(R.color.color5)
                else -> buttonCenter.setBackgroundResource(R.color.color6)
            }
            layout3.addView(buttonCenter)
                myScroll.scrollBy(0, +1000);

        }

        button3.setOnClickListener{
            var buttonRights=Button(this)
            buttonRights.layoutParams=buttonLP3

            var a= Random.nextInt(5)
            when(a){
                1-> buttonRights.setBackgroundResource(R.color.color3)
                2-> buttonRights.setBackgroundResource(R.color.color4)
                3-> buttonRights.setBackgroundResource(R.color.color5)
                else -> buttonRights.setBackgroundResource(R.color.color6)
            }
            layout3.addView(buttonRights)
                myScroll.scrollBy(0, +1000);

        }

        button4.setOnClickListener{
            layout3.removeAllViews()
        }

        myScroll.addView(layout3)

        layout1.addView(button1)
        layout1.addView(button2)
        layout1.addView(button3)
        layout2.addView(button4)
        linearLayout.addView(layout1)
        linearLayout.addView(layout2)
        linearLayout.addView(myScroll)
    }

    fun toInt(param: Int) : Int {
        return (param * Resources.getSystem().displayMetrics.density+0.5f).toInt()
    }
}
