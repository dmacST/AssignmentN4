import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.assignmentn4.Contact
import com.example.assignmentn4.R

class ContactAdapter(private val contactList: List<Contact>) : RecyclerView.Adapter<ContactItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contact_item, parent, false)
        return ContactItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactItemViewHolder, position: Int) {
        val contact = contactList[position]
        holder.nameTextView.text = contact.name
        holder.phoneNumberTextView.text = contact.phoneNumber
    }

    override fun getItemCount() = contactList.size
}
