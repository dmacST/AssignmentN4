import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.assignmentn4.R

class ContactItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val nameTextView: TextView = itemView.findViewById(R.id.nameTextView)
    val phoneNumberTextView: TextView = itemView.findViewById(R.id.phoneNumberTextView)
}
