package com.dicoding.picodiploma.myapprestoproto

import android.content.res.Configuration
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dicoding.picodiploma.myapprestoproto.ui.screen.DetailScreen
import com.dicoding.picodiploma.myapprestoproto.ui.screen.HomeScreen
import com.dicoding.picodiploma.myapprestoproto.ui.screen.ProfileScreen
import com.dicoding.picodiploma.myapprestoproto.ui.theme.MyAppRestoProtoTheme

@Composable
fun MyApplication() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home") {
        composable("home") { HomeScreen(navController) }
        composable("detail/{foodId}") { backStackEntry ->
            val foodId = backStackEntry.arguments?.getString("foodId")
            DetailScreen(foodId, navController)
        }
        composable("profile") { ProfileScreen(navController) }
    }
}

@Preview(
    showSystemUi = true,
    showBackground = true,
    device = Devices.PIXEL_4
)
@Preview(
    showBackground = true,
    device = Devices.PIXEL_4,
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Composable
fun DefaultPreview(){
    MyAppRestoProtoTheme {
        MyApplication()
    }
}