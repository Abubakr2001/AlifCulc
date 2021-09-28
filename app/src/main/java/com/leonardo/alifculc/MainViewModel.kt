package com.leonardo.alifculc

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    val txtThree = MutableLiveData<Double>()
    val txtSix = MutableLiveData<Double>()
    val txtNine = MutableLiveData<Double>()
    val txtTwelve = MutableLiveData<Double>()
    val txtFifteen = MutableLiveData<Double>()
    val txtEighteen = MutableLiveData<Double>()
    val txtTwentyFour = MutableLiveData<Double>()
}