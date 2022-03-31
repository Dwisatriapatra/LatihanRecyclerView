package com.example.latihan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_aplikasi_adapter.view.*

class AplikasiAdapter(val listApp : ArrayList<DataAplikasi>):RecyclerView.Adapter<AplikasiAdapter.ViewHolder>() {
    class ViewHolder(layout: View) : RecyclerView.ViewHolder(layout)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.item_aplikasi_adapter, parent, false)
        return ViewHolder(layout)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.imageAplikasi.setImageResource(listApp[position].image)
        holder.itemView.namaAplikasi.text = listApp[position].namaAplikasi
        holder.itemView.namaDeveloper.text = listApp[position].namaDeveloper
        holder.itemView.kategoriAplikasi.text = listApp[position].kategoriAplikasi
        holder.itemView.ratingAplikasi.text = listApp[position].rating
        holder.itemView.ukuranAplikasi.text = listApp[position].ukuran
        holder.itemView.jumlahDownload.text = listApp[position].jumlahDownload
    }

    override fun getItemCount(): Int {
        return listApp.size
    }
}