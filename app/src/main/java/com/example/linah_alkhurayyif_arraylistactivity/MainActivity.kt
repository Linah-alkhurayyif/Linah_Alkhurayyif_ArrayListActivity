package com.example.linah_alkhurayyif_arraylistactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var names_List = arrayListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        saveName.setOnClickListener {
            if (entryName.text.toString() ==""){
                Toast.makeText(this,"Please Enter Name",Toast.LENGTH_SHORT).show()
            }
            else{
                names_List.add(entryName.text.toString())
                entryName.setText("")
            }
        }
        saveNumber.setOnClickListener{
            if (entryNumber.text.toString() ==""){
                Toast.makeText(this,"Please Enter Number",Toast.LENGTH_SHORT).show()

            }
            else{
                if (entryNumber.text.toString().toInt() <= names_List.size && entryNumber.text.toString().toInt() > 0)
                    result.text= names_List[entryNumber.text.toString().toInt()-1]
                else
                    Toast.makeText(this,"No name was found",Toast.LENGTH_SHORT).show()
                entryNumber.setText("")
            }
        }
    }


}