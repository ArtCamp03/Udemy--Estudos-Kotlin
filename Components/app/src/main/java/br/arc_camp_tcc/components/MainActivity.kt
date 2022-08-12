package br.arc_camp_tcc.components

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.*
import br.arc_camp_tcc.components.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(), View.OnClickListener, AdapterView.OnItemSelectedListener,
    SeekBar.OnSeekBarChangeListener, CompoundButton.OnCheckedChangeListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.buttonToast.setOnClickListener(this)
        binding.buttonSnake.setOnClickListener(this)

        // button Spinner
        binding.spinerStatic.onItemSelectedListener = this

        //Spinner
        binding.buttonGetSpinner.setOnClickListener(this)
        binding.buttonSetSpinner.setOnClickListener(this)

        //SeekBar
        binding.seekbar.setOnSeekBarChangeListener(this)

        binding.buttonGetSeekbar.setOnClickListener(this)
        binding.buttonSetSeekbar.setOnClickListener(this)

        // switch
        binding.switchOnOff.setOnCheckedChangeListener(this)

        // checkBox
        binding.checkOnOff.setOnCheckedChangeListener(this)

        // Radio Group
        binding.radioOn.setOnCheckedChangeListener(this)
        binding.radioOff.setOnCheckedChangeListener(this)

        loadSpinner()

        supportActionBar?.hide()
    }

    override fun onClick(v: View) {
        if (v.id == R.id.button_toast) {
            val toast = Toast.makeText(this, "Botao Toast", Toast.LENGTH_SHORT)

            // encontra o nome do elemento
            val textView = toast.view?.findViewById<TextView>(android.R.id.message)
            if (textView != null) {
                textView.setTextColor(Color.RED)

                // seta a gravidade do Toast
                toast.setGravity(Gravity.TOP, 0, 250)

                // toast personalizada
                val layout = layoutInflater.inflate(R.layout.toast_layout, null)
                toast.view = layout

                toast.show()

                //toast("Funcao -> TOAST")
            } else if (v.id == R.id.button_snake) {
                val linear = binding.linearRoot
                val snake = Snackbar.make(linear, "Snake", Snackbar.LENGTH_SHORT)

                // açao na SnackBar
                snake.setAction("Desafazer", View.OnClickListener {
                    toast("Desfeito !!")
                })

                // cor
                snake.setActionTextColor(Color.GREEN)

                // plano de fundo
                snake.setBackgroundTint(Color.BLACK)

                snake.show()
            } else if (v.id == R.id.button_get_spinner) {
                val selectedItem = binding.spinerStatic.selectedItem
                val selectedItemId = binding.spinerStatic.selectedItemId
                val selectedItemPosition = binding.spinerStatic.selectedItemPosition

                toast("Position: $selectedItemId : $selectedItem")
            } else if (v.id == R.id.button_set_spinner) {
                binding.spinerStatic.setSelection(2)
            } else if (v.id == R.id.button_get_seekbar) {
                toast("Seekbar: ${binding.seekbar}")
            } else if (v.id == R.id.button_set_seekbar) {
                toast("altearado com sucesso")
            }
        }
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        if (parent != null) {
            if (parent.id == R.id.spiner_static) {
                toast(parent?.getItemAtPosition(position).toString())
            }
        }
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        toast("Nothing")
    }

    override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
        if (binding.seekbar.id == R.id.seekbar) {
            toast("Progress")
        }
    }

    override fun onStartTrackingTouch(seekBar: SeekBar?) {
        toast("Track started")
    }

    override fun onStopTrackingTouch(seekBar: SeekBar?) {
        toast("Track stoped")
    }

    override fun onCheckedChanged(buttonView: CompoundButton, isChecked: Boolean) {
        if (buttonView.id == R.id.switch_on_off) {
            if (isChecked) {
                toast("true")
            } else {
                toast("false")
            }
            //binding.switchOnOff.isChecked = true
        } else if (buttonView.id == R.id.check_on_off) {
            if (isChecked) {
                toast("true")
            } else {
                toast("false")
            }
            // binding.checkOnOff.isChecked = true
        } else if (buttonView.id == R.id.radio_on) {
            toast("true")
        } else if (buttonView.id == R.id.radio_off) {
            toast("false")
        }
    }


    private fun loadSpinner() {
        val mList = listOf("Gramas", "Kg", "Arroba", "Tonelada")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, mList)
        binding.spinerDinamic.adapter = adapter
    }

    private fun toast(str: String) {
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show()
    }

}