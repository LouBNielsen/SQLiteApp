package sqlite

import android.app.Activity
import android.content.ContentValues
import android.content.Intent
import android.database.sqlite.SQLiteDatabase
import android.os.Bundle
import android.util.Log
import android.view.View
import com.amitshekhar.DebugDB
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class RegisterPet : Activity()
{

    fun onCreate(savedInstanceState: Bundle?, db: SQLiteDatabase) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        register.setOnClickListener {
            registerThisPet(db)
            toast("register")

        }
    }


    open fun registerThisPet(db: SQLiteDatabase){
        val fName = firstName.text.toString()
        val type = type.text.toString()

        DBController.instance.insertPet(db, fName, type)
    }




}
