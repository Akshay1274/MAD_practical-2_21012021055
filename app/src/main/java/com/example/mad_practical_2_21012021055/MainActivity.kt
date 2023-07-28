package com.example.mad_practical_2_21012021055

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val TAG="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMassage("on Create method  is called")


    }
    fun showMassage(message:String){
        Log.i(TAG, "message")
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
 override   fun onStart(){
      super.onStart()
     showMassage("on start method is called")
    }
}