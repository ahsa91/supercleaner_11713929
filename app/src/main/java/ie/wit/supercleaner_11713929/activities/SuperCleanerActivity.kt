package ie.wit.supercleaner_11713929.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ie.wit.supercleaner_11713929.R
import timber.log.Timber
import timber.log.Timber.i

class SuperCleanerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_supercleaner)

        Timber.plant(Timber.DebugTree())

        i("SuperCleaner Activity started..")
    }
}