package com.example.dresschooser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    //list to hold dress 1
    val dresses= arrayListOf("white stripped", "Roses Polo", "Pink Polo", "Blue jean", "Grey shirt")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*Listener to add dress to the array
        * */
        addDressBtn.setOnClickListener{
            val dressToAdd=addDressTxt.text.toString()
            dresses.add(dressToAdd)
            addDressTxt.text.clear()
            println(dresses)
        }

        /*Listener to find dress from the array
      * */to 
        findDressBtn.setOnClickListener{
            val selection= Random.nextInt(dresses.count())
            userSelectedDress.text=dresses[selection]
            println(userSelectedDress)
        }




    }





}