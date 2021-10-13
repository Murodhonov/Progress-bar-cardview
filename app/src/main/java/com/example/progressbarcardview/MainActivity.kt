package com.example.progressbarcardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var i = 0
        var i2 = 0
        var i3 = 0
        var index = 100
        var index2 = 100
        var index3 = 100

        val handler = Handler()
        handler.post(object : Runnable {
            override fun run() {

                indicator1.progress++

                txt1.text = indicator1.progress.toString()

                if (index != i) {
                    handler.postDelayed(this, 100)
                }else{
                    Toast.makeText(this@MainActivity, "Tugadi !", Toast.LENGTH_SHORT).show()
                }
                i++
            }
        })



        val handler2 = Handler()
        handler2.post(object : Runnable {
            override fun run() {

                indicator2.progress++

                txt2.text = indicator2.progress.toString()

                if (index2 != i2) {
                    handler2.postDelayed(this, 200)
                }else{
                    Toast.makeText(this@MainActivity, "Tugadi !", Toast.LENGTH_SHORT).show()
                }
                i2++
            }
        })

        val handler3 = Handler()
        handler3.post(object : Runnable {
            override fun run() {

                indicator3.progress++

                txt3.text = indicator3.progress.toString()

                if (index3 != i3) {
                    handler3.postDelayed(this, 50)
                }else{
                    Toast.makeText(this@MainActivity, "Tugadi !", Toast.LENGTH_SHORT).show()
                }
                i3++
            }
        })

    }
}