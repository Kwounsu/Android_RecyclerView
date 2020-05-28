package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter(val contacts: ArrayList<Contact>) : RecyclerView.Adapter<ContactAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val contactName = itemView.findViewById<TextView>(R.id.contact_name_txt)
        val isOnlineButton = itemView.findViewById<Button>(R.id.message_btn)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.list_item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return contacts.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contact = contacts.get(position)
        holder.contactName.text = contact.name
        holder.isOnlineButton.text = if (contact.isOnline) "Message" else "Offline"
        holder.isOnlineButton.isEnabled = contact.isOnline
    }
}