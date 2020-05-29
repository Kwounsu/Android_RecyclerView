package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Recyclerview object
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)

        // Initialize contacts with creating data set
        val contacts = Contact.getContactsList(40)

        // Create adapter passing in the data set
        val adapter = ContactAdapter(contacts)
        // Attach the adapter to the recyclerview to populate items
        recyclerView.adapter = adapter

        // Set layout manager
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager
    }
}
