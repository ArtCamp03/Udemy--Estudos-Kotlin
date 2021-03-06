package com.devmasterteam.convidados.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.devmasterteam.convidados.R
import com.devmasterteam.convidados.databinding.RowGuestBinding
import com.devmasterteam.convidados.service.model.GuestModel
import com.devmasterteam.convidados.view.listener.GuestListener
import com.devmasterteam.convidados.view.viewholder.GuestViewHolder

class GuestAdapter : RecyclerView.Adapter<GuestViewHolder>() {

    // Lista de convidados
    private var mGuestList: List<GuestModel> = arrayListOf()
    private lateinit var mListener: GuestListener

    /**
     * Faz a criação do layout da linha
     * Faz a criação de várias linhas que vão mostrar cada um dos convidados
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GuestViewHolder {
        val itemBinding =
            RowGuestBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return GuestViewHolder(itemBinding, mListener)
    }

    /**
     * Qual o tamanho da RecyclerView
     */
    override fun getItemCount(): Int {
        return mGuestList.count()
    }

    /**
     * Para cada linha, este método é chamado
     * É responsável por atribuir os valores de cada item para uma linha específica
     */
    override fun onBindViewHolder(holder: GuestViewHolder, position: Int) {
        holder.bind(mGuestList[position])
    }

    /**
     * Atualização da lista de convidados
     */
    fun updateGuests(list: List<GuestModel>) {
        mGuestList = list
        notifyDataSetChanged()
    }

    /**
     * Eventos na listagem
     */
    fun attachListener(listener: GuestListener) {
        mListener = listener
    }

}