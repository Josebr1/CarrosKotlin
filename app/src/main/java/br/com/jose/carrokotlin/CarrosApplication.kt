package br.com.jose.carrokotlin

import android.app.Application
import android.util.Log

/**
 * Created by jose on 9/14/17.
 */

class CarrosApplication : Application(){
    private val TAG = "CarrosApplication"

    override fun onCreate() {
        super.onCreate()

        // Salva a instância para temos acesso como Singleton
        appInstance = this
    }

    companion object {
        // Singleton da classe Application
        private var appInstance: CarrosApplication? = null

        fun getInstance(): CarrosApplication{
            if(appInstance == null){
                throw  IllegalStateException("Configure a classe de Application no AndroidManifest.xml")
            }
            return appInstance!!
        }

    }

    override fun onTerminate() {
        super.onTerminate()
        Log.d(TAG, "CarrosApplication.onTerminate()")
    }

}