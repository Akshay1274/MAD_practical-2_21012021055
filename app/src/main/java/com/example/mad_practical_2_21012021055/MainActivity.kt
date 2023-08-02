package com.example.mad_practical_2_21012021055

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    val TAG="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMassage("on Create method  is called")


    }
    fun showMassage(message:String){
        Log.i(TAG, message)
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        val obj:ConstraintLayout?=findViewById(R.id.mainconstraint)
        if(obj!=null){
            Snackbar.make(obj,message,Snackbar.LENGTH_SHORT).show()
        }
    }
 override   fun onStart(){
      super.onStart()
     showMassage("on start method is called")
    }

  override  fun onResume(){
        super.onResume()
      showMassage("on Resume method called")
    }
  override  fun onPause(){
        super.onPause()
      showMassage("on Pause method called")
    }
     override fun onStop(){
        super.onStop()
        showMassage("on stop method called")
    }
  override  fun onDestroy(){
        super.onDestroy()
      showMassage("on Destroy method called")
    }


}