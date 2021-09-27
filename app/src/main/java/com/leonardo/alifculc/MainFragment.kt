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
    private lateinit var rePayThreeTxt: TextView
    private lateinit var rePaySixTxt: TextView
    private lateinit var rePayNineTxt: TextView
    private lateinit var rePayTwelveTxt: TextView
    private lateinit var rePayFifteenTxt: TextView
    private lateinit var rePayEighteenTxt: TextView
    private lateinit var rePayTwentyFourTxt: TextView

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

        rePayThreeTxt = view.findViewById(R.id.re_payment_Three)
        rePaySixTxt = view.findViewById(R.id.re_payment_Six)
        rePayNineTxt = view.findViewById(R.id.re_payment_Nine)
        rePayTwelveTxt = view.findViewById(R.id.re_payment_Twelve)
        rePayFifteenTxt = view.findViewById(R.id.re_payment_fifteen)
        rePayEighteenTxt = view.findViewById(R.id.re_payment_Eighteen)
        rePayTwentyFourTxt = view.findViewById(R.id.re_payment_TwentyFour)


        editTxt =view.findViewById(R.id.editText)


        btn = view.findViewById(R.id.btnCount)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        viewModel.name.observe(viewLifecycleOwner){
            txtThreeMonth.text = it.toString()
        }



        btn.setOnClickListener {
            val getEdit = editTxt.text.toString()

            if(getEdit.isEmpty()){
                Toast.makeText(requireContext(), "put number", Toast.LENGTH_SHORT).show()
            }else{
                val inputD: Double = getEdit.toDouble()

                val rePayThree = (((inputD * 6)/100) + inputD)
                val rePayResult = String.format("%.2f", rePayThree)
                rePayThreeTxt.text = rePayResult
                val sumThree = (((inputD * 6)/100) + inputD)/3
                val sumThreeResult = String.format("%.2f", sumThree)
                viewModel.name.value =  sumThree

                val rePaySix = (((inputD * 10)/100) + inputD)
                val rePayResultSix = String.format("%.2f", rePaySix)
                rePaySixTxt.text = rePayResultSix
                val sumSix = (((inputD * 10)/100) + inputD)/6
                val sumSixResult = String.format("%.2f", sumSix)
                txtSixMonth.text = sumSixResult


                val rePayNine = (((inputD * 15)/100) + inputD)
                val rePayResultNine = String.format("%.2f", rePayNine)
                rePayNineTxt.text = rePayResultNine
                val sumNine = (((inputD * 15)/100) + inputD)/9
                val sumNineResult = String.format("%.2f", sumNine)
                txtNineMonth.text = sumNineResult


                val rePayTwelve = (((inputD * 20)/100) + inputD)
                val rePayResultTwelve = String.format("%.2f", rePayTwelve)
                rePayTwelveTxt.text = rePayResultTwelve
                val sumTwelve = (((inputD * 20)/100) + inputD)/12
                val sumTwelveResult = String.format("%.2f", sumTwelve)
                txtTwelveMonth.text = sumTwelveResult

                val rePayFifteen = (((inputD * 24)/100) + inputD)
                val rePayResultFifteen = String.format("%.2f", rePayFifteen)
                rePayFifteenTxt.text = rePayResultFifteen
                val sumFifteen = (((inputD * 24)/100) + inputD)/15
                val sumFifteenResult = String.format("%.2f", sumFifteen)
                txtFifteenMonth.text = sumFifteenResult


                val rePayEighteen = (((inputD * 27)/100) + inputD)
                val rePayResultEighteen = String.format("%.2f", rePayEighteen)
                rePayEighteenTxt.text = rePayResultEighteen
                val sumEighteen = (((inputD * 27)/100) + inputD)/18
                val sumEighteenResult = String.format("%.2f", sumEighteen)
                txtEighteenMonth.text = sumEighteenResult


                val rePayTwentyFour = (((inputD * 30)/100) + inputD)
                val rePayResultTwentyFour = String.format("%.2f", rePayTwentyFour)
                rePayTwentyFourTxt.text = rePayResultTwentyFour
                val sumTwentyFour = (((inputD * 30)/100) + inputD)/24
                val sumTwentyFourResult = String.format("%.2f", sumTwentyFour)
                txtTwentyFourMonth.text = sumTwentyFourResult

            }

        }

    }

}
