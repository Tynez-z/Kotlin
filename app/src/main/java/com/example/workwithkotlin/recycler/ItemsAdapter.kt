package com.example.workwithkotlin.recycler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.workwithkotlin.R
import kotlinx.android.synthetic.main.item_cardview_layout.view.*

class ItemsAdapter(var titile: List<String>, var description: List<String>, var image: List<Int>) :
    RecyclerView.Adapter<ItemsAdapter.ItemViewHolder>() {

    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val itemTitle: TextView = view.tv_title
        val itemDescription: TextView = view.tv_description
        val itemImg: ImageView = view.iv_image
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview_layout, parent, false)
        return ItemViewHolder(v)
    }

    override fun getItemCount(): Int {
        return titile.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.itemTitle.text = titile[position]
        holder.itemDescription.text = description[position]
        holder.itemImg.setImageResource(image[position])
    }
}