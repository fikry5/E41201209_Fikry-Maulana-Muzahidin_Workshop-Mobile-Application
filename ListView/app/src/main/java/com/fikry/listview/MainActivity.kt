package com.fikry.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listView = findViewById<ListView>(R.id.listViewFood)
        var list = mutableListOf<Makanan>()

        //Menambahkan dan menampilkan data pada list
        list.add(Makanan("Rendang", "Berasal dari Minangkabau", R.drawable.rendang))
        list.add(Makanan("Pempek", "Berasal dari Palembang", R.drawable.pempek))
        list.add(Makanan("Binte Biluhuta", "Berasal dari Gorontalo", R.drawable.bintebiluhuta))
        list.add(Makanan("Mie Kocok", "Berasal dari Bandung", R.drawable.miekocok))
        list.add(Makanan("Tahu Sumedang", "Berasal dari Sumedang", R.drawable.tahusumedang))
        list.add(Makanan("Jalakotek", "Berasal dari Majalengka", R.drawable.jalakotek))
        list.add(Makanan("Gudeg", "Berasal dari Yogyakarta", R.drawable.gudeg))
        list.add(Makanan("Empal Gentong", "Berasal dari Cirebon", R.drawable.empalgentong))
        list.add(Makanan("Sate Maranggi", "Berasal dari Purwakarta", R.drawable.satemaranggi))
        list.add(Makanan("Kerak Telor", "Berasal dari Jakarta", R.drawable.keraktelor))
        list.add(Makanan("Ayam Betutu", "Berasal dari Bali", R.drawable.ayambetutu))
        list.add(Makanan("Papeda", "Berasal dari Ambon & Papua", R.drawable.papeda))


        listView.adapter = MakananAdapter(this, R.layout.list_food, list)

        /*
            Membuat event klik dengan menggunakan pengkondisian when (i = index)
            Misal jika list index 0 yang di klik maka akan muncul "Kamu memilih Rendang"
        */
        listView.setOnItemClickListener { adapterView, view, i, l ->
            when (i) {
                0 -> Toast.makeText(this, "Kamu memilih Rendang", Toast.LENGTH_SHORT).show()
                1 -> Toast.makeText(this, "Kamu memilih Pempek", Toast.LENGTH_SHORT).show()
                2 -> Toast.makeText(this, "Kamu memilih Binte Biluhuta", Toast.LENGTH_SHORT).show()
                3 -> Toast.makeText(this, "Kamu memilih Mie Kocok", Toast.LENGTH_SHORT).show()
                4 -> Toast.makeText(this, "Kamu memilih Tahu Sumedang", Toast.LENGTH_SHORT).show()
                5 -> Toast.makeText(this, "Kamu memilih Jalakotek", Toast.LENGTH_SHORT).show()
                6 -> Toast.makeText(this, "Kamu memilih Gudeg", Toast.LENGTH_SHORT).show()
                7 -> Toast.makeText(this, "Kamu memilih Empal Gentong", Toast.LENGTH_SHORT).show()
                8 -> Toast.makeText(this, "Kamu memilih Sate Maranggi", Toast.LENGTH_SHORT).show()
                9 -> Toast.makeText(this, "Kamu memilih Kerak Telor", Toast.LENGTH_SHORT).show()
                10 -> Toast.makeText(this, "Kamu memilih Ayam Betutu", Toast.LENGTH_SHORT).show()
                11 -> Toast.makeText(this, "Kamu memilih Papeda", Toast.LENGTH_SHORT).show()
            }
        }
    }
}