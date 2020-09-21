package com.example.recyclerview

import android.os.Bundle
import androidx.annotation.DrawableRes
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Recyclerview object
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)

        // Initialize contacts with creating data set
        val contacts = Contact.getContactsList(20)

        // Create adapter passing in the data set
        val adapter = ContactAdapter(contacts)
        // Attach the adapter to the recyclerview
        recyclerView.adapter = adapter

        // Set layout manager
        val layoutManager = LinearLayoutManager(this)
//        val layoutManager = GridLayoutManager(this,3)
//        val layoutManager = StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL)
//        layoutManager.orientation = LinearLayoutManager.VERTICAL
        // Attach the layoutManager to the recyclerview
        recyclerView.layoutManager = layoutManager
        // ItemDecoration to add divider
        recyclerView.addItemDecoration(DividerItemDecoration(this,DividerItemDecoration.VERTICAL))
//        recyclerView.setDivider(R.drawable.divider)
    }

//    private fun RecyclerView.setDivider(@DrawableRes drawableRes: Int) {
//        val divider = DividerItemDecoration(
//            this.context,
//            DividerItemDecoration.VERTICAL
//        )
//        val drawable = ContextCompat.getDrawable(
//            this.context,
//            drawableRes
//        )
//        drawable?.let {
//            divider.setDrawable(it)
//            addItemDecoration(divider)
//        }
//    }

}
