package com.example.scrollablegallery

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ScrollableGalleryScreen(){
    Column(Modifier.verticalScroll(rememberScrollState())
    ) {
        repeat(10){
            Row{
                repeat(2) {
                    GalleryCell()
                }

            }
        }
    }

}

@Composable
fun GalleryCell(){
    Card(
        elevation = CardDefaults.cardElevation(16.dp),
        modifier = Modifier.padding(8.dp)
    ) {
        Box(
            modifier = Modifier
                .requiredSize(180.dp)
        ) {

            Image(
                painter = painterResource(id = R.drawable.greeksalad),
                contentDescription = null
            )

            Text(
                text ="Greek Salad",
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .background(Color.Gray)
            )

            Text(
                text ="$15.00",
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .background(Color.Gray)
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GalleryCellPreview(){

    GalleryCell()
}