package com.dicoding.picodiploma.myapprestoproto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.dicoding.picodiploma.myapprestoproto.ui.theme.MyAppRestoProtoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAppRestoProtoTheme {
                MyApplication()
            }
        }
    }
}

