package com.vishnevskiypro.retrofitpractice4.screens.first

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vishnevskiypro.retrofitpractice4.R
import com.vishnevskiypro.retrofitpractice4.databinding.ItemMoneyBinding
import com.vishnevskiypro.retrofitpractice4.model.nal.NalichkaItem

class AdapterFirst : RecyclerView.Adapter<AdapterFirst.SecondViewHolder>(){

    private var listOfNal = emptyList<NalichkaItem>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_money, parent, false)
        return SecondViewHolder(view)
    }


    override fun onBindViewHolder(holder: SecondViewHolder, position: Int) {
        holder.bind(listOfNal[position])
    }


    override fun getItemCount(): Int {
        return listOfNal.size
    }

    fun setList(list: List<NalichkaItem>){
        listOfNal = list
        notifyDataSetChanged()

    }

    class SecondViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val binding = ItemMoneyBinding.bind(view)

        fun bind(nalichkaItem: NalichkaItem){
            binding.apply {
                itemName.text = nalichkaItem.ccy
                itemBuy.text = nalichkaItem.buy
                itemSale.text = nalichkaItem.sale
            }

        }

    }
}