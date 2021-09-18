package com.leonardo.alifculc

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
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
        val txtEdit =editTxt.text.toString().toInt()
        btn = view.findViewById(R.id.btnCount)

        val threePercent = 0.03
        val sixPercent = 0.06
        val ninePercent = 0.15
        val twelvePercent = 0.20
        val fifteenPercent = 0.24
        val  eighteenPercent = 0.27
        val twentyFourPercent = 0.30
        

        btn.setOnClickListener {
           // txtThreeMonth.setText((txtEdit + threePercent)/3)
        }

    }
    companion object {
        fun newInstance() = MainFragment()
    }
}
