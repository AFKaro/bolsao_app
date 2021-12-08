package br.unicap.bolsao

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class Adaptador(
    val titulos: Array<String>,
    val conteudos: Array<String>,
    val imagens: Array<String>
) : RecyclerView.Adapter<Adaptador.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cardTitulo: TextView = itemView.findViewById(R.id.titulo)
        val cardConteudo: TextView = itemView.findViewById(R.id.conteudo)
        val cardImage: ImageView = itemView.findViewById(R.id.imagem)
        val view = itemView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.historias_view, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.cardTitulo.text = titulos[position]
        holder.cardConteudo.text = conteudos[position]
        Picasso.get().load(imagens[position]).into(holder.cardImage)

        holder.view.setOnClickListener {
            val intent = Intent(it.context, Detalhes::class.java)
            intent.putExtra("titulo", titulos[position])
            intent.putExtra("conteudo", conteudos[position])
            intent.putExtra("imagem", imagens[position])
            holder.view.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return titulos.size
    }
}