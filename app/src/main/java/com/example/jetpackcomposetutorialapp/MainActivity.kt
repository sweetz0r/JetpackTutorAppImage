package com.example.jetpackcomposetutorialapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import com.example.jetpackcomposetutorialapp.ui.theme.JetpackComposeTutorialAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTutorialAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    JetpackImage(
                        header = stringResource(R.string.header),
                        secondlayer = stringResource(R.string.second_layer),
                        thirdlayer = stringResource(R.string.third_layer)
                    )
                }
            }
        }
    }
}

@Composable
fun JetpackText(header: String,secondlayer: String, thirdlayer: String, modifier: Modifier = Modifier) {
    Column {
        Text(
            text = header,
            fontSize = 24.sp,
            modifier = modifier.padding(16.dp)
        )
        Text(
            text = secondlayer,
            modifier = modifier.padding(16.dp),
            textAlign = TextAlign.Justify

        )
        Text(
            text = thirdlayer,
            modifier = modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}
@Composable
fun JetpackImage(header: String,secondlayer: String, thirdlayer: String, modifier: Modifier = Modifier) {
val image = painterResource(R.drawable.bg_compose_background)
    Column {
        Image(
            painter = image,
            contentDescription = null,
            //contentScale = ContentScale.Crop ne nujno okazivaetsya:D


        )
        JetpackText(
            header = header,
            secondlayer = secondlayer,
            thirdlayer = thirdlayer,
            modifier = Modifier
                //.fillMaxSize() подумать почему эта команда ломает весь код

        )
    }

}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun GreetingPreview() {
    JetpackComposeTutorialAppTheme {
        //Greeting("Android")
    }
}