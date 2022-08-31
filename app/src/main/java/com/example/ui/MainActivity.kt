package com.example.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast
import android.widget.ToggleButton
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.AppCompatCheckBox
import androidx.appcompat.widget.AppCompatTextView
import androidx.appcompat.widget.AppCompatToggleButton
import androidx.core.widget.TextViewCompat

class MainActivity : AppCompatActivity() {
    lateinit var toggle: AppCompatToggleButton
    lateinit var txt_togle:AppCompatTextView
    lateinit var checkBox1: AppCompatCheckBox
    lateinit var txt_checkbox1:AppCompatTextView
    lateinit var checkBox2: AppCompatCheckBox
    lateinit var txt_checkbox2:AppCompatTextView
    lateinit var checkBox3: AppCompatCheckBox
    lateinit var txt_checkbox3:AppCompatTextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()

        //toggle.textOff="OFF"
        //EVENT ON TOGGLE BUTTON
        toggle.setOnCheckedChangeListener { compoundButton, b ->
            if(b){
                txt_togle.text="ON"
            }
            else{
                txt_togle.text="OFF"
            }
        }

        //EVENT ON CHECKBOX
        checkBox1.setOnCheckedChangeListener { compoundButton, b ->
            if(b){
                txt_checkbox1.text=checkBox1.text
            }
            else{
                txt_checkbox1.text="Default"
            }
        }
        checkBox2.setOnCheckedChangeListener { compoundButton, b ->
            if(b){
                txt_checkbox2.text=checkBox2.text
            }
            else{
                txt_checkbox2.text="Default"
            }
        }

        checkBox3.setOnCheckedChangeListener { compoundButton, b ->
            if(b){
                txt_checkbox3.text=checkBox3.text
            }
            else{
                txt_checkbox3.text="Default"
            }
        }


    }



    private fun initView() {
        toggle=findViewById(R.id.toggle_button)
        txt_togle=findViewById(R.id.txt_toggle)
        checkBox1=findViewById(R.id.checkbox1)
        txt_checkbox1=findViewById(R.id.txt_checkbox1)
        checkBox2=findViewById(R.id.checkbox2)
        txt_checkbox2=findViewById(R.id.txt_checkbox2)
        checkBox3=findViewById(R.id.checkbox3)
        txt_checkbox3=findViewById(R.id.txt_checkbox3)
    }
}