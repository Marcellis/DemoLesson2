package com.example.demolesson3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.demolesson3.ui.theme.DemoLesson2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DemoLesson2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    val navController = rememberNavController()
                    DemoNavHost(navController = navController, modifier = Modifier)
                }
            }
        }
    }
}

/**
 * You can see this as a nav_graph.xml in compose environment.
 */
@Composable
private fun DemoNavHost(
    navController: NavHostController, modifier: Modifier
) {
    val viewModel: DemoViewModel = viewModel()

    NavHost(
        navController = navController,
        startDestination = DemoScreens.Screen1.name,
        modifier = modifier
    ) {
        composable(route = DemoScreens.Screen1.name) {
            Screen1(navController, viewModel)
        }
 //       composable(route = RemindersScreens.NewReminder.name) {
 //           AddReminderScreen(navController, viewModel)
        }
    }







