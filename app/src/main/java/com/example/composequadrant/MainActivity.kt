package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeQuadrantScreen()
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrantScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(0.5f).fillMaxHeight(0.5f).padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = "Text composable",
            )
            Text(
                text = "Displays text and follows the recommended Material Design guidelines.",
                textAlign = TextAlign.Justify
            )
        }
        Column(
            modifier = Modifier.fillMaxWidth(0.5f).fillMaxHeight(0.5f).offset(x = 196.dp).padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Image composable",
            )
            Text(
                text = "Creates a composable that lays out and draws a given Painter class object.",
                textAlign = TextAlign.Justify
            )
        }
        Column (
            modifier = Modifier.fillMaxWidth(0.5f).fillMaxHeight(0.5f).offset(y = 425.dp).padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(
                text = "Row composable",
            )
            Text(
                text = "A layout composable that places its children in a horizontal sequence.",
                textAlign = TextAlign.Justify
            )
        }
        Column (
            modifier = Modifier.fillMaxWidth(0.5f).fillMaxHeight(0.5f).offset(x = 196.dp, y = 425.dp).padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Column composable",
            )
            Text(
                text = "A layout composable that places its children in a vertical sequence.",
                textAlign = TextAlign.Justify
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        ComposeQuadrantScreen()
    }
}