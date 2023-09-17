package ren.wenchao.quadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ren.wenchao.quadrant.ui.theme.QuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    QuadrantRendering()
                }
            }
        }
    }
}


@Composable
fun QuadrantRendering() {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.weight(1f)
        ) {
            QuadrantPartRendering(
                "Text composable",
                "Displays text and follows the recommended Material Design guidelines.",
                Modifier
                    .weight(1f)
                    .background(Color(0xFFEADDFF))
            )
            QuadrantPartRendering(
                "Image composable",
                "Creates a composable that lays out and draws a given Painter class object.",
                Modifier
                    .weight(1f)
                    .background(Color(0xFFD0BCFF))
            )
        }
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.weight(1f)
        ) {
            QuadrantPartRendering(
                "Row composable",
                "A layout composable that places its children in a horizontal sequence.",
                Modifier
                    .weight(1f)
                    .background(Color(0xFFB69DF8))
            )
            QuadrantPartRendering(
                "Column composable",
                "A layout composable that places its children in a vertical sequence.",
                Modifier
                    .weight(1f)
                    .background(Color(0xFFF6EDFF))
            )
        }
    }
}

@Composable
fun QuadrantPartRendering(title: String, body: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
    ) {
        Text(
            text = title,
            modifier = Modifier
                .padding(bottom = 16.dp),
//                .align(alignment = Alignment.CenterHorizontally),
            fontWeight = FontWeight.Bold,
        )
        Text(
            text = body,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuadrantTheme {
        QuadrantRendering()
    }
}