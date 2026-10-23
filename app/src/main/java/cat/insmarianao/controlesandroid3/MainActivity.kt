package cat.insmarianao.controlesandroid3

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val paises = mapOf(
            "Argentina" to 2780400,
            "Bolivia" to 1098581,
            "Brasil" to 8515767,
            "Chile" to 756102,
            "Colombia" to 1141748,
            "Ecuador" to 283561,
            "Guyana" to 214969,
            "Paraguay" to 406752,
            "Perú" to 1285216,
            "Surinam" to 163820,
            "Uruguay" to 176215,
            "Venezuela" to 916445
        )

        val lista = findViewById<ListView>(R.id.contenedor)
        val nombres = paises.keys.toList()
        lista.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, nombres)

        lista.setOnItemClickListener { parent, view, position, id ->
            val pais = nombres[position]
            (view as TextView).text = "$pais: ${paises[pais]} km²"
        }
    }
}
