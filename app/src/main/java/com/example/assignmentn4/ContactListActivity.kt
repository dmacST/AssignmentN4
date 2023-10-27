package com.example.assignmentn4
import ContactAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.assignmentn4.Contact
import com.example.assignmentn4.R


class ContactListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_list)

        val contactList = listOf(
            Contact(1, "Dimitri Matcharashvili", "123-456-7890", "Dimitri@example.com"),
            Contact(2, "Example Example", "987-654-3210", "Exampleexample@example.com"),
            Contact(3, "Example Example", "987-654-3210", "Exampleexample@example.com"),
            Contact(4, "Example Example", "987-654-3210", "Exampleexample@example.com"),
            Contact(5, "Example Example", "987-654-3210", "Exampleexample@example.com")
        )

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ContactAdapter(contactList)
    }
}
