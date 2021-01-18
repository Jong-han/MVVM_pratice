package halla.icsw.mvvm_pratice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.view.View
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.Factory
import halla.icsw.mvvm_pratice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){

    lateinit var binding : ActivityMainBinding
    val myHeight: MyHeight by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.lifecycleOwner = this // setLifecycleOwner
        binding.viewModel = myHeight // setViewModel
    }
}