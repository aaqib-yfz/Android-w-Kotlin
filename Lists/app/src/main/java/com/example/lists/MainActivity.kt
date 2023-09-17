package com.example.lists

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
          Row(
              modifier = Modifier
                  .fillMaxWidth()

          ){
              category.forEach{
                  MenuCategories(category = it)
              }
          }
        }
    }
}

@Composable
fun MenuCategories(category : String){
    Button(
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(Color.Gray),
        modifier = Modifier.padding(5.dp),
        shape = RoundedCornerShape(40.dp)
    )
    {
           Text(
               text = category
           )
    }
}

@Preview(showBackground = true)
@Composable
fun MenuCategoriesPreview(){
    MenuCategories("x")
}




val category = listOf<String>(
    "Break Fast",
    "Lunch",
    "Dinner",
    "Break Fast",
    "Lunch",
    "Dinner"
)