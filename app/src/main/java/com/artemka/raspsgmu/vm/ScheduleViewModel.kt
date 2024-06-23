package com.artemka.raspsgmu.vm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

//@HiltViewModel
//class ScheduleViewModel @Inject constructor(
//    private val apiService: ApiService
//) : ViewModel() {
//    private val _scheduleItems = MutableLiveData<List<ScheduleItem>>()
//    val scheduleItems: LiveData<List<ScheduleItem>> = _scheduleItems
//
//    init {
//        fetchSchedule()
//    }
//
//    private fun fetchSchedule() {
//        viewModelScope.launch {
//            try {
//                val items = apiService.getSchedule()
//                _scheduleItems.value = items
//            } catch (e: Exception) {
//                // handle the error
//            }
//        }
//    }
//}
