package com.example.latihan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val aplikasiList = arrayListOf(
            DataAplikasi(R.drawable.ic_launcher_background, "Binar", "Binar Academy",
            "-Pendidikan", "5.0", "12 MB", "1.2 K"),
            DataAplikasi(R.drawable.ic_launcher_background, "Binar", "Binar Academy",
                "-Pendidikan", "5.0", "12 MB", "1.2 K"),
            DataAplikasi(R.drawable.ic_launcher_background, "Binar", "Binar Academy",
                "-Pendidikan", "5.0", "12 MB", "1.2 K"),
            DataAplikasi(R.drawable.ic_launcher_background, "Binar", "Binar Academy",
                "-Pendidikan", "5.0", "12 MB", "1.2 K"),
            DataAplikasi(R.drawable.ic_launcher_background, "Binar", "Binar Academy",
                "-Pendidikan", "5.0", "12 MB", "1.2 K"),
            DataAplikasi(R.drawable.ic_launcher_background, "Binar", "Binar Academy",
                "-Pendidikan", "5.0", "12 MB", "1.2 K"),
            DataAplikasi(R.drawable.ic_launcher_background, "Binar", "Binar Academy",
                "-Pendidikan", "5.0", "12 MB", "1.2 K"),
            DataAplikasi(R.drawable.ic_launcher_background, "Binar", "Binar Academy",
                "-Pendidikan", "5.0", "12 MB", "1.2 K"),
            DataAplikasi(R.drawable.ic_launcher_background, "Binar", "Binar Academy",
                "-Pendidikan", "5.0", "12 MB", "1.2 K")
        )
        val adapterAplikasi = AplikasiAdapter(aplikasiList)
        val layoutmanager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rv_aplikasi.layoutManager = layoutmanager
        rv_aplikasi.adapter = adapterAplikasi
    }
}