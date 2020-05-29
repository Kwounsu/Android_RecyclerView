package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter(private val contacts: ArrayList<Contact>) : RecyclerView.Adapter<ContactAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val contactName: TextView = itemView.findViewById(R.id.contact_name_txt)
        val isOnlineButton: Button = itemView.findViewById(R.id.message_btn)
    }

    // Create new ViewHolder when there is no ViewHolder available.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.list_item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return contacts.size
    }

    // Bind data to the ViewHolder
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contact = contacts[position]
        holder.contactName.text = contact.name
        holder.isOnlineButton.text = if (contact.isOnline) "Message" else "Offline"
        holder.isOnlineButton.isEnabled = contact.isOnline
        holder.contactName.isEnabled = contact.isOnline
        // Animation
        setAnimation(holder.itemView)
    }

    // Animation
    private fun setAnimation(viewToAnimate: View) {
        if (viewToAnimate.animation == null) {
            val animation =
                AnimationUtils.loadAnimation(viewToAnimate.context, android.R.anim.slide_in_left)
            viewToAnimate.animation = animation
        }
    }
}