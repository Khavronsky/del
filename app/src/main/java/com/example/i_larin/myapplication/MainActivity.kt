package com.example.i_larin.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import com.example.i_larin.myapplication.R.id.b1
import com.example.i_larin.myapplication.R.id.b2
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        b1.setOnClickListener{
            startActivity<MainActivityLink1>()


        }


        b2.setOnClickListener{

            startActivity<MainActivityLink2>()


        }
    }
}
