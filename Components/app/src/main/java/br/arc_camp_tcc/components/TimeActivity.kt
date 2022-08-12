package br.arc_camp_tcc.components

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.DatePicker
import android.widget.TimePicker
import android.widget.Toast
import br.arc_camp_tcc.components.databinding.ActivityTimeBinding
import java.text.SimpleDateFormat
import java.util.*

class TimeActivity : AppCompatActivity(), View.OnClickListener , DatePickerDialog.OnDateSetListener,
TimePickerDialog.OnTimeSetListener{

    private lateinit var binding: ActivityTimeBinding

    private val mSimpleDate = SimpleDateFormat("dd/MM/yyyy")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTimeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Datepicker
        binding.buttonDate.setOnClickListener(this)

        // Timepicker
        binding.buttonTime.setOnClickListener(this)
        

        supportActionBar?.hide()
    }

    override fun onClick(v: View) {
        if(v.id == R.id.button_date){

            // passar datas
            val calendar = Calendar.getInstance()
            val day = calendar.get(Calendar.DAY_OF_MONTH)
            val month = calendar.get(Calendar.MONTH)
            val year = calendar.get(Calendar.YEAR)

            DatePickerDialog(this, this, year, month, day).show()
        }else if(v.id == R.id.button_time){
            TimePickerDialog(this, this, 1, 1, false).show()
        }

    }

    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
        val date = Calendar.getInstance()
        date.set(year, month, dayOfMonth)
        binding.buttonDate.text = mSimpleDate.format(date)
    }

    override fun onTimeSet(view: TimePicker?, hourOfDay: Int, minute: Int) {
        toast("$hourOfDay: $minute")
    }

    private fun toast(str: String){
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show()
    }

}