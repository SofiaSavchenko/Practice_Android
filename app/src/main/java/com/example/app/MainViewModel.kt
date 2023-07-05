package com.example.app

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(context: Context) : ViewModel() {

    private val _usageLevel: MutableLiveData<String> =
        MutableLiveData(context.getString(R.string.usage_level))
    val usageLevel: LiveData<String> = _usageLevel

    private val _description: MutableLiveData<String> =
        MutableLiveData(context.getString(R.string.description_game))
    val description: LiveData<String> = _description

    private val _rating: MutableLiveData<String> =
        MutableLiveData(context.getString(R.string.rating))
    val rating: LiveData<String> = _rating

    private val _reviews: MutableLiveData<String> =
        MutableLiveData(context.getString(R.string.reviews))
    val reviews: LiveData<String> = _reviews

    private val _installButtonName: MutableLiveData<String> =
        MutableLiveData(context.getString(R.string.installButton_name))
    val installButtonName: LiveData<String> = _installButtonName

}