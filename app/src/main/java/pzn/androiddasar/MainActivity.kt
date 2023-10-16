package pzn.androiddasar

import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var  nameEditText: EditText
    private lateinit var sayHelloButton: Button
    private lateinit var sayHelloTextView: TextView

    private fun initComponent(){
        nameEditText = findViewById(R.id.nameEditText)
        sayHelloButton = findViewById(R.id.sayHelloButton)
        sayHelloTextView = findViewById(R.id.sayHelloTextView)
    }

    private fun checkFingerprint(){
        if(packageManager.hasSystemFeature(PackageManager.FEATURE_FINGERPRINT)){
            Log.i("FEATURE", "Feature Fingerprint on")
        }else{
            Log.i("FEATURE", "Feature Fingerprint off")
        }
    }

    private fun checkPlatformSdk(){
        Log.i("Sdk", Build.VERSION.SDK_INT.toString())
        if(Build.VERSION.SDK_INT < Build.VERSION_CODES.S){
            Log.i("SDK", "Disabled feature, because version sdk lower than 31")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_world)

        initComponent()

        sayHelloTextView.text = resources.getString(R.string.app_name)

        sayHelloButton.setOnClickListener {
            checkFingerprint()
            checkPlatformSdk()

            val sampleAssets = assets.open("sample.json")
                .bufferedReader()
                .use{it.readText()}
            Log.i("ASSETS", sampleAssets)

            val sampleRaw = resources.openRawResource(R.raw.sample)
                .bufferedReader()
                .use { it.readText() }

            Log.i("Raw", sampleRaw)

            Log.d("PZN","This is debug log")
            Log.i("PZN","This is info log")
            Log.w("PZN","This is warn log")
            Log.e("PZN","This is error log")

            Log.i("Value Resources", resources.getInteger(R.integer.maxPage).toString())
            Log.i("Value Resources", resources.getIntArray(R.array.numbers).joinToString { ", " })
            Log.i("Value Resources", resources.getBoolean(R.bool.isProductionMode).toString())
            Log.i("Value Resources", resources.getColor(R.color.backgroud, theme).toString())

            sayHelloButton.setBackgroundColor(resources.getColor(R.color.backgroud, theme))


           val name=  nameEditText.text.toString()
            //mendapatkan resourcce sayhellotextciew dan memberikan argumen berupa name
            sayHelloTextView.text = resources.getString(R.string.sayHelloTextView, name)

            resources.getStringArray(R.array.names).forEach {
                Log.i("PZN", it)
            }

        }
    }
}