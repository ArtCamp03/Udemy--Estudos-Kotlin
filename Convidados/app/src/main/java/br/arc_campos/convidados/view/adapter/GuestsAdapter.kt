package br.arc_campos.convidados.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.arc_campos.convidados.databinding.RowGuestBinding
import br.arc_campos.convidados.service.model.GuestModel
import br.arc_campos.convidados.view.listener.OnGuestListener
import br.arc_campos.convidados.view.viewholder.GuestViewHolder

class GuestsAdapter: RecyclerView.Adapter<GuestViewHolder>() {

    companion object{
        var countCreate = 0
        var countBind = 0
    }

    private var guestList: List<GuestModel> = listOf()
    private lateinit var listener: OnGuestListener

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GuestViewHolder{
        countCreate++
        val item = RowGuestBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return GuestViewHolder(item, listener)
    }

    override fun onBindViewHolder(holder: GuestViewHolder, position: Int) {
        countBind++
        holder.bind(guestList[position])
    }

    override fun getItemCount(): Int{
        return guestList.count()
    }

    fun updateGuests(list: List<GuestModel>) {
        guestList = list
        notifyDataSetChanged()
    }

    fun attachListenner(guestListener: OnGuestListener){
        listener == guestListener
    }

}