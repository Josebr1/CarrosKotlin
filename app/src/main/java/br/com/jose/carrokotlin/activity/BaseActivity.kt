package br.com.jose.carrokotlin.activity

import android.annotation.SuppressLint
import android.content.Context
import android.support.v7.app.AppCompatActivity

/**
 * Created by jose on 9/14/17.
 *
 * A anotação @SuppressLint("Registered") foi adicionada porque o Android Studio reclama que
 * esta activity não está registrada no arquivo de manifest
 */

@SuppressLint("Registered")
open class BaseActivity : AppCompatActivity() {

    protected val context: Context get() = this

}