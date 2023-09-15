package com.example.demolesson3

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class DemoViewModel: ViewModel() {
        var count: MutableState<Int> =  mutableStateOf(0)

    }

