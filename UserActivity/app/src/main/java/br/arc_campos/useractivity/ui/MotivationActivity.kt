package br.arc_campos.useractivity.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import br.arc_campos.useractivity.infra.MotivationConstance
import br.arc_campos.useractivity.R
import br.arc_campos.useractivity.data.Mock
import br.arc_campos.useractivity.infra.SecurityPreference
import br.arc_campos.useractivity.databinding.ActivityMotivationBinding

class MotivationActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMotivationBinding
    private var categoryID = MotivationConstance.FILTER.ALL

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMotivationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // esconde a barra de navegaçao
        supportActionBar?.hide()

        handleUserName()
        handleFilter(R.id.image_all)
        handleNextPhrase()

        //Eventos
        binding.buttonNewPhrase.setOnClickListener(this)
        binding.imageAll.setOnClickListener(this)
        binding.imageEmo.setOnClickListener(this)
        binding.imageSunny.setOnClickListener(this)
        binding.textUserName.setOnClickListener(this)

    }

    override fun onClick(view: View?) {
        if (view != null) {
            if (view.id == R.id.button_new_phrase) {
                handleNextPhrase()
            } else if (view.id in listOf(
                    R.id.image_all,
                    R.id.image_emo,
                    R.id.image_sunny)) {
                handleFilter(view.id)
            }
        }
    }

    private fun handleUserName() {
        val name = SecurityPreference(this).getString(MotivationConstance.KEY.USER_NAME)
        binding.textUserName.text = "Ola, $name!"

    }

    private fun handleFilter(id: Int) {
        //binding.imageAll.setColorFilter(R.color.white)

        binding.imageAll.setColorFilter(ContextCompat.getColor(this, R.color.purple_200))
        binding.imageEmo.setColorFilter(ContextCompat.getColor(this, R.color.purple_200))
        binding.imageSunny.setColorFilter(ContextCompat.getColor(this, R.color.purple_200))

        when (id) {
            R.id.image_all -> {
                binding.imageAll.setColorFilter(ContextCompat.getColor(this, R.color.white))
                //categoryID = 1      magic number
                categoryID = MotivationConstance.FILTER.ALL

            }
            R.id.image_sunny -> {
                binding.imageSunny.setColorFilter(ContextCompat.getColor(this, R.color.white))
                categoryID = MotivationConstance.FILTER.SUNNY
            }
            R.id.image_emo -> {
                binding.imageEmo.setColorFilter(ContextCompat.getColor(this, R.color.white))
                categoryID = MotivationConstance.FILTER.EMO
            }
        }

    }

    private fun handleNextPhrase(){
        binding.textPhase.text = Mock().getPhrase(categoryID)
    }

}