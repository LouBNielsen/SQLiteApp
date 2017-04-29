package sqlite

import android.app.Activity
import android.database.sqlite.SQLiteDatabase
import android.os.Bundle
import android.util.Log
import com.amitshekhar.DebugDB
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class ActivityMain : Activity()
{

    val DBCtrl: DBController = DBController()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DBCtrl.query()
        DBCtrl.petsQuery()

        registerPet.setOnClickListener {
            toast("register")
            registerThisPet()
        }

        registerPers.setOnClickListener {
            toast("register")
            registerThisPerson()
        }

    }

        fun registerThisPet(){
            val fName = firstName.text.toString()
            val type = type.text.toString()

            DBCtrl.insertPet(fName, type)
        }

        fun registerThisPerson(){
            val fName = pFirstName.text.toString()
            val lName = pLastName.text.toString()
            val age = pAge.text.toString()
            val email = pEmail.text.toString()

            DBCtrl.insertPerson(fName, lName, age, email)
        }


}
