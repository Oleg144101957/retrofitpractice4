package com.vishnevskiypro.retrofitpractice4.screens.first

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vishnevskiypro.retrofitpractice4.data.repository.Repository
import com.vishnevskiypro.retrofitpractice4.model.nal.Nalichka
import kotlinx.coroutines.launch
import retrofit2.Response

class FirstViewModel : ViewModel(){

    val repo = Repository()
    val moneyList: MutableLiveData<Response<Nalichka>> = MutableLiveData()

    fun getNalichkaFromViewModel(){
        viewModelScope.launch {
            moneyList.value = repo.getNalRep()
        }
    }

}