package com.example.testcalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button0.setOnClickListener{
            textView.text=textView.text.toString()+"0"
        }
        button1.setOnClickListener{
            textView.text=textView.text.toString()+"1"
        }
        button2.setOnClickListener{
            textView.text=textView.text.toString()+"2"
        }
        button3.setOnClickListener{
            textView.text=textView.text.toString()+"3"
        }
        button4.setOnClickListener{
            textView.text=textView.text.toString()+"4"
        }
        button5.setOnClickListener{
            textView.text=textView.text.toString()+"5"
        }
        button6.setOnClickListener{
            textView.text=textView.text.toString()+"6"
        }
        button7.setOnClickListener{
            textView.text=textView.text.toString()+"7"
        }
        button8.setOnClickListener{
            textView.text=textView.text.toString()+"8"
        }
        button9.setOnClickListener{
            textView.text=textView.text.toString()+"9"
        }
        buttonMinus.setOnClickListener{
            textView.text=textView.text.toString()+"-"
        }
        buttonPlus.setOnClickListener{
            textView.text=textView.text.toString()+"+"
        }
        buttonMnoj.setOnClickListener{
            textView.text=textView.text.toString()+"*"
        }
        buttonDiv.setOnClickListener{
            textView.text=textView.text.toString()+"/"
        }
        buttonResult.setOnClickListener{
            textView.text="Не готово"
        }
    }
}
