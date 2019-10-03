package com.gzeinnumer.sessionmanagerkt

import android.app.Application


class App :  Application(){
    companion object{
        var sessionManager2: SessionManager? = null
    }

    override fun onCreate() {
        sessionManager2 = SessionManager(applicationContext)
        super.onCreate()
    }
}