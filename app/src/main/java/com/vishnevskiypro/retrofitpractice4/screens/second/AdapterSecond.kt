package com.vishnevskiypro.retrofitpractice4.screens.second

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vishnevskiypro.retrofitpractice4.R
import com.vishnevskiypro.retrofitpractice4.databinding.ItemMoneyBinding
import com.vishnevskiypro.retrofitpractice4.model.beznal.BeznalichkaItem

class AdapterSecond : RecyclerView.Adapter<AdapterSecond.SecondViewHolder>(){

    private var listOfBeznal = emptyList<BeznalichkaItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_money, parent, false)
        return SecondViewHolder(view)
    }

    override fun onBindViewHolder(holder: SecondViewHolder, position: Int) {
        holder.bind(listOfBeznal[position])
    }

    override fun getItemCount(): Int {
        return listOfBeznal.size
    }

    fun setList(list: List<BeznalichkaItem>){
        listOfBeznal = list
        notifyDataSetChanged()
    }



    class SecondViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val binding = ItemMoneyBinding.bind(view)

        fun bind(beznalichkaItem: BeznalichkaItem){
            binding.apply {
                itemName.text = beznalichkaItem.ccy
                itemBuy.text = beznalichkaItem.buy
                itemSale.text = beznalichkaItem.sale
            }
        }

    }
}