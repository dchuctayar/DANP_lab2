package com.example.danp_lab2.Screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.navigation.NavHostController

@Composable
fun HomeView(navCotroller: NavHostController) {

    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {

        Button(onClick = { navCotroller.navigate("courseRegister") }) {
            Text(text = "Registrar Curso")
        }

        Button(onClick = { navCotroller.navigate("studentRegister") }) {
            Text(text = "Registrar Estudiante")
        }

        Button(onClick = { navCotroller.navigate("list") }) {
            Text(text = "Listar")
        }
    }
}