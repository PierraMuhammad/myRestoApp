package com.dicoding.picodiploma.myapprestoproto.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.dicoding.picodiploma.myapprestoproto.ui.data.User
import com.dicoding.picodiploma.myapprestoproto.R

@Composable
fun ProfileScreen(navController: NavController) {
    val user = User("Pierra Muhammad Shobr", "pierrams1@gmail.com", R.drawable.profile_picture)
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Profile") },
                navigationIcon = {
                    IconButton(onClick = { navController.navigate("home") }) {
                        Icon(Icons.Filled.ArrowBack, contentDescription = "Back")
                    }
                }
            )
        },
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(32.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(user.profilePictureResId),
                    contentDescription = null,
                    modifier = Modifier
                        .size(120.dp)
                        .padding(bottom = 1.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
                Text(text = user.fullName, fontSize = 24.sp)
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = user.email)
                Spacer(modifier = Modifier.height(16.dp))
            }
        }
    )
}