package pzn.androiddasar

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainUtama : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_utama)
        val data : Intent = this.intent
        val timA: String? = data.getStringExtra("TimA")
        val timB: String? = data.getStringExtra("TimB")

        val timATextView : TextView = findViewById<TextView>(R.id.namaA)
        val timBTextView : TextView = findViewById<TextView>(R.id.namaB)

        // Periksa apakah data yang diterima tidak null sebelum menampilkan
        timATextView.text = if (timA != null) "$timA" else "Tim A nih boss"

        if (timB != null) {
            timBTextView.text = "$timB"
        }

        val tambahTigaPoinA: Button = findViewById(R.id.tambahTigaPoinA)
        val tambahTigaPoinB: Button = findViewById(R.id.tambahTigaPoinB)

        val tambahDuaPointA: Button = findViewById(R.id.tambahDuaPoinA)
        val tambahDuaPointB: Button = findViewById(R.id.tambahDuaPoinB)

        val freeThrowsA: Button = findViewById(R.id.freeThrowsA)
        val freeThrowsB: Button = findViewById(R.id.freeThrowsB)

        tambahTigaPoinA.setOnClickListener {
            pointTigaA()
        }

        tambahDuaPointA.setOnClickListener {
            pointDuaA()
        }

        freeThrowsA.setOnClickListener {
            freeThrowsA()
        }

        tambahTigaPoinB.setOnClickListener {
            pointTigaB()
        }

        tambahDuaPointB.setOnClickListener {
            pointDuaB()
        }

        freeThrowsB.setOnClickListener {
            freeThrowsB()
        }
    }

    fun pointTigaA(){
        val poinA : TextView = findViewById(R.id.poinA)
        val poin = poinA.text.toString()

        val nilaiA = poin.toIntOrNull()
        if (nilaiA != null) {
            val jumlah = nilaiA + 3
            poinA.text = jumlah.toString()
        } else {
            // Handle kesalahan jika teks tidak dapat diubah menjadi integer
        }
    }

    fun pointDuaA(){
        val poinA : TextView = findViewById(R.id.poinA)
        val poin = poinA.text.toString()

        val nilaiA = poin.toIntOrNull()
        if (nilaiA != null) {
            val jumlah = nilaiA + 2
            poinA.text = jumlah.toString()
        } else {
            // Handle kesalahan jika teks tidak dapat diubah menjadi integer
        }
    }

    fun freeThrowsA(){
        val poinA : TextView = findViewById(R.id.poinA)
        val poin = poinA.text.toString()

        val nilaiA = poin.toIntOrNull()
        if (nilaiA != null) {
            val jumlah = nilaiA + 1
            poinA.text = jumlah.toString()
        } else {
            // Handle kesalahan jika teks tidak dapat diubah menjadi integer
        }
    }

    fun pointTigaB(){
        val poinA : TextView = findViewById(R.id.poinB)
        val poin = poinA.text.toString()

        val nilaiA = poin.toIntOrNull()
        if (nilaiA != null) {
            val jumlah = nilaiA + 3
            poinA.text = jumlah.toString()
        } else {
            // Handle kesalahan jika teks tidak dapat diubah menjadi integer
        }
    }

    fun pointDuaB(){
        val poinA : TextView = findViewById(R.id.poinB)
        val poin = poinA.text.toString()

        val nilaiA = poin.toIntOrNull()
        if (nilaiA != null) {
            val jumlah = nilaiA + 2
            poinA.text = jumlah.toString()
        } else {
            // Handle kesalahan jika teks tidak dapat diubah menjadi integer
        }
    }

    fun freeThrowsB(){
        val poinA : TextView = findViewById(R.id.poinB)
        val poin = poinA.text.toString()

        val nilaiA = poin.toIntOrNull()
        if (nilaiA != null) {
            val jumlah = nilaiA + 1
        } else {
            // Handle kesalahan jika teks tidak dapat diubah menjadi integer
        }
    }


}