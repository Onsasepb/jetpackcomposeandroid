package com.example.newwe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.newwe.ui.theme.NewweTheme
import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

//To show the design on your phone

            Text()
        }
    }
}

@Composable
fun Text(){
//To fill the entire display area
    Column(modifier = Modifier.paint(
        painterResource(id = R.drawable.background),
        contentScale = ContentScale.FillBounds
    )
        .
        fillMaxSize()) {
        val mContext = LocalContext.current

//First Heading

        Text(text = "Welcome to Android",
            fontSize = 30.sp,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            modifier = Modifier
                .background(Color.Black)
                .fillMaxWidth(),
            textAlign = TextAlign.Center)

//End of first heading

        Text(text = "It entails creating mobile" +
                " applications for android devices",
            color = Color.Blue)
//How to add a space

        Spacer(modifier = Modifier.height(10.dp))

//End

//Start of first sub-heading

        Text(text = "Types of cars",
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()

//How to add a background color

                .background(Color.Black)
                .height(40.dp),

//end background color

            textAlign = TextAlign.Center,
            fontStyle = FontStyle.Italic,

//Underline

            textDecoration = TextDecoration.Underline

//End

        )

//End of First Sub-heading

        Text(text ="1.Land cruiser prado",
            color = Color.Blue)
        Text(text ="2.Ferrari",
            color = Color.Blue)
        Text(text ="3.Mercedes",
            color = Color.Blue)
        Spacer(modifier = Modifier.height(10.dp))

//Start of Button

//Centering a Button

        Box(modifier = Modifier
            .fillMaxWidth(),
            contentAlignment = Alignment.Center) {

//End of Centering

            Button(onClick = {
                mContext.startActivity(Intent(mContext,DestinationActivity::class.java))
            },
                shape = CircleShape,
                colors = ButtonDefaults.buttonColors(Color.Blue)
            ) {
                androidx.compose.material3.
                Text(text = "Destination",
                    color = Color.Black)

            }


        }

//End of Button

//Start of Second sub-heading
        Text(text = "Types of Books",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            color = Color.White,
            fontStyle = FontStyle.Italic,
            textDecoration = TextDecoration.Underline,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black))
        //End of second Sub-heading

        Text(text = "1.Thriller",
            color = Color.Blue)
        Text(text = "2.Mystery",
            color = Color.Blue)
        Text(text = "3.Fantasy",
            color = Color.Blue)
        Text(text = "4.sci-fi",
            color =Color.Blue)
        Text(text = "5.Fiction",
            color = Color.Blue)
        Spacer(modifier = Modifier.height(10.dp))
        //How to add a Horizontal Rule
        Divider( color = Color.Black )

        //centering an image
        Box (modifier = Modifier
            .fillMaxWidth(),
            contentAlignment = Alignment.Center){
            Image(painter = painterResource(id = R.drawable.aaaa) ,
                contentDescription ="",
                modifier = Modifier
                    .size(200.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop)
        }
        //End of Image

        Spacer(modifier = Modifier.height(10.dp))

        //Start of Button

        Button(
            onClick = { mContext.startActivity(Intent(mContext,LayoutActivity::class.java)) },
            shape = CircleShape,
            colors = ButtonDefaults.buttonColors(Color.Blue),
            modifier = Modifier
                .padding(start = 30.dp, end = 30.dp)
                .fillMaxWidth()
        ) {
            androidx.compose.material3.
            Text(text = "Continue",
                color = Color.Black)
        }
        //End of Button

    }
}


@Preview(showBackground = true)
@Composable
fun TextPreview(){

    //To show the preview

    Text()

}