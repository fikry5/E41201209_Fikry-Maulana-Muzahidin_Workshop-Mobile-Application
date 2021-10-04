package com.fikry.listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

//Penghubung antara tampilan (view) dengan data
class MakananAdapter(var nContext: Context, var resources: Int, var items:List<Makanan>): ArrayAdapter<Makanan>(
    nContext, resources, items){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater:LayoutInflater=LayoutInflater.from(nContext)
        val view:View = layoutInflater.inflate(resources, null)

        //Inisialisasi dengan memanggil id
        val imageView:ImageView = view.findViewById(R.id.img)
        val namaMakanan:TextView = view.findViewById(R.id.tvNama)
        val asalDaerah:TextView = view.findViewById(R.id.tvDaerah)

        var nItem:Makanan = items[position]
        imageView.setImageDrawable(nContext.resources.getDrawable(nItem.img))
        namaMakanan.text = nItem.nama
        asalDaerah.text = nItem.daerah

        return view
    }
}