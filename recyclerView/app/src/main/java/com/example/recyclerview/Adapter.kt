import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.Jurusan
import com.example.recyclerview.R

class JurusanAdapter(private val context: Context, private val jurusanList: List<Jurusan>, val listener: (Jurusan) -> Unit)
    : RecyclerView.Adapter<JurusanAdapter.JurusanViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JurusanViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.itemlist, parent, false)
        return JurusanViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: JurusanViewHolder, position: Int) {
        val jurusan = jurusanList[position]
        holder.bindView(jurusan, listener)
    }

    override fun getItemCount(): Int {
        return jurusanList.size
    }

    inner class JurusanViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val imgKarakter = view.findViewById<ImageView>(R.id.item_photo)
        private val namaKarakter = view.findViewById<TextView>(R.id.itemName)
        private val descKarakter = view.findViewById<TextView>(R.id.itemDescription)

        fun bindView(jurusan: Jurusan, listener: (Jurusan) -> Unit) {
            imgKarakter.setImageResource(jurusan.imgKarakter)
            namaKarakter.text = jurusan.namaKarakter
            descKarakter.text = jurusan.descKarakter
            itemView.setOnClickListener {
                listener(jurusan)
            }
        }
    }
}
