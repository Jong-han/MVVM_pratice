package halla.icsw.mvvm_pratice

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyHeight : ViewModel() {
    val height = MutableLiveData<Int>()
    init {
        height.value = 10
    }
    fun plus() {
        height.value = height.value?.plus(1)
    }
    fun minus(){
        height.value = height.value?.minus(1)
    }
}