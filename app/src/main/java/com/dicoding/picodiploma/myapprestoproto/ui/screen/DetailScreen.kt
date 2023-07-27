package com.dicoding.picodiploma.myapprestoproto.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.dicoding.picodiploma.myapprestoproto.ui.getFoodById
import com.dicoding.picodiploma.myapprestoproto.R

@Composable
fun DetailScreen(foodId: String?, navController: NavController) {
    val food = remember { getFoodById(foodId) }
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Detail ${food?.name}") },
                navigationIcon = {
                    IconButton(onClick = { navController.navigate("home") }) {
                        Icon(Icons.Filled.ArrowBack, contentDescription = "Back")
                    }
                }
            )
        }
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Image(
                painter = painterResource(food?.imageResId ?: R.drawable.placeholder),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = food?.name ?: "", fontSize = 24.sp)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = food?.description ?: "")
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Ingredients:", fontSize = 18.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(4.dp))
            food?.ingredients?.forEach { ingredient ->
                Text(text = "• $ingredient")
            }
        }
    }
}