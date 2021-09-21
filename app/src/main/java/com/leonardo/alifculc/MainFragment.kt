package com.leonardo.alifculc


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider


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

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        btn.setOnClickListener {
            val getEdit = editTxt.text.toString()

            if(getEdit.isEmpty()){
                Toast.makeText(requireContext(), "put number", Toast.LENGTH_SHORT).show()
            }else{
                val inputD: Double = getEdit.toDouble()

                val sumThree = (((inputD * 6)/100) + inputD)/3
                val sumThreeResult = String.format("%.2f", sumThree)
                txtThreeMonth.text = sumThreeResult

                val sumSix = (((inputD * 10)/100) + inputD)/6
                val sumSixResult = String.format("%.2f", sumSix)
                txtSixMonth.text = sumSixResult

                val sumNine = (((inputD * 15)/100) + inputD)/9
                val sumNineResult = String.format("%.2f", sumNine)
                txtNineMonth.text = sumNineResult

                val sumTwelve = (((inputD * 20)/100) + inputD)/12
                val sumTwelveResult = String.format("%.2f", sumTwelve)
                txtTwelveMonth.text = sumTwelveResult

                val sumFifteen = (((inputD * 24)/100) + inputD)/15
                val sumFifteenResult = String.format("%.2f", sumFifteen)
                txtFifteenMonth.text = sumFifteenResult

                val sumEighteen = (((inputD * 27)/100) + inputD)/18
                val sumEighteenResult = String.format("%.2f", sumEighteen)
                txtEighteenMonth.text = sumEighteenResult

                val sumTwentyFour = (((inputD * 30)/100) + inputD)/24
                val sumTwentyFourResult = String.format("%.2f", sumTwentyFour)
                txtTwentyFourMonth.text = sumTwentyFourResult

                //fox

            }

        }




    }

}
