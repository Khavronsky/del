package com.example.i_larin.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main_link.*
import org.jetbrains.anko.act
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.toast

class MainActivityLink1 : AppCompatActivity(), IShare by Share() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        inflate(R.layout.text1)
        changeScreenBTN{

            toast("changeScreenBTN MainActivityLink1")
        }
    }

}
