package br.arc_campos.convidados.view

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.arc_campos.convidados.constants.DataBaseConstants
import br.arc_campos.convidados.databinding.FragmentHomeBinding
import br.arc_campos.convidados.view.adapter.GuestsAdapter
import br.arc_campos.convidados.view.listener.OnGuestListener
import br.arc_campos.convidados.viewModel.AllGuestsViewModel
import kotlinx.android.synthetic.main.nav_header_main.*

class AllGuestsFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: AllGuestsViewModel
    private val adapter = GuestsAdapter()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, b: Bundle?): View {
        viewModel = ViewModelProvider(this).get(AllGuestsViewModel::class.java)
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        // lauout
        binding.recyclerAllGuests.layoutManager = LinearLayoutManager(context)

        //Adapter eh a cola entre funçao e layout
        binding.recyclerAllGuests.adapter = adapter

        val listener = object : OnGuestListener{
            override fun onClick(id: Int) {
                //Toast.makeText(context, "Alo fui clicado", Toast.LENGTH_SHORT).show()
                val intent = Intent(context, GuestFormActivity::class.java)

                val bundle = Bundle()
                bundle.putInt(DataBaseConstants.GUEST.ID, id)
                intent.putExtras(bundle)

                startActivity(intent)
            }

            override fun onDelete(id: Int) {
                viewModel.delete(id)
                viewModel.getAll()
            }

        }

        adapter.attachListenner(listener)

        viewModel.getAll()

        observe()

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun observe(){
        viewModel.guests.observe(viewLifecycleOwner){
            adapter.updateGuests(it)
        }
    }

}