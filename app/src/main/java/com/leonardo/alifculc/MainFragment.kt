package com.leonardo.alifculc

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import java.text.DecimalFormat
import kotlin.math.roundToInt
import kotlin.math.roundToLong

class MainFragment : Fragment(R.layout.fragment_main) {
    lateinit var txtThreeMonth: TextView
    lateinit var txtSixMonth: TextView
    lateinit var txtNineMonth: TextView
    lateinit var txtTwelveMonth: TextView
    lateinit var txtFifteenMonth: TextView
    lateinit var txtEighteenMonth: TextView
    lateinit var txtTwentyFourMonth: TextView

    lateinit var editTxt: EditText
    lateinit var btn: Button

    private lateinit var viewModel: MainViewModel



    companion object {
        fun newInstance() = MainFragment()
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        txtThreeMonth =view.findViewById(R.id.ThreeMonthTxtView)
        txtSixMonth = view.findViewById(R.id.SixMonthTxtView)
        txtNineMonth = view.findViewById(R.id.NineMonthTxtView)
        txtTwelveMonth = view.findViewById(R.id.TwelveMonthTxtView)
        txtFifteenMonth = view.findViewById(R.id.FifteenMonthTxtView)
        txtEighteenMonth = view.findViewById(R.id.EighteenMonthTxtView)
        txtTwentyFourMonth = view.findViewById(R.id.TwentyFourMonthTxtView)

        editTxt =view.findViewById(R.id.editText)


        btn = view.findViewById(R.id.btnCount)

        val monthThree = 3
        val threePercent = 6
        val monthSix = 6
        val sixPercent = 10
        val monthNine = 9
        val ninePercent = 15
        val monthTwelve = 12
        val twelvePercent = 20
        val monthFifteen = 15
        val fifteenPercent = 24
        val monthEighteen = 18
        val eighteenPercent = 27
        val monthTwentyFour = 24
        val twentyFourPercent = 30



        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        viewModel.name.observe(viewLifecycleOwner){
            txtThreeMonth.text = it.toString()
        }

        btn.setOnClickListener {
            val getEdit = editTxt.text.toString()

            if(getEdit.isEmpty()){
                Toast.makeText(requireContext(), "puy number", Toast.LENGTH_SHORT).show()
            }else{
                val inputD: Double = getEdit.toDouble()

                val sumThree = (((inputD * threePercent)/100) + inputD)/monthThree
                val sumThreeResult = String.format("%.2f", sumThree).toDouble()
                txtThreeMonth.text = sumThreeResult.toString()

//fklfsdk

                val sumSix = (((inputD * sixPercent)/100) + inputD)/monthSix
                val sumSixResult = String.format("%.2f", sumSix).toDouble()
                txtSixMonth.text = sumSixResult.toString()

                val sumNine = (((inputD * ninePercent)/100) + inputD)/monthNine
                val sumNineResult = String.format("%.2f", sumNine).toDouble()
                txtNineMonth.text = sumNineResult.toString()

                val sumTwelve = (((inputD * twelvePercent)/100) + inputD)/monthTwelve
                val sumTwelveResult = String.format("%.2f", sumTwelve).toDouble()
                txtTwelveMonth.text = sumTwelveResult.toString()

                val sumFifteen = (((inputD * fifteenPercent)/100) + inputD)/monthFifteen
                val sumFifteenResult = String.format("%.2f", sumFifteen).toDouble()
                txtFifteenMonth.text = sumFifteenResult.toString()

                val sumEighteen = (((inputD * eighteenPercent)/100) + inputD)/monthEighteen
                val sumEighteenResult = String.format("%.2f", sumEighteen).toDouble()
                txtEighteenMonth.text = sumEighteenResult.toString()

                val sumTwentyFour = (((inputD * twentyFourPercent)/100) + inputD)/monthTwentyFour
                val sumTwentyFourResult = String.format("%.2f", sumTwentyFour).toDouble()
                txtTwentyFourMonth.text = sumTwentyFourResult.toString()

            }

        }




    }

}
