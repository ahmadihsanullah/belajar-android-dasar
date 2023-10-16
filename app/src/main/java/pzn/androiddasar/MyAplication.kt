package pzn.androiddasar

import android.app.Application
import android.util.Log

class   MyAplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Log.i("app", "aplication created")
    }

}