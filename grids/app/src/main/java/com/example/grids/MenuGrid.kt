package com.example.grids

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
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
fun MenuGrid(){
        Column(
            Modifier.verticalScroll(rememberScrollState())
        ) {
            repeat(10){
                Row(Modifier.fillMaxWidth()) {
                    repeat(2){
                        GridCell()

                    }

                }

            }
        }
}

@Composable
fun GridCell(){
    Card(
        elevation = CardDefaults.cardElevation(16.dp),
        modifier = Modifier.padding(8.dp)

    ){
        Box(
            modifier = Modifier
                .requiredSize(180.dp)
                .padding(8.dp)
        ){
            Image(
                painter = painterResource(id = R.drawable.lillemon),
                contentDescription = null
            )
            Text(
                text = "yoyoyyoo",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(4.dp)
                    .background(Color.White)
                    .align(Alignment.TopStart)
            )
            Text(
                text = "$12.55",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .background(Color.White)
                    .padding(4.dp)
                    .align(Alignment.BottomCenter)
                )
        }
    }

}

@Preview(showBackground =  true)
@Composable
fun GridCellPreview(){
    GridCell()
}