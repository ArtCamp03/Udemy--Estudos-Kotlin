package br.arc_campos.convidados.view

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import br.arc_campos.convidados.constants.DataBaseConstants
import br.arc_campos.convidados.databinding.FragmentGalleryBinding
import br.arc_campos.convidados.databinding.FragmentPresentBinding
import br.arc_campos.convidados.view.adapter.GuestsAdapter
import br.arc_campos.convidados.view.listener.OnGuestListener
import br.arc_campos.convidados.viewModel.GuestsViewModel

class PresentFragment : Fragment() {

    private var _binding: FragmentGalleryBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: GuestsViewModel
    private val adapter = GuestsAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel = ViewModelProvider(this).get(GuestsViewModel::class.java)
        _binding = FragmentPresentBinding.inflate(inflater, container, false)
        // val root: View = binding.root

        binding.recyclerGuests.layoutManager = LinearLayoutManager(context)
        binding.recyclerGuests.adapter = adapter

        val listener = object : OnGuestListener {
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
                viewModel.getPresent()
            }

        }

        adapter.attachListenner(listener)

        observe()

        /*
            val textView: TextView = binding.textGallery
            presentViewModel.text.observe(viewLifecycleOwner) {
                textView.text = it
            }
         */

        return binding.root
    }

    override fun onResume() {
        super.onResume()
        viewModel.getPresent()
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