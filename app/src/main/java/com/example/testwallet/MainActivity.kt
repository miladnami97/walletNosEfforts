
package com.example.testwallet

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import android.annotation.SuppressLint as SuppressLint1

@SuppressLint1("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAndBottomScreen() {
    var selectedTab by remember { mutableStateOf(0) }

    Scaffold(
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White)
            ) {
                // Your top box
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(800.dp) // Adjust the height as needed
                        .background(Color.White)
                ) {
/*
                    Image(painter = painterResource(id = R.drawable.debian),
                        contentDescription = null,
                        modifier = Modifier
                            .align(Alignment.TopCenter)
                            .padding(vertical = 50.dp, horizontal = 15.dp)
                    )
*/
                    SampleCard()

                }

                // Your main content goes here
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                ) {
                    Image(painter = painterResource(id = R.drawable.cards),
                        contentDescription = null,
                        modifier = Modifier
                            .clickable { println("Button Clicked?") }
                            .align(Alignment.BottomCenter)
                    )

                }
            }
        }
    )
}

@Composable
fun SampleCard(backgroundColor: Color = Color.Red) {
    Card(
        modifier = Modifier
            .height(210.dp)
            .width(380.dp)
            .fillMaxWidth(.8f)
            .padding(vertical = 20.dp, horizontal = 10.dp)
            .padding(start = 10.dp),
        colors = CardDefaults.cardColors(containerColor = backgroundColor),
        shape = RoundedCornerShape(12.dp)
    ){
    }
}


@Preview
@Composable
fun Preview() {

    TopAndBottomScreen()

    SampleCard()
}