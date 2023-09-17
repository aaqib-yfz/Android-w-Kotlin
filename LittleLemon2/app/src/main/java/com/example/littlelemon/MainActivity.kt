package com.example.littlelemon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.littlelemon.ui.theme.LittleLemonTheme
import androidx.compose.ui.tooling.preview.Preview as Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LittleLemonTheme {
                MainComponent()
            }
        }
    }

}

@Composable
fun MainComponent(){
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0XFF495E57))

    ) {
        Text(
            text = stringResource(id = R.string.title),
            fontSize = 32.sp,
            color = Color(0XFFF4CE14),
            modifier = Modifier.padding(start = 20.dp, top = 20.dp),


        )
        Text(
            text = stringResource(id = R.string.city),
            fontSize = 24.sp,
            color = Color(0XFFFFFFFF),
            modifier = Modifier.padding(start = 20.dp)

        )
        Row(
            Modifier
                .fillMaxWidth()
                .padding(start = 20.dp),
            horizontalArrangement = Arrangement.Start

        )
        {
            
            Text(
                text = stringResource(id = R.string.descriptionOne),
                Modifier.width(200.dp),
                color = Color.White,
                fontSize = 21.sp
            )
            Image(
                painter = painterResource(id = R.drawable.restaurantfood) ,
                contentDescription ="Main Image",
                Modifier
                    .height(200.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .fillMaxSize()
            )

        }
            Button(

                onClick = { /*TODO*/ },
                Modifier.padding(start = 20.dp),
                colors = ButtonDefaults.buttonColors(Color(0XFFF4CE14)),
                shape = RoundedCornerShape(10.dp)
            ) {
                Text(

                    text = stringResource(id = R.string.order),
                    color = Color.Black
                )
            }


    }

}
@Preview
@Composable
fun MaincomponentPreview() {
    MainComponent()
}