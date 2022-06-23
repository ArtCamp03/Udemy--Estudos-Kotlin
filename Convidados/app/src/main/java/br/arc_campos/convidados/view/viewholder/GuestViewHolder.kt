package br.arc_campos.convidados.view.viewholder

import android.content.DialogInterface
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView
import br.arc_campos.convidados.R
import br.arc_campos.convidados.databinding.RowGuestBinding
import br.arc_campos.convidados.service.model.GuestModel
import br.arc_campos.convidados.view.listener.OnGuestListener

class GuestViewHolder(private val bind: RowGuestBinding, private val listener: OnGuestListener) :
    RecyclerView.ViewHolder(bind.root) {

    // ViewHolder tem o proposito de atribuir os dados
    // ligaçao elemento interface com os dados
    fun bind(guest: GuestModel) {
        /*
        metodo funciona mas quebra o padrao ViewBind
        itemView.findViewById<TextView>(R.id.text_name).text = guest.name
         */

        // padrao ViewHolder
        bind.textName.text = guest.name

        bind.textName.setOnClickListener {
            listener.onClick(guest.id)
        }

        bind.textName.setOnLongClickListener {
            AlertDialog.Builder(itemView.context)
                .setTitle("Remoçao de convidado")
                .setMessage("Tem certeza que deseja remover?")
                .setPositiveButton("Sim") { dialog, which ->
                    listener.onDelete(guest.id)
                }
                .setNegativeButton("Nao", null)
                .setNeutralButton("OK") { dialog, which ->
                    val s = ""
                }
                .create()
                .show()

            true
        }

    }
}