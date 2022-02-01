package ie.wit.supercleaner_11713929

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
//splash screen code found @https://github.com/Spikeysanju/Pineberry-Splash-Screen-Android
@Suppress("DEPRECATION")
class SplashScreenActivity : AppCompatActivity() {
    lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        handler = Handler()
        handler.postDelayed({

            // Delay and Start Activity
            val intent = Intent(this,SuperCleanerActivity::class.java)
            startActivity(intent)
            finish()
        } , 1500) // here we're delaying to startActivity after 1.5 seconds

    }
}