package com.example.recyclerviewexp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexp.databinding.KopekCardTasarimBinding

class KopeklerAdapter(private var kopeklerList: ArrayList<KopekModel>): RecyclerView.Adapter<KopeklerAdapter.KopekCardTasarim>() {

    class KopekCardTasarim(val kopekCardTasarimBinding: KopekCardTasarimBinding): RecyclerView.ViewHolder(kopekCardTasarimBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int
    ): KopeklerAdapter.KopekCardTasarim {
        val layoutInflater = LayoutInflater.from(parent.context)
        val kopekCardTasarimBinding = KopekCardTasarimBinding.inflate(layoutInflater,parent,false)
        return KopekCardTasarim(kopekCardTasarimBinding)
    }

    override fun onBindViewHolder(holder: KopeklerAdapter.KopekCardTasarim, position: Int) {
        val kopek = kopeklerList[position]
        holder.kopekCardTasarimBinding.kopekImageView.setImageResource(kopek.kopekGorsel)
        holder.kopekCardTasarimBinding.kopetTurTextView.text = kopek.kopekTur
    }

    override fun getItemCount(): Int = kopeklerList.size




}