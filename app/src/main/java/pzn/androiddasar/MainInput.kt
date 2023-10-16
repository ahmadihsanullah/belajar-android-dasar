package pzn.androiddasar

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainInput : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.input_tim)

        val inputTimButton : Button = findViewById(R.id.mulaiHitungSkor)
        inputTimButton.setOnClickListener {
            panggil_name()
        }
    }

    public fun panggil_name():Unit{
        val inputTimAEditTExt : EditText = findViewById<EditText>(R.id.inputTimA)
        val inputTimBEditTExt : EditText = findViewById<EditText>(R.id.inputTimB)

        val timA : String = inputTimAEditTExt.text.toString()
        val timB : String = inputTimBEditTExt.text.toString()

        // Membuat objek Intent untuk berpindah ke aktivitas MainUtama
        val kirim: Intent = Intent(this, MainUtama::class.java)

        // Menambahkan data yang ingin Anda kirim ke aktivitas MainUtama
        kirim.putExtra("TimA", timA)
        kirim.putExtra("TimB", timB)

        // Memulai aktivitas MainUtama dengan intent
        startActivity(kirim)
    }



}