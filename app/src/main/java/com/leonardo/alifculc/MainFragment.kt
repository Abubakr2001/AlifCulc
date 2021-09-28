package com.leonardo.alifculc


import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import java.util.stream.Stream


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
    private lateinit var plusThree: TextView
    private lateinit var plussSix: TextView
    private lateinit var plussNine: TextView
    private lateinit var plussTwelve: TextView
    private lateinit var plussFifteen: TextView
    private lateinit var plussEighteen: TextView
    private lateinit var plussTwentyFour: TextView

    lateinit var editTxt: EditText
    lateinit var btn: Button

    private lateinit var viewModel: MainViewModel

    companion object {
        fun newInstance() = MainFragment()
    }


    @SuppressLint("SetTextI18n")
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

        plusThree = view.findViewById(R.id.plusThree)
        plussSix = view.findViewById(R.id.plusSix)
        plussNine = view.findViewById(R.id.plusNine)
        plussTwelve = view.findViewById(R.id.plusTwelve)
        plussFifteen = view.findViewById(R.id.plusFifteen)
        plussEighteen = view.findViewById(R.id.plusEighteen)
        plussTwentyFour = view.findViewById(R.id.plusTwentyFour)

        editTxt =view.findViewById(R.id.editText)

        btn = view.findViewById(R.id.btnCount)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)


        viewModel.txtThree.observe(viewLifecycleOwner){
            txtThreeMonth.text = String.format("%.2f", it)
        }
        viewModel.txtSix.observe(viewLifecycleOwner){
            txtSixMonth.text = String.format("%.2f", it)
        }
        viewModel.txtNine.observe(viewLifecycleOwner){
            txtNineMonth.text = String.format("%.2f", it)
        }
        viewModel.txtTwelve.observe(viewLifecycleOwner){
            txtTwelveMonth.text = String.format("%.2f", it)
        }
        viewModel.txtFifteen.observe(viewLifecycleOwner){
            txtFifteenMonth.text = String.format("%.2f", it)
        }
        viewModel.txtEighteen.observe(viewLifecycleOwner){
            txtEighteenMonth.text = String.format("%.2f", it)
        }
        viewModel.txtTwentyFour.observe(viewLifecycleOwner){
            txtTwentyFourMonth.text = String.format("%.2f", it)
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
                viewModel.txtThree.value =  sumThree

                val rePaySix = (((inputD * 10)/100) + inputD)
                val rePayResultSix = String.format("%.2f", rePaySix)
                rePaySixTxt.text = rePayResultSix
                val sumSix = (((inputD * 10)/100) + inputD)/6
                viewModel.txtSix.value = sumSix

                val rePayNine = (((inputD * 15)/100) + inputD)
                val rePayResultNine = String.format("%.2f", rePayNine)
                rePayNineTxt.text = rePayResultNine
                val sumNine = (((inputD * 15)/100) + inputD)/9
                viewModel.txtNine.value = sumNine


                val rePayTwelve = (((inputD * 20)/100) + inputD)
                val rePayResultTwelve = String.format("%.2f", rePayTwelve)
                rePayTwelveTxt.text = rePayResultTwelve
                val sumTwelve = (((inputD * 20)/100) + inputD)/12
                viewModel.txtTwelve.value = sumTwelve

                val rePayFifteen = (((inputD * 24)/100) + inputD)
                val rePayResultFifteen = String.format("%.2f", rePayFifteen)
                rePayFifteenTxt.text = rePayResultFifteen
                val sumFifteen = (((inputD * 24)/100) + inputD)/15
                viewModel.txtFifteen.value = sumFifteen


                val rePayEighteen = (((inputD * 27)/100) + inputD)
                val rePayResultEighteen = String.format("%.2f", rePayEighteen)
                rePayEighteenTxt.text = rePayResultEighteen
                val sumEighteen = (((inputD * 27)/100) + inputD)/18
                viewModel.txtEighteen.value = sumEighteen

                val rePayTwentyFour = (((inputD * 30)/100) + inputD)
                val rePayResultTwentyFour = String.format("%.2f", rePayTwentyFour)
                rePayTwentyFourTxt.text = rePayResultTwentyFour
                val sumTwentyFour = (((inputD * 30)/100) + inputD)/24
                viewModel.txtTwentyFour.value = sumTwentyFour


                val plusTree = ((inputD * 6)/100)
                val rePlusTree = String.format("%.2f", plusTree)
                plusThree.text = "+$rePlusTree"

                val plusSix = ((inputD * 10)/100)
                val rePlusSix = String.format("%.2f", plusSix)
                plussSix.text= "+$rePlusSix"

                val plusNine = ((inputD * 15)/100)
                val rePlusNine = String.format("%.2f", plusNine)
                plussNine.text = "+$rePlusNine"

                val plusTwelve = ((inputD * 20)/100)
                val rePlusTwelve = String.format("%.2f", plusTwelve)
                plussTwelve.text = "+$rePlusTwelve"


                val plusFifteen = ((inputD * 24)/100)
                val rePlusFifteen = String.format("%.2f", plusFifteen)
                plussFifteen.text = "+$rePlusFifteen"

                val plusEighteen= ((inputD * 27)/100)
                val rePlusEighteen= String.format("%.2f", plusEighteen)
                plussEighteen.text = "+$rePlusEighteen"

                val plusTwentyFour = ((inputD * 30)/100)
                val rePlusTwentyFour = String.format("%.2f", plusTwentyFour)
                plussTwentyFour.text = "+$rePlusTwentyFour"


            }
        }
    }
}
