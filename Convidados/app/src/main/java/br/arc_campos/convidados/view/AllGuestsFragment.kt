package br.arc_campos.convidados.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.arc_campos.convidados.databinding.FragmentHomeBinding
import br.arc_campos.convidados.view.adapter.GuestsAdapter
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