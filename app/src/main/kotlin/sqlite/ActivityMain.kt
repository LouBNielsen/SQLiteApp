package sqlite

import android.app.Activity
import android.os.Bundle
import android.util.Log
import com.amitshekhar.DebugDB
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class ActivityMain : Activity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        content.text = "SQLite"

        buttonSQLite.setOnClickListener {
            funSQLite()
            registerPet()
            toast("Tables created")
        }
    }

    fun funSQLite()
    {
        Log.d("DebugDatabase", "DebugDatabaseAddress" + DebugDB.getAddressLog())

        val DBCtrl : DBController = DBController.instance

        val DB = DBCtrl.getWritableDatabase()

        DBCtrl.query(DB)
    }

    fun registerPet(){
        val DBCtrl : DBController = DBController.instance

        val DB = DBCtrl.getWritableDatabase()

        DBCtrl.petsQuery(DB)

    }
}
