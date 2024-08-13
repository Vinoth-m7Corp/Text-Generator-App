package com.devbuvan.textgenerator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.devbuvan.textgenerator.presentation.onbording.OnbordingScreen
import com.devbuvan.textgenerator.presentation.onbording.components.OnBordingScreenPreview
import com.devbuvan.textgenerator.ui.theme.TextGeneratorTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
	super.onCreate(savedInstanceState)
	installSplashScreen()
	enableEdgeToEdge()
	setContent {
	  TextGeneratorTheme {
		  Box(modifier = Modifier.background(MaterialTheme.colorScheme.background)){
		  OnbordingScreen()
		  }
	  }
	}
  }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
  TextGeneratorTheme {

  }
}