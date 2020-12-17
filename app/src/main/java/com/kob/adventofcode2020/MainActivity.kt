package com.kob.adventofcode2020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.kob.adventofcode2020.models.Day1
import com.kob.adventofcode2020.models.Day2
import com.kob.adventofcode2020.models.Day3
import com.kob.adventofcode2020.models.Day4
import kotlinx.android.synthetic.main.activity_main.*
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDay1Part1.setOnClickListener {
            Log.e("Day1", "Password is ${Day1.getPassword()}")
            Toast.makeText(
                this, "Password is ${Day1.getPassword()}"
                , Toast.LENGTH_LONG
            ).show()
        }

        btnDay1Part2.setOnClickListener {
            Log.e("Day1", "Password is ${Day1.getPassword2()}")
            Toast.makeText(
                this, "Password is ${Day1.getPassword2()}"
                , Toast.LENGTH_LONG
            ).show()
        }

        btnDay2Part1.setOnClickListener {
            Log.e("Day2", "Password is ${Day1.getPassword()}")
            Toast.makeText(
                this, "Number of match : ${Day2.countMatch()}"
                , Toast.LENGTH_LONG
            ).show()
        }

        btnDay2Part2.setOnClickListener {
            Log.e("Day2", "Password is ${Day1.getPassword2()}")
            Toast.makeText(
                this, "Number of match ${Day2.countMatch2()}"
                , Toast.LENGTH_LONG
            ).show()
        }

        btnDay3Part1.setOnClickListener {
            Log.e("Day3", "Number of Tree : ${Day3.countTrees(3, 1)}")
            Toast.makeText(
                this, "Number of Tree : ${Day3.countTrees(3, 1)}"
                , Toast.LENGTH_LONG
            ).show()
        }

        btnDay3Part2.setOnClickListener {
            val sum = DecimalFormat("###,###,###,###,###,###").format(
                    Day3.countTrees(1, 1)*
                    Day3.countTrees(3, 1)*
                    Day3.countTrees(5, 1)*
                    Day3.countTrees(7, 1)*
                    Day3.countTrees(1, 2))

            Log.e("Day3", "Number of Tree(1, 1) : ${Day3.countTrees(1, 1)}")
            Log.e("Day3", "Number of Tree(3, 1) : ${Day3.countTrees(3, 1)}")
            Log.e("Day3", "Number of Tree(5, 1) : ${Day3.countTrees(5, 1)}")
            Log.e("Day3", "Number of Tree(7, 1) : ${Day3.countTrees(7, 1)}")
            Log.e("Day3", "Number of Tree(1, 2) : ${Day3.countTrees(1, 2)}")
            
            Log.e("Day3", "Sum is $sum")
            Toast.makeText(
                this, "Sum is $sum"
                , Toast.LENGTH_LONG
            ).show()
        }

        btnDay4Part1.setOnClickListener {
            Log.e("Day4", "Number of valid ${Day4.countValidPassPort()}")
            Toast.makeText(
                this, "Number of valid ${Day4.countValidPassPort()}"
                , Toast.LENGTH_LONG
            ).show()
        }

        btnDay4Part2.setOnClickListener {
            Log.e("Day4", "Number of valid ${Day4.countValidPassPort2()}")
            Toast.makeText(
                this, "Number of valid ${Day4.countValidPassPort2()}"
                , Toast.LENGTH_LONG
            ).show()
        }
    }
}