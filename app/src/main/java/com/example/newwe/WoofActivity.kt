package com.example.newwe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newwe.ui.theme.NewweTheme

class WoofActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Woof()
        }
    }
}

@Composable

fun Woof(){
    Column (modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState()))
    {
        val mContext = LocalContext.current
        Box (modifier = Modifier.padding(start = 130.dp)){
            Row(horizontalArrangement = Arrangement.Center) {
                Image(
                    painter = painterResource(id = R.drawable.dogm),
                    contentDescription = "",
                    modifier = Modifier
                        .size(50.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop
                )

                Text(
                    text = "Woof",
                    fontSize = 30.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.ExtraBold,
                    textAlign = TextAlign.Center
                )
            }

        }
        //Card 1
        Card (
            modifier = Modifier
                .height(70.dp)
                .width(500.dp),
            shape = RoundedCornerShape(topEnd = 20.dp, bottomStart = 20.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.LightGray)

        ){
            Row (
                modifier = Modifier.padding(top = 10.dp)
            ){

                Image(painter = painterResource(id = R.drawable.german) ,
                    contentDescription ="",
                    modifier = Modifier
                        .size(50.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop)
                Spacer(modifier = Modifier.width(5.dp))
                Column {
                    Text(
                        text = "Koda",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black)
                    Text(
                        text = "2 years old",
                        color = Color.Black
                    )
                }
            }
        }

//Card 1 end
        Spacer(modifier = Modifier.height(10.dp))
//Card 2 Start
        Card (
            modifier = Modifier
                .height(70.dp)
                .width(500.dp),
            shape = RoundedCornerShape(topEnd = 20.dp, bottomStart = 20.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.LightGray)

        ){
            Row (
                modifier = Modifier.padding(top = 10.dp)
            ){

                Image(painter = painterResource(id = R.drawable.doga) ,
                    contentDescription ="",
                    modifier = Modifier
                        .size(50.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop)
                Spacer(modifier = Modifier.width(5.dp))
                Column {
                    Text(
                        text = "Lola",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black)
                    Text(
                        text = "16 years old",
                        color = Color.Black
                    )
                }
            }
        }

//Card 2 end
        Spacer(modifier = Modifier.height(10.dp))
//Card 3 Start
        Card (
            modifier = Modifier
                .height(70.dp)
                .width(500.dp),
            shape = RoundedCornerShape(topEnd = 20.dp, bottomStart = 20.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.LightGray)

        ){
            Row (
                modifier = Modifier.padding(top = 10.dp)
            ){

                Image(painter = painterResource(id = R.drawable.dogb) ,
                    contentDescription ="",
                    modifier = Modifier
                        .size(50.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop)
                Spacer(modifier = Modifier.width(5.dp))
                Column {
                    Text(
                        text = "Frankie",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black)
                    Text(
                        text = "2 years old",
                        color = Color.Black
                    )
                }
            }
        }

//Card 3 end
        Spacer(modifier = Modifier.height(10.dp))
//Card 4 Start
        Card (
            modifier = Modifier
                .height(70.dp)
                .width(500.dp),
            shape = RoundedCornerShape(topEnd = 20.dp, bottomStart = 20.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.LightGray)

        ){
            Row (
                modifier = Modifier.padding(top = 10.dp)
            ){

                Image(painter = painterResource(id = R.drawable.dogc) ,
                    contentDescription ="",
                    modifier = Modifier
                        .size(50.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop)
                Spacer(modifier = Modifier.width(5.dp))
                Column {
                    Text(
                        text = "Nox",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black)
                    Text(
                        text = "8 years old",
                        color = Color.Black
                    )
                }
            }
        }

//Card 4 end
        Spacer(modifier = Modifier.height(10.dp))
//Card 5 Start
        Card (
            modifier = Modifier
                .height(70.dp)
                .width(500.dp),
            shape = RoundedCornerShape(topEnd = 20.dp, bottomStart = 20.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.LightGray)

        ){
            Row (
                modifier = Modifier.padding(top = 10.dp)
            ){

                Image(painter = painterResource(id = R.drawable.dogd) ,
                    contentDescription ="",
                    modifier = Modifier
                        .size(50.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop)
                Spacer(modifier = Modifier.width(5.dp))
                Column {
                    Text(
                        text = "Faye",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black)
                    Text(
                        text = "8 years old",
                        color = Color.Black
                    )
                }
            }
        }

//Card 5 end
        Spacer(modifier = Modifier.height(10.dp))
//Card 6 Start
        Card (
            modifier = Modifier
                .height(70.dp)
                .width(500.dp),
            shape = RoundedCornerShape(topEnd = 20.dp, bottomStart = 20.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.LightGray)

        ){
            Row (
                modifier = Modifier.padding(top = 10.dp)
            ){

                Image(painter = painterResource(id = R.drawable.doge) ,
                    contentDescription ="",
                    modifier = Modifier
                        .size(50.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop)
                Spacer(modifier = Modifier.width(5.dp))
                Column {
                    Text(
                        text = "bella",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black)
                    Text(
                        text = "14 years old",
                        color = Color.Black
                    )
                }
            }
        }

//Card 6 end
        Spacer(modifier = Modifier.height(10.dp))
//Card 7 Start
        Card (
            modifier = Modifier
                .height(70.dp)
                .width(500.dp),
            shape = RoundedCornerShape(topEnd = 20.dp, bottomStart = 20.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.LightGray)

        ){
            Row (
                modifier = Modifier.padding(top = 10.dp)
            ){

                Image(painter = painterResource(id = R.drawable.doga) ,
                    contentDescription ="",
                    modifier = Modifier
                        .size(50.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop)
                Spacer(modifier = Modifier.width(5.dp))
                Column {
                    Text(
                        text = "Moana",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black)
                    Text(
                        text = "2 years old",
                        color = Color.Black
                    )
                }
            }
        }

//Card 7 end
        Spacer(modifier = Modifier.height(10.dp))
//Card 8 Start
        Card (
            modifier = Modifier
                .height(70.dp)
                .width(500.dp),
            shape = RoundedCornerShape(topEnd = 20.dp, bottomStart = 20.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.LightGray)

        ){
            Row (
                modifier = Modifier.padding(top = 10.dp)
            ){

                Image(painter = painterResource(id = R.drawable.dogb) ,
                    contentDescription ="",
                    modifier = Modifier
                        .size(50.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop)
                Spacer(modifier = Modifier.width(5.dp))
                Column {
                    Text(
                        text = "tzeitel",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black)
                    Text(
                        text = "7 years old",
                        color = Color.Black
                    )
                }
            }
        }

//Card 9 end
        Spacer(modifier = Modifier.height(10.dp))
//Card 2 Start
        Card (
            modifier = Modifier
                .height(70.dp)
                .width(500.dp),
            shape = RoundedCornerShape(topEnd = 20.dp, bottomStart = 20.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.LightGray
            )


        ){
            Row (
                modifier = Modifier.padding(top = 10.dp)
            ){

                Image(painter = painterResource(id = R.drawable.aaaa) ,
                    contentDescription ="",
                    modifier = Modifier
                        .size(50.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop)
                Spacer(modifier = Modifier.width(5.dp))
                Column {
                    Text(
                        text = "Koda",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black)
                    Text(
                        text = "2 years old",
                        color = Color.Black
                    )
                }
            }
        }

//Card 1 end


    }

}
@Preview(showBackground = true)
@Composable
fun woofpreview(){
    Woof()
}
