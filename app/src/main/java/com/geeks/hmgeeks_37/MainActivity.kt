package com.geeks.hmgeeks_37

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contacts = listOf(
            Contact("Alice"),
            Contact("Bob"),
            Contact("Charlie"),
            Contact("Dave"),
            Contact("Eve"),
            Contact("Frank")
        )

        val recyclerView: RecyclerView = findViewById(R.id.contactRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ContactAdapter(contacts) { contact ->
            val intent = Intent(this, ChatActivity::class.java)
            intent.putExtra("contact_name", contact.name)
            startActivity(intent)
        }
    }
}