package com.gzeinnumer.sessionmanagerkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

val sessionManager2: SessionManager by lazy {
    App.sessionManager2!!
}

class MainActivity : AppCompatActivity() {

    var sessionManager: SessionManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sessionManager = SessionManager(this)
        setToken("token")

        val str = sessionManager!!.TOKEN

        Toast.makeText(applicationContext,"1 : "+str, Toast.LENGTH_SHORT).show()

        //step 2
        Toast.makeText(applicationContext, "2 : "+sessionManager2.TOKEN, Toast.LENGTH_SHORT).show()
    }

    private fun setToken(str: String){
        //set to text view
        sessionManager!!.TOKEN = str
    }
}
