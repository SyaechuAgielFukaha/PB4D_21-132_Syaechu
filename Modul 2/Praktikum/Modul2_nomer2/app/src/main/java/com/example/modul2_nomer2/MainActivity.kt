package com.example.modul2_nomer2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: MyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }

    private fun init() {
        recyclerView = findViewById(R.id.recycler_view)

        var data = ArrayList<Football>()
        data.add(Football(R.drawable.arema, "Arema FC","Malang Indonesia"))
        data.add(Football(R.drawable.persib, "Persib","Bandung Indonesia"))
        data.add(Football(R.drawable.madura, "Madura United","Madura Indonesia"))
        data.add(Football(R.drawable.persebaya, "Persebaya","Surabaya Indonesia"))
        data.add(Football(R.drawable.bali, "Bali United","Bali Indonesia"))
        data.add(Football(R.drawable.persija, "Persija","Jakarta Indonesia"))
        data.add(Football(R.drawable.psis, "PSIS Semarang","Semarang Indonesia"))
        data.add(Football(R.drawable.psm, "PSM Makassar","Makassar Indonesia"))
        data.add(Football(R.drawable.arema, "Arema FC","Malang Indonesia"))
        data.add(Football(R.drawable.persib, "Persib","Bandung Indonesia"))
        data.add(Football(R.drawable.madura, "Madura United","Madura Indonesia"))
        data.add(Football(R.drawable.persebaya, "Persebaya","Surabaya Indonesia"))
        data.add(Football(R.drawable.bali, "Bali United","Bali Indonesia"))
        data.add(Football(R.drawable.persija, "Persija","Jakarta Indonesia"))
        data.add(Football(R.drawable.psis, "PSIS Semarang","Semarang Indonesia"))
        data.add(Football(R.drawable.psm, "PSM Makassar","Makassar Indonesia"))

        adapter = MyAdapter(data)
    }
}