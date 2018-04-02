package com.example.i_larin.myapplication

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.View.inflate
import com.example.i_larin.myapplication.R.id.changeScreenBTN
import kotlinx.android.synthetic.main.activity_main_link.*
import kotlinx.android.synthetic.main.activity_main_link.view.*
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.toast

    class Share : IShare {



    override fun AppCompatActivity.inflate(int: Int) {

        setContentView(R.layout.activity_main_link)
         View.inflate(this, R.layout.text2,viewIn)

            toastBTN.onClick {


                toast("Обший код")
            }



    }
        override fun AppCompatActivity.changeScreenBTN(click:()->Unit) {


            changeScreenBTN.onClick {click.invoke() }



    }





  }