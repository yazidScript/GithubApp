package com.zee.githubapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class UserAdapter(private val listUser: ArrayList<UserModel>) : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserAdapter.UserViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.list_row_item, parent, false)
        return UserViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listUser.size
    }

    override fun onBindViewHolder(holder: UserAdapter.UserViewHolder, position: Int) {
        val user = listUser[position]
        holder.tvUsername.text = user.username
        holder.tvCompany.text = user.company
        Glide.with(holder.itemView.context).load(user.photo).apply(RequestOptions().override(350, 550)).into(holder.imgPhoto)
    }

    inner class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.ivUser)
        var tvUsername: TextView = itemView.findViewById(R.id.tvUsername)
        var tvCompany: TextView = itemView.findViewById(R.id.tvCompany)
    }
}