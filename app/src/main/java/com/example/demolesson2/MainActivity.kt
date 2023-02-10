package com.example.demolesson2

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.demolesson2.ui.theme.DemoLesson2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DemoLesson2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SimpleButton2()
                }
            }
        }
    }
}


@Composable
fun SimpleButton1() {

    Column (
        horizontalAlignment = Alignment.Companion.CenterHorizontally,
        verticalArrangement = Arrangement.Center
            )
    {

        //step 1
        var count: Int = 0

        Button(onClick = {
            //your onclick code here
            count++
        }) {
            Text(text = "Total $count")
        }
    }
}

@SuppressLint("UnrememberedMutableState")
@Composable
fun SimpleButton2() {
    Column (
        horizontalAlignment = Alignment.Companion.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )
    {

        //step 2
        var count: MutableState<Int> = mutableStateOf(0)

        Button(onClick = {
            //your onclick code here
            count.value++
        }) {
            Text(text = "Total ${count.value}")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DemoLesson2Theme {
        SimpleButton1()
    }
}